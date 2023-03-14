import org.springframework.stereotype.Service;

@Service
public class GithubActivationService {

    public boolean validateGithubCredentials(String username, String password) {
        // Validate credentials
        return true;
    }

    public List<String> getGithubRepositories(String username) {
        // Fetch list of repositories
        return new ArrayList<>();
    }

    public void displayError(String message) {
        // Display the error message
    }
}