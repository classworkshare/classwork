public class Kenzou implements Stroke1 {
	
	public void crawl() {
		System.out.print("���O�̓N���[�������ł��B");
		System.out.println(distance / 4 + "���j���܂����B");
	}
	
	public void breaststroke() {
		System.out.print("���O�͕��j�������ӂł��B");
		System.out.println(distance + "���j���܂����B");
	}
	
	public void backstroke() {
		System.out.print("���O�͔w�j�������ł��B");
		System.out.println(distance / 4 + "���j���܂����B");
	}
	
	public void butterfly() {
		System.out.print("���O�̓o�^�t���C�����ӂł��B");
		System.out.println(distance + "���j���܂����B");
	}
}