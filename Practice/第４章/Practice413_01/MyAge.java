public class MyAge {
	
	int age; //年齢
	String name; //名前
	
	public MyAge() {
		age = 20;
		name = "学園太郎";
	}
	
	public void showAge() {
		System.out.println(name + "です。" + age + "歳です。");
	}
}