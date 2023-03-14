import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/github-activation")
public class GithubActivationController {
 
    @RequestMapping("/connect")
    public String connectGithub(@RequestParam("username") String username, @RequestParam("password") String password, RedirectAttributes redirectAttributes) {
        // Validate Github credentials
        String message = "Invalid credentials";
        if (isValidCredentials(username, password)) {
            // Connect to Github
            message = "Connected to Github successfully";
        } else {
            redirectAttributes.addFlashAttribute("message", message);
        }
        return message;
    }
 
    @RequestMapping("/list")
    public List<String> listGithubRepositories() {
        // Get list of Github repositories
        List<String> repositories = getGithubRepositories();
        return repositories;
    }
 
    private boolean isValidCredentials(String username, String password) {
        // Validate Github credentials
        return true;
    }
 
    private List<String> getGithubRepositories() {
        // Get list of Github repositories
        List<String> repositories = new ArrayList<>();
        return repositories;
    }
}