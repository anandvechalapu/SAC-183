@RestController
@RequestMapping("/github")
public class GithubActivationController {
 
    @PostMapping("/activation")
    public ResponseEntity<Object> activateGithub(@RequestBody GithubCredentials githubCredentials) {
       
        // Validate the Github credentials
        boolean isValidCredentials = validateGithubCredentials(githubCredentials);
       
        if(isValidCredentials) {
            // Connect to Github
            List<GithubRepository> repositories = connectToGithub(githubCredentials);
           
            // Return the list of repositories
            return ResponseEntity.ok().body(repositories);
        } else {
            // Return an error message
            return ResponseEntity.badRequest().body("Invalid Github credentials");
        }
    }
 
    private boolean validateGithubCredentials(GithubCredentials githubCredentials) {
        // Validate the Github credentials
    }
   
    private List<GithubRepository> connectToGithub(GithubCredentials githubCredentials) {
        // Connect to Github
    }
}