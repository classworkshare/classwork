import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class SelectSampleSql {
	static final String URL = "jdbc:mysql://localhost/gradedb?useSSL=false&serverTimezone=JST";
	static final String USERNAME = "user"; // ユーザ名 ：環境に合わせ設定
	static final String PASSWORD = "password"; // パスワード：環境に合わせ設定

	public static void main(String[] args) {
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