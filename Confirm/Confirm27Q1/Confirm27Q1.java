import java.util.ArrayList;

public class Confirm27Q1{
	
	static String USERNAME = null;   // ���[�U��
	static String PASSWORD = null;   // �p�X���[�h
	
	public static void main(String[] args){
		ArrayList<Student> result = new ArrayList<Student>();
		DBSelect  sqlSelect = new DBSelect();
		
		GetParam getParam = new GetParam();
		USERNAME = getParam.getKeyin(" ���[�U��    : ");
		PASSWORD = getParam.getKeyin(" �p�X���[�h  : ");
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