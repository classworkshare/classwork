import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSampleSql {
	static final String URL = "jdbc:mysql://localhost/gradedb?useSSL=false&serverTimezone=JST";
	static final String USERNAME = "user"; // ユーザ名 ：環境に合わせ設定
	static final String PASSWORD = "password"; // パスワード：環境に合わせ設定

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {
			String sql = "DELETE FROM ENGLISH WHERE STUDENTNO=1006";
			int result = statement.executeUpdate(sql);
			System.out.println("削除件数：" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}