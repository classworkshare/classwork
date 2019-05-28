public class Confirm11Q1 {
	
	public static void main(String[] args) {
		int result;
		CalcNomal instA;
		
		instA = new CalcNomal();
		
		result = instA.add(100, 50);
		System.out.println("Nomal‚Ì‰ÁZŒ‹‰Ê F" + result);
		
		result = CalcStatic.add(100, 50);
		System.out.println("Static‚Ì‰ÁZŒ‹‰ÊF" + result);
		
		result = instA.subtract(100, 50);
		System.out.println("Nomal‚ÌŒ¸ZŒ‹‰Ê F" + result);
		
		result = CalcStatic.subtract(100, 50);
		System.out.println("Static‚ÌŒ¸ZŒ‹‰ÊF" + result);
	}
}