public class Practice411_01 {
	public static void main(String[] args) {
		
		int sum;
		int i = 1, j = 10;
		
		Calc1 calc1 = new Calc1();
		Calc2 calc2 = new Calc2();
		
		System.out.println(i + "����" + j + "�̘a");
		System.out.print("�v�Z�P�F");
		sum = calc1.add(i, j);
		
		System.out.println(sum);
		System.out.print("�v�Z�Q�F");
		sum = calc2.add(i, j);
		
		System.out.println(sum);
	}
}