package user;

import javax.servlet.http.HttpServletRequest;

public class parameter {
    public static void userID(HttpServletRequest request) {
        String ID = request.getParameter("userID");
        System.out.println("userID : " + ID);
    }
}
