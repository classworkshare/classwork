public class Confirm12Q1 {
	
	public static void main(String[] args) {
		VariableCheck instA, instB;
		int i;
		
		instA = new VariableCheck();
		instB = new VariableCheck();
		
		for (i = 0; i < 50; i++) {
			instA.plus();
			instB.minus();
		}
		
		System.out.println("�v���X���̃N���X�ϐ��@�@�@�@�@�@�F" + instA.classVariable);
		System.out.println("�v���X���̃C���X�^���X�ϐ��@�@�@�F" + instA.instanceVariable);
		System.out.println("�}�C�i�X���̃N���X�ϐ��@�@�@�@�@�F" + instB.classVariable);
		System.out.println("�}�C�i�X���̃C���X�^���X�ϐ��@�@�F" + instB.instanceVariable);
	}
}