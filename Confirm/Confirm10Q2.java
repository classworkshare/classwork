public class Confirm10Q2 {
	
	public static void main(String[] args) {
		int num = 100;
		int result;
		Confirm10Q2 instA;
		
		instA = new Confirm10Q2();
		
		result = instA.duplicate(num);
		System.out.println("�n�������l[" + num + "]�̔{����" + result);
		result = instA.triplicate(num);
		System.out.println("�n�������l[" + num + "]�̂R�{�̐���" + result);
	}
	
	public int duplicate(int num) {
		return (num * 2);
	}
	
	public int triplicate(int num) {
		return (num * 3);
	}
}