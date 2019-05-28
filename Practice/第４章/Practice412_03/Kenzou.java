public class Kenzou implements Stroke1 {
	
	public void crawl() {
		System.out.print("健三はクロールが苦手です。");
		System.out.println(distance / 4 + "ｍ泳ぎました。");
	}
	
	public void breaststroke() {
		System.out.print("健三は平泳ぎが得意です。");
		System.out.println(distance + "ｍ泳ぎました。");
	}
	
	public void backstroke() {
		System.out.print("健三は背泳ぎが苦手です。");
		System.out.println(distance / 4 + "ｍ泳ぎました。");
	}
	
	public void butterfly() {
		System.out.print("健三はバタフライが得意です。");
		System.out.println(distance + "ｍ泳ぎました。");
	}
}