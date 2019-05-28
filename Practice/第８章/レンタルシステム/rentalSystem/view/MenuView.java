package rentalSystem.view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * �@�\�I����ʃN���X
 *
 * �u����Ǘ��v�uDVD�Ǘ��v�u�ݏo�v�u�ԋp�v�uDVD�����v�̊e�@�\��I������B
 * �I������ꍇ�́u�I���v��I������B
 */
public class MenuView extends JFrame implements ActionListener {

	private JButton memberButton = new JButton("����Ǘ�");
	private JButton dvdsButton = new JButton("DVD�Ǘ�");
	private JButton rentalButton = new JButton("�ݏo");
	private JButton giveBackButton = new JButton("�ԋp");
	private JButton searchButton = new JButton("DVD����");
	private JButton exitButton = new JButton("�I��");

	private final String url = "jdbc:mysql://localhost/RentalSystemDB?useSSL=false&serverTimezone=JST";
	private final String userName = "username";
	private final String password = "password";

	/**
	 * �R���X�g���N�^
	 *
	 */
	public MenuView() {

		super("�����^���V�X�e��<���j���[>");

		setLocation(300, 300);
		setSize(320, 300);

		Container container = getContentPane();

		GridLayout gridLayout = new GridLayout(3, 2, 5, 5);
		container.setLayout(gridLayout);

		container.add(rentalButton);
		container.add(giveBackButton);
		container.add(memberButton);
		container.add(dvdsButton);
		container.add(searchButton);
		container.add(exitButton);

		/**
		 * ActionListener�̎������@�ɂ͗l�X���邽��
		 * �����ł͎����̍ۂ̎Q�l�Ƃ��āA�������̗��񎦂��Ă��܂��B
		 * ���ۂɎ�������ꍇ�́A���̂悤�Ƀo���o���Ɏ�������̂ł͂Ȃ�
		 * ���ꂷ�ׂ��ł�
		 */

		// ��1�D�C���^�[�t�F�[�X�ɂ�����
		memberButton.addActionListener(this);
		dvdsButton.addActionListener(this);

		// ��2�D�N���X(�T�u�N���X)�̎���
		rentalButton.addActionListener(new RentalButtonActionListener());

		// ��3�D�����N���X�ɂ�����
		giveBackButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				// �ԋp��ʂ𐶐��E�\������
				ReturnView returnView = new ReturnView(url, userName, password);
				returnView.setVisible(true);
			}
		});

		// ��4�D�����_���ɂ������@
		searchButton.addActionListener(
				(ActionEvent event) -> {

					// DVD������ʂ𐶐��E�\������
					SearchView searchView = new SearchView(url, userName, password);
					searchView.setVisible(true);
				});

		// ��5�D�����_���ɂ������A
		exitButton.addActionListener(
				(ActionEvent) -> {
					MenuView.this.dispose();
					System.exit(0);
				});
	}

	/**
	 * �C���^�[�t�F�[�X�ɂ������̂��߁A�C���^�[�t�F�[�X�Œ�`����Ă���
	 * ���\�b�h���I�[�o�[���C�h����
	 *
	 * ���̕����ŕ����̃{�^����ActionListener�̓������������ꍇ�A
	 * ActionEvent����ǂ̃{�^���������ꂽ�̂��𔻕ʂ���K�v������
	 *
	 * @param event ���������C�x���g
	 */
	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == memberButton) {

			// ����Ǘ��{�^���������ꂽ�ꍇ�́A����Ǘ���ʂ𐶐��E�\������
			MemberView memberView = new MemberView(url, userName, password);
			memberView.setVisible(true);

		} else if (event.getSource() == dvdsButton) {

			// DVD�Ǘ��{�^���������ꂽ�ꍇ�́ADVD�Ǘ���ʂ𐶐��E�\������
			DvdView dvdView = new DvdView(url, userName, password);
			dvdView.setVisible(true);
		}
	}

	/**
	 * �ݏo�{�^�����������ۂ̃C�x���g�����������Ȃ��N���X�i�T�u�N���X�j���`
	 */
	private class RentalButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			// �ݏo��ʂ𐶐�����
			RentalView rentalView = new RentalView(url, userName, password);

			// �ݏo��ʂ�\������
			rentalView.setVisible(true);
		}

	}
}
