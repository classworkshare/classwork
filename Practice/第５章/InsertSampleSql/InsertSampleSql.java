import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSampleSql {
	static final String URL = "jdbc:mysql://localhost/gradedb?useSSL=false&serverTimezone=JST";
	static final String USERNAME = "user"; // ���[�U�� �F���ɍ��킹�ݒ�
	static final String PASSWORD = "password"; // �p�X���[�h�F���ɍ��킹�ݒ�

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {
			String sql = "INSERT INTO english (studentno, studentname, score)" + " VALUES (1006, '�ē��Q��', 100);";
			int result = statement.executeUpdate(sql);
			System.out.println("�}�������F" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}