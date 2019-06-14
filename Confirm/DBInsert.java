import java.sql.*;

public class DBInsert{
	static final String URL = "jdbc:mysql://localhost/gradedb?useSSL=false&serverTimezone=JST";
	
	public void insert(String USERNAME, String PASSWORD, Student student){
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {
			String sql = "INSERT INTO english (studentno, studentname, score)" 
					+ " VALUES (" + student.getNumber() + ", '" + student.getName() 
					+ "', " + student.getScore() + ");";
			int result = statement.executeUpdate(sql);
			System.out.println("ë}ì¸åèêîÅF" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}