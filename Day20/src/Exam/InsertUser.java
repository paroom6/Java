package Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUser {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		//sql문을 데이터베이스로 보내기 위한 객체
		PreparedStatement pstmt = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/userdb";
		String id = "hr";
		String pwd = "hr";
		
		//url, id, pwd로 connection 객체를 생성
		conn =  DriverManager.getConnection(url, id, pwd);
		//Statement 객체는 Statement 인터페이스를 구현한 객체를 
		//Connection 클래스의 createStatement 메소드를 호출함으로써 얻어진다.
		String sql = "insert into user(user_id, user_pw) values(?, ?)";
		try {
			// JDBC 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
			//PreParedStatement 객체 생성, 객체생성시 sql문 저장
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "zzpp");
			pstmt.setString(2, "rrrr");
			// 쿼리 실행하고 결과를 리턴
			// sql문 실행후 변경된 row와 col을 int타입으로 리턴
			int result = pstmt.executeUpdate();
			System.out.println("변경된 row : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
