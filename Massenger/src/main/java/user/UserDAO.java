package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
    public UserDAO() {  //기본생성자. 중복되는 것들을 기본생성자 메소드에 넣어두번 매번 같은 코드를 입력할 필요가 없음
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
    
    public int login(String userID, String userPassword) {
        String SQL = "SELECT userPassword FROM USER WHERE userID = ?";
        
        try {
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, userID);
            rs = pstmt.executeQuery();
            
            if(rs.next()) {
                if(rs.getString(1).equals(userPassword)) {
                    return 1;  //로그인 성공
                } else {
                    return 0;  //비밀번호 불일치
                }
            }
            return -1;  //아이디 없음
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -2;  //데이터 베이스 오류
    }
}
