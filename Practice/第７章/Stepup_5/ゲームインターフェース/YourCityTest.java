import pack1.SmartphoneGame1;
import pack1.SmartphoneGame2;

/**
 * @author You
 *
 *         �ˋ�̋��Z��ԃN���X�i�Q�[���t���X�}�[�g�t�H���Ή��j
 */
public class YourCityTest {
	/**
	 * main���\�b�h
	 */
	public static void main(String[] args) {
		SmartphoneGame1	 he;
		SmartphoneGame2	 she;
		int				 i;
		
		he = new SmartphoneGame1("���Y", "080-0000-0000", "XXX@xxx.ne.jp"); // �Q�[���t���X���[�g�t�H������
		she = new SmartphoneGame2("�Ԏq", "090-0000-0000", "ZZZ@zzz.ne.jp");
		
		for (i = 0; i < 2; i++) {
			he.call(); 								// he�̓d�b���Q�񂩂���
		}
		
		for (i = 0; i < 2; i++) {
			he.mail(); 								// he�̃��[�����Q����{
		}
		
		for (i = 0; i < 2; i++) {
			he.playGame(); 							// he�̃Q�[���łQ��V��
		}
		
		for (i = 0; i < 3; i++) {
			she.call(); 							// she�̓d�b���R�񂩂���
		}
		
		for (i = 0; i < 3; i++) {
			she.mail(); 							// she�̃��[�����R����{
		}
		
		for (i = 0; i < 3; i++) {
			she.playGame(); 						// she�̃Q�[���łR��V��
		}
		
		System.out.println("�C���X�^���X[he]�̏�� �F " + he.MAKER + " " + he.getModel() + " " + he.getContract() + " "
				+ he.getTelNum() + " " + he.getPrice() + " " + he.getMailAddress() + " " + he.getPacketPrice());
		System.out.println("�C���X�^���X[she]�̏��F " + she.MAKER + " " + she.getModel() + " " + she.getContract() + " "
				+ she.getTelNum() + " " + she.getPrice() + " " + she.getMailAddress() + " " + she.getPacketPrice());
	}
}