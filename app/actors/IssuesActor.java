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
import model.ListRepoDetails;

public class IssuesActor extends AbstractActor {

	private final ActorRef webSocket;
	private final WSClient ws;
	private String url;
	
	public IssuesActor(final WSClient ws, final ActorRef webSocket) {
    	this.ws =  ws;
    	this.webSocket =  webSocket;
    }

	public static Props props(final WSClient ws, final ActorRef webSocket) {
		return Props.create(IssuesActor.class, ws, webSocket);
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
		return receiveBuilder().match(PushNewData.class, pd -> populateIssues())
				.match(ObjectNode.class, searchObject -> {
					url = searchObject.get("uri").textValue();
					populateIssues();
				}).build();
	}

	private void populateIssues() {
		System.out.println("url is --------" + url);
		ws.url(url).addHeader("Authorization", "token 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")
				.get().thenAcceptAsync(res -> {
					List<ListRepoDetails> repoDetails = StreamSupport
							.stream(res.asJson().spliterator(), false)
							.map(item -> new ListRepoDetails(item.get("title").asText(), item.get("url").asText()))
							.collect(Collectors.toList());
					JsonNode json = Json.toJson(repoDetails);
					ObjectNode obj = Json.newObject();
					obj.putPOJO("data", json);
					
					webSocket.tell(obj, self());
				});
	}
}