import java.util.ArrayList;

public class Confirm27Q1{
	
	static String USERNAME = null;   // ユーザ名
	static String PASSWORD = null;   // パスワード
	
	public static void main(String[] args){
		ArrayList<Student> result = new ArrayList<Student>();
		DBSelect  sqlSelect = new DBSelect();
		
		GetParam getParam = new GetParam();
		USERNAME = getParam.getKeyin(" ユーザ名    : ");
		PASSWORD = getParam.getKeyin(" パスワード  : ");
		System.out.println();
		
		result = sqlSelect.selectAll(USERNAME,PASSWORD);
		
		for(int i = 0;i<result.size();i++){
			Student inst;
			inst = result.get(i);
			System.out.print(inst.getNumber() + "\t");
			System.out.print(inst.getName() + "\t");
			System.out.println(inst.getScore());
		}
	}
}