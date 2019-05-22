import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSampleSql {
	static final String URL = "jdbc:mysql://localhost/gradedb?useSSL=false&serverTimezone=JST";
	static final String USERNAME = "user"; // ユーザ名 ：環境に合わせ設定
	static final String PASSWORD = "password"; // パスワード：環境に合わせ設定

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {
			String sql = "INSERT INTO english (studentno, studentname, score)" + " VALUES (1006, '夏日漸石', 100);";
			int result = statement.executeUpdate(sql);
			System.out.println("挿入件数：" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}