public class Confirm15Q1 {
	
	public static void main(String[] args) {
		Sparrow instSparrow;
		Penguin instPenguin;
		
		instSparrow = new Sparrow();
		instPenguin = new Penguin();
		
		System.out.println("スズメは");
		instSparrow.move();
		instSparrow.eat();
		
		System.out.println("ペンギンは");
		instPenguin.move();
		instPenguin.eat();
	}
}