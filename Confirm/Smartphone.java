public class Smartphone extends Phone implements Music {
	
	public String address; 	//メールアドレス
	
	public void mail() {
		System.out.println("メールできます。");
	}
	
	public void listen() {
		System.out.println("音楽が聴けます。");
	}
}