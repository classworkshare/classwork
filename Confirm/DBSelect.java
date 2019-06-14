import java.sql.*;
import java.util.ArrayList;

public class DBSelect{
	
	static final String URL = "jdbc:mysql://localhost/gradedb?useSSL=false&serverTimezone=JST";
	
	ArrayList<Student> selectAll(String USERNAME, String PASSWORD){
		ArrayList<Student> listRet = null;
		int       score = 0;
		String    number,name;
		listRet = new ArrayList<Student>();
		
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement stmt = connection.createStatement(); ){
			String sql = "SELECT * FROM ENGLISH";
			ResultSet rslt = stmt.executeQuery(sql);
			while(rslt.next()){
				number = rslt.getString("STUDENTNO");
				name = rslt.getString("STUDENTNAME");
				score = rslt.getInt("SCORE");
				listRet.add(new Student(number,name,score));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listRet;
	}
}