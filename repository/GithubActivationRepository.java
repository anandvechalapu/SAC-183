@Repository
public class GithubActivationRepository {
  
    public boolean validateGithubCredentials(String username, String password) {
        //validate the Github credentials 
        return true;
    }

    public List<String> getGithubRepositories(String username, String password) {
        // retrieves a list of the user's Github repositories
        List<String> repositories = new ArrayList<>();
        return repositories;
    }

    public String displayErrorMessage() {
        // display an error message if the user has entered invalid Github credentials
        String errorMessage = "Invalid username or password!";
        return errorMessage;
    }

}