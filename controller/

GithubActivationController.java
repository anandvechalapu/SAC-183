

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubActivationController {

    @PostMapping("/github/activation")
    public String activateGithub(@RequestBody GithubCredentials credentials) {
        if (validateCredentials(credentials)) {
            // Connect to Github and return list of repositories
            return "Github repositories list";
        } else {
            return "Invalid Github credentials";
        }
    }

    private boolean validateCredentials(GithubCredentials credentials) {
        // Validate the credentials
        return true;
    }
}