public class Confirm22Q1 {
	
	public static void main(String[] args) {
		Empl1 instA;
		
		instA = new Empl1(1, "営業部", "ＳＣＣ二郎", 200000);
		
		System.out.println("社員番号　[" + instA.emplNo + "]");
		System.out.println("部署名　　[" + instA.depart + "]");
		System.out.println("名前　　　[" + instA.name + "]");
		System.out.println("基本給　　[" + instA.salary + "]");
	}
}