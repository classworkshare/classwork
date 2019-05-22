import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class UpdateSampleSql {
	static final String URL = "jdbc:mysql://localhost/gradedb?useSSL=false&serverTimezone=JST";
	static final String USERNAME = "user"; // ユーザ名 ：環境に合わせ設定
	static final String PASSWORD = "password"; // パスワード：環境に合わせ設定

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {
			String sql = "UPDATE ENGLISH SET STUDENTNAME='式部みどり' " + "WHERE STUDENTNO=1006";
			int result = statement.executeUpdate(sql);
			System.out.println("更新件数：" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}