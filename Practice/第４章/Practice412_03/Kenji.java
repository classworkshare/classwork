public class Kenji implements Stroke1 {
	
	public void crawl() {
		System.out.print("健二はクロールが得意です。");
		System.out.println(distance + "ｍ泳ぎました。");
	}
	
	public void breaststroke() {
		System.out.print("健二は平泳ぎが苦手です。");
		System.out.println(distance / 4 + "ｍ泳ぎました。");
	}
	
	public void backstroke() {
		System.out.print("健二は背泳ぎが得意です。");
		System.out.println(distance + "ｍ泳ぎました。");
	}
	
	public void butterfly() {
		System.out.print("健二はバタフライが苦手です。");
		System.out.println(distance / 4 + "ｍ泳ぎました。");
	}
}