public class Kenji implements Stroke1 {
	
	public void crawl() {
		System.out.print("����̓N���[�������ӂł��B");
		System.out.println(distance + "���j���܂����B");
	}
	
	public void breaststroke() {
		System.out.print("����͕��j�������ł��B");
		System.out.println(distance / 4 + "���j���܂����B");
	}
	
	public void backstroke() {
		System.out.print("����͔w�j�������ӂł��B");
		System.out.println(distance + "���j���܂����B");
	}
	
	public void butterfly() {
		System.out.print("����̓o�^�t���C�����ł��B");
		System.out.println(distance / 4 + "���j���܂����B");
	}
}