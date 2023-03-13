User Story:
As a user, I want to be able to create a new account so that I can access the system.

public class Account {
    private String username;
    private String password;

    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void createAccount(){
        // Code to create a new account
    }
}