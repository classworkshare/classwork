import java.sql.*;
import java.util.*;

public class SelectSampleSql02 {
	static final String URL = "jdbc:mysql://localhost/gradedb?useSSL=false&serverTimezone=JST";
	static String USERNAME = null; // ユーザ名
	static String PASSWORD = null; // パスワード

	public static void main(String[] args) {
		GetParam getP = new GetParam();
		USERNAME = getP.getKeyin("ユーザ名   : ");
		PASSWORD = getP.getKeyin("パスワード : ");
		System.out.println();
		String sql = "SELECT * FROM ENGLISH";

		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery(sql);) {
			while (result.next()) {
				System.out.print(result.getInt("STUDENTNO") + "\t");
				System.out.print(result.getString("STUDENTNAME") + "\t");
				System.out.println(result.getInt("SCORE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}