

@RestController
@RequestMapping("/github-activation")
public class GithubActivationController {
    
    @PostMapping
    public ResponseEntity<Object> activateGithub(@RequestBody GithubCredentials credentials) {
        // Validate user credentials
        if (credentials.isValid()) {
            // Connect to Github and get list of repositories
            List<Repository> repositories = GithubService.getRepositories(credentials);
            return ResponseEntity.ok().body(repositories);
        } else {
            // Return error message if credentials are invalid
            return ResponseEntity.badRequest().body("Invalid Github credentials");
        }
    }
}