

@Repository
public class GithubActivationRepository {

  private EntityManager entityManager;
  
  public GithubActivationRepository(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  public boolean validateGithubCredentials(String username, String password) {
    // Validation logic goes here
    return true;
  }
  
  public List<GithubRepository> getGithubRepositories(String username) {
    // Fetching logic goes here
    return new ArrayList<>();
  }

}