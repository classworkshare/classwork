import Empl2;

public class Confirm22Q2 {
	
	public static void main(String[] args) {
		Empl2 instA;
		
		instA = new Empl2(1, "営業部", "ＳＣＣ二郎", 200000);
		
		System.out.println("社員番号　[" + instA.getEmplNo() + "]");
		System.out.println("部署名　　[" + instA.getDepart() + "]");
		System.out.println("名前　　　[" + instA.getName() + "]");
		System.out.println("基本給　　[" + instA.getSalary() + "]");
	}
}