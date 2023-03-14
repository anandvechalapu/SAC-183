import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubController {

    @GetMapping("/github/activation")
    public String getGithubActivation() {
        return "Github activation page";
    }

    @PostMapping("/github/activation")
    public String activateGithub(@RequestBody GithubCredentials credentials) {
        if (validateCredentials(credentials)) {
            return "Github activated successfully";
        } else {
            return "Invalid Github credentials";
        }
    }

    @GetMapping("/github/repositories")
    public String getGithubRepositories() {
        return "List of Github repositories";
    }

    private boolean validateCredentials(GithubCredentials credentials) {
        // logic to validate the Github credentials
        return true;
    }
}

class GithubCredentials {
    private String username;
    private String password;

    // getters and setters
}