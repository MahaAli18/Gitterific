package actors;

import models.*;
import play.libs.Json;
import play.libs.ws.*;
import services.*;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import actors.TimeActor.PushNewData;
import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.AbstractActor.Receive;
import model.ListRepositories;
import model.Repository;

public class RepositoryActor extends AbstractActor {
	
	private final ActorRef webSocket;
	private final WSClient ws;
	private String url;
	
	public RepositoryActor(final WSClient ws, final ActorRef webSocket) {
    	this.ws =  ws;
    	this.webSocket =  webSocket;
    }

	public static Props props(final WSClient ws, final ActorRef webSocket) {
		return Props.create(RepositoryActor.class, ws, webSocket);
	}

	@Override
	public void preStart() {

		context().actorSelection("/user/timeActor/").tell(new TimeActor.RegisterMsg(), self());
	}

	@Override
	public void postStop() {

		context().actorSelection("/user/timeActor/").tell(new TimeActor.DeRegisterMsg(), self());
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder().match(PushNewData.class, pd -> populateRepositories())
				.match(ObjectNode.class, searchObject -> {
					url = searchObject.get("uri").textValue();
					populateRepositories();
				}).build();
	}

	private void populateRepositories() {
		System.out.println("url is --------" + url);
		ws.url(url)
				.get().thenAcceptAsync(res -> {
					List<ListRepositories> repositories = StreamSupport
							.stream(res.asJson().get("items").spliterator(), false)
							.map(items -> new ListRepositories(items.get("owner").get("login").asText(),
									items.get("name").asText(), items.get("url").asText().replaceAll("http.*?\\s", " "),
									items.get("issues_url").asText(), items.get("visibility").asText(),
									items.get("commits_url").asText(), items.get("pulls_url").asText(),
									items.get("description").asText(), items.get("topics")))
							.collect(Collectors.toList());
					JsonNode json = Json.toJson(repositories);
					ObjectNode obj = Json.newObject();
					obj.putPOJO("data", json);

					webSocket.tell(obj, self());
				});
	}
}