import java.util.ArrayList;

public class Confirm27Q2{
	
	static String USERNAME = null;   // ���[�U��
	static String PASSWORD = null;   // �p�X���[�h
	
	public static void main(String[] args){
		ArrayList<Student> result = new ArrayList<Student>();
		DBSelect  sqlSelect = new DBSelect();
		DBInsert  sqlInsert = new DBInsert();
		StudentCreate instCreate = new StudentCreate();
		
		GetParam getParam = new GetParam();
		USERNAME = getParam.getKeyin(" ���[�U��    : ");
		PASSWORD = getParam.getKeyin(" �p�X���[�h  : ");
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