/**
 * 
 * @author kavleen
 *
 */
package services;

import java.util.concurrent.CompletableFuture;

public class IssueService {
	public static CompletableFuture<IssueWordStatistics>  getWordLevelStatistics(final List<Issue> issues) {
	
		
		return supplyAsync (()->{
			
			//Converting issue list into list of strings
			List<String> newList = new ArrayList<>(issues.size());
			for (Issue myissue : issues) { 
				newList.add(String.valueOf(myissue.getTitle())); 
			}
			
			//Splitting words
			List <String> list = Stream.of(newList.toString()).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
		            .collect(Collectors.toList());
			
			//Mapping words with their frequency 
			Map<String, Integer> wordsCountMap = list.stream().map(eachWord -> eachWord)
					.collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
			
			//Sorting the result in descending order
			wordsCountMap = wordsCountMap.entrySet()
					.stream()
					.sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)-> e1, LinkedHashMap::new));
			return new IssueWordStatistics(wordsCountMap);
		});
	}
}
