public class Confirm11Q2 {
	
	public static void main(String[] args) {
		int result, no1, no2;
		CalcNomal instA;
		
		instA = new CalcNomal();
		
		no1 = Integer.parseInt(args[0]);
		no2 = Integer.parseInt(args[1]);
		
		result = instA.add(no1, no2);
		System.out.println("Nomal‚Ì‰ÁZŒ‹‰Ê F" + result);
		
		result = CalcStatic.add(no1, no2);
		System.out.println("Static‚Ì‰ÁZŒ‹‰ÊF" + result);
		
		result = instA.subtract(no1, no2);
		System.out.println("Nomal‚ÌŒ¸ZŒ‹‰Ê F" + result);
		
		result = CalcStatic.subtract(no1, no2);
		System.out.println("Static‚ÌŒ¸ZŒ‹‰ÊF" + result);
	}
}