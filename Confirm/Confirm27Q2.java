import java.util.ArrayList;

public class Confirm27Q2{
	
	static String USERNAME = null;   // ユーザ名
	static String PASSWORD = null;   // パスワード
	
	public static void main(String[] args){
		ArrayList<Student> result = new ArrayList<Student>();
		DBSelect  sqlSelect = new DBSelect();
		DBInsert  sqlInsert = new DBInsert();
		StudentCreate instCreate = new StudentCreate();
		
		GetParam getParam = new GetParam();
		USERNAME = getParam.getKeyin(" ユーザ名    : ");
		PASSWORD = getParam.getKeyin(" パスワード  : ");
		System.out.println();
		
		result = sqlSelect.selectAll(USERNAME, PASSWORD);
		for(Student inst : result){
			System.out.print(inst.getNumber() + "\t");
			System.out.print(inst.getName() + "\t");
			System.out.println(inst.getScore());
		}
		System.out.println();
		
		Student instStudent = instCreate.inputStudent();
		sqlInsert.insert(USERNAME, PASSWORD, instStudent);
		
		System.out.println();
		
		result = sqlSelect.selectAll(USERNAME, PASSWORD);
		for(Student inst : result){
			System.out.print(inst.getNumber() + "\t");
			System.out.print(inst.getName() + "\t");
			System.out.println(inst.getScore());
		}
		System.out.println();
	}
}