import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Practice506_04 {
	public static void main(String[] args) {
		HashMap<Integer, String> data = new HashMap<>();
		int[] length = { 143, 194, 213, 322, 367, 249, 268 };
		String[] name = { "�}���", "�]�̐�", "�V����", "������", "�M�Z��", "�ŏ��", "�Ύ��" };
		
		// HashMap�Ƀf�[�^��ǉ�����
		for (int i = 0; i < length.length; i++) {
			data.put(length[i], name[i]);
		}
		
		// �L�[�l���w�肵�ăf�[�^���擾����
		System.out.println("�L�[�F" + 213);
		System.out.println("�l�@�F" + data.get(213));
		System.out.println(); // ���s
		
		// �C�e���[�^�𗘗p���S���\������
		System.out.println("���S���\����");
		Iterator it = data.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry set = (Map.Entry) it.next();
			System.out.println(set.getValue() + "\t" + set.getKey() + "km");
		}
	}
}