public class Swimmer implements Stroke1, Stroke2 {
	
	public void crawl() {
		System.out.println("�N���[����" + distance + "���j���܂����B");
	}
	
	public void breaststroke() {
		System.out.println("���j����" + distance + "���j���܂����B");
	}
	
	public void backstroke() {
		System.out.println("�w�j����" + distance + "���j���ł��܂��B");
	}
	
	public void butterfly() {
		System.out.println("�o�^�t���C��" + distance + "���j����Ƃ����ȁB");
	}
	
	public void dogPaddle() {
		System.out.println("��������" + distance + "���͖����B");
	}
	
	public void synchronizedSwimming() {
		System.out.println("�V���N����" + time + "�����Z�ł����炷������ˁB");
	}
}