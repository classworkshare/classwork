public class Swimmer implements Stroke1, Stroke2 {
	
	public void crawl() {
		System.out.println("クロールで" + distance + "ｍ泳ぎました。");
	}
	
	public void breaststroke() {
		System.out.println("平泳ぎで" + distance + "ｍ泳ぎました。");
	}
	
	public void backstroke() {
		System.out.println("背泳ぎで" + distance + "ｍ泳いでいます。");
	}
	
	public void butterfly() {
		System.out.println("バタフライで" + distance + "ｍ泳げるといいな。");
	}
	
	public void dogPaddle() {
		System.out.println("犬かきで" + distance + "ｍは無理。");
	}
	
	public void synchronizedSwimming() {
		System.out.println("シンクロで" + time + "分演技できたらすごいよね。");
	}
}