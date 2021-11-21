

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.databind.JsonNode;
import model.ListRepoDetails;

/**
 * 
 * @author kavleen
 *
 */
public class StatsFetching {
	ListRepoDetails Stats;

	public StatsFetching() {
		this.Stats = new ListRepoDetails();

	}
	/**
	 * @param Stats
	 */
	public StatsFetching(ListRepoDetails Stats) {
		this.Stats = Stats;
  }
	public List<ListRepoDetails> getStats(JsonNode data) throws InterruptedException, ExecutionException {

		return StreamSupport.stream(data.spliterator(), false)
				.map(item -> new ListRepoDetails(item.get("title").asText(), item.get("url").asText()))
				.collect(Collectors.toList());
	}}
