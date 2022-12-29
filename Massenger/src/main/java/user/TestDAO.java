package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
    public TestDAO() {  //기본생성자. 중복되는 것들을 기본생성자 메소드에 넣어두번 매번 같은 코드를 입력할 필요가 없음
        try {
            String dbURL = "jdbc:mysql://localhost:3306/BBS";  //DB와 연결시켜주는 주소
            String dbID = "root";                              //mysql 계정
            String dbPassword = "tt7546";                      //mysql 비밀번호
            Class.forName("com.mysql.jdbc.Driver");            //jsbc연결 클래스를 String타입으로 불러온다.
            conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int select(String userID) {
        String SQL = "SELECT userID FROM USER";
        
        try {
            pstmt = conn.prepareStatement(SQL);
            rs = pstmt.executeQuery();
            
            if(rs.next()) {
                return 1;
            } else {
                return 2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 3;
    }
    
    public String ID(String userID) {
        String result = null;
        String SQL = "SELECT userID FROM USER";
        
        try {
            pstmt = conn.prepareStatement(SQL);
            rs = pstmt.executeQuery();
            
            if(rs.next()) {
                result = rs.getString(1);
            } else {
                System.out.println("Exception");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("result = " + result);
        return result;
    }
}
