public class Runner {
	String name; //���O
	int dist; //���s����
	
	Runner() {
		name = "Nameless";
		dist = 10;
	}
	
	Runner(String name) {
		this();
		this.name = name;
	}
	
	Runner(String name, int dist) {
		this.name = name;
		this.dist = dist;
	}
	
	public void running() {
		System.out.println(name + "��" + dist + "K������܂����B");
	}
}