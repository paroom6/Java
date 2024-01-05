package Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		//jdbc 드라이버 종류,ip포트번호, db명
		String url = "jdbc:mysql://localhost:3306/userdb";
		String id = "hr";
		String pwd = "hr";
		//자바와 데이터베이스를 연결하기위해 connection  객체를 생성
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//url, id, pwd로 connection 객체를 생성
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결성공!!~~~");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("연결실패....");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			}
		}
		
	}

}
