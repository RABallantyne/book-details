@Component
public class GraphQLDataFetchers {

  private static List<Map<String, String>> books = Arrays.asList(
    ImmutableMap.of("id", "book-1",
    "name","Harry Potter and the Philosopher's Stone",
    "pageCount", "223",
    "authorId", "author-1"),
    ImmutableMap.of("id", "book-2",
    "name", "Moby Dick",
    "pageCount", "635",
    "authorId", "author-2"),
    ImmutableMap.of("id", "book-3",
    "name", "Interview with the vampire",
    "pageCount", "371",
    "authorId", "author-3")
  );

  
  
}
