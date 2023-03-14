@Repository
public interface GithubActivationRepository {

    // Method to validate the Github credentials 
    boolean validateGithubCredentials(String username, String password);

    // Method to connect to Github
    void connectToGithub(String username, String password);

    // Method to retrieve a list of Github repositories
    List<GithubRepository> getGithubRepositories(String username);

    // Method to display an error message if the user enters invalid Github credentials
    void displayErrorMessage(String errorMessage);

}