/**
 * @author You
 *
 *         �ˋ�̋��Z��Ԃ�\�������N���X
 */
class YourCity {
	/**
	 * main���\�b�h
	 */
	public static void main(String[] args) {
		Phone he, she;
		
		he = new Phone("���Y", "000-000-0000"); 	// he�̓d�b����
		she = new Phone("�Ԏq", "111-111-1111"); 	// she�̓d�b����
		
		System.out.println(
				"�C���X�^���X[he]�̏�� �F " + he.MAKER + " " + he.model + " " + he.contract + " " + he.telNum + " " + he.price);
		System.out.println("�C���X�^���X[she]�̏��F " + she.MAKER + " " + she.model + " " + she.contract + " " + she.telNum
				+ " " + she.price);
		
		he.call(); 									// he�̓d�b���Q�񂩂���
		he.call();
		
		she.call(); 								// she�̓d�b���R�񂩂���
		she.call();
		she.call();
		
		System.out.println("�C���X�^���X[he]�̌_��Җ���  " + he.contract + "�ł�");
		System.out.println("�C���X�^���X[he]�̓d�b������  " + he.price + "�ł�");
		System.out.println("�C���X�^���X[she]�̌_��Җ��� " + she.contract + "�ł�");
		System.out.println("�C���X�^���X[she]�̓d�b������ " + she.price + "�ł�");
	}
}