package user;

public class Test {
    private String userID;
    
    public Test() {
        super();
    }
    
    public Test(String userID) {
        super();
        this.userID = userID;
    }
    
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
