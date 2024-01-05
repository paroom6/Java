package Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		//sql문을 데이터베이스로 보내기 위한 객체
		PreparedStatement pstmt = null;
		String driver = "com.mysql.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3306/userdb";
		String id  = "hr";
		String pwd = "hr";
		String sql = "update user set user_id=?, user_pw=? where num = ?";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pwd);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "1q2w3e4r!");
			pstmt.setString(2, "!123456");
			pstmt.setInt(3, 2);
			int result = pstmt.executeUpdate();
			System.out.println("변경된 row : " + result);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
	}

}
