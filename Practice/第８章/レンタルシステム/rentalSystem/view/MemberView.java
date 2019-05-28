package rentalSystem.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import rentalSystem.db.access.MemberDBAccess;

/**
 * ����Ǘ����
 *
 */
public class MemberView extends JFrame {

	/** �I�𒆂̃��[�h�@1:�o�^�@2:�X�V�@3:�폜*/
	private int mode = 0;

	private JCheckBox registerCheckBox;
	private JCheckBox updateCheckBox;
	private JCheckBox deleteCheckBox;
	private ButtonGroup modeSelectGroup;

	// ����ԍ���
	private JLabel memberNumberLabel;
	private JTextField memberNumberField;

	// �����{�^��
	private JButton searchButton;

	// ������
	private JLabel memberNameLabel;
	private JTextField memberNameField;

	// �N�
	private JLabel memberAgeLabel;
	private JTextField memberAgeField;

	// �������
	private JLabel enterDayLabel;
	private JTextField enterDayField;

	// �މ����
	private JLabel leaveDayLabel;
	private JTextField leaveDayField;

	// �Z����
	private JLabel memberAddressLabel;
	private JTextField memberAddressField;

	// �d�b�ԍ���
	private JLabel memberTelLabel;
	private JTextField memberTelField;

	// ����D�ǋ敪��
	private JLabel rankDivLabel;
	private JComboBox<String> rankDivComboBox;

	// ���[���A�h���X��
	private JLabel memberMailLabel;
	private JTextField memberMailField;

	// ���s�A�߂�{�^��
	private JButton executeButton;
	private JButton backButton;

	// ���b�Z�[�W��
	private JLabel messageLabel;

	private MemberDBAccess memberDBAccess;

	/**
	 * �R���X�g���N�^
	 *
	 * @param connection DB�ڑ��ς݃R�l�N�V����
	 */
	public MemberView(String url, String userName, String password) {

		super();

		memberDBAccess = new MemberDBAccess(url, userName, password);

		initialize();
	}

	/**
	 * GUI���i�Q�̏�����
	 */
	private void initialize() {

		Container container = this.getContentPane();

		this.setTitle("����Ǘ�");
		this.setSize(560, 500);
		container.setBackground(new Color(155, 155, 255));

		this.setLayout(null);

		container.add(createPanel());
		container.add(createMemberNumberlabel());
		container.add(createMemberNumberField());
		container.add(createSearchButton());

		container.add(createMemberNameLabel());
		container.add(createMemberNameField());
		container.add(createMemberAgeLabel());
		container.add(createMemberAgeField());
		container.add(createEnterDayLabel());
		container.add(createEnterDayField());
		container.add(createLeaveDayLabel());
		container.add(createLeaveDayField());

		container.add(createMemberAddressLabel());
		container.add(createMemberAddressField());

		container.add(createMemberTelLabel());
		container.add(createMemberTelField());
		container.add(createRankDivLabel());
		container.add(createRankDivComboBox());

		container.add(createMemberMailLabel());
		container.add(createMemberMailField());

		container.add(createExecuteButton());
		container.add(createBackButton());

		container.add(createMessageLabel());

		clear();
	}

	/**
	 * �u�o�^�v�u�X�V�v�u�폜�v�̃`�F�b�N�{�b�N�X�̃p�l���𐶐�
	 *
	 * @return JPanel �`�F�b�N�{�b�N�X�̃p�l��
	 */
	private JPanel createPanel() {

		JPanel panel = new JPanel();
		panel.setBounds(13, 44, 138, 75);
		panel.setBackground(new Color(153, 255, 204));

		panel.setLayout(new BorderLayout());
		panel.add(createRegisterCheckBox(), BorderLayout.NORTH);
		panel.add(createUpdateCheckBox(), BorderLayout.WEST);
		panel.add(createDeleteCheckBox(), BorderLayout.SOUTH);

		modeSelectGroup = new ButtonGroup();
		modeSelectGroup.add(registerCheckBox);
		modeSelectGroup.add(updateCheckBox);
		modeSelectGroup.add(deleteCheckBox);

		return panel;
	}

	/**
	 * �o�^�`�F�b�N�{�b�N�X�̐���
	 *
	 * @return �o�^�`�F�b�N�{�b�N�X
	 */
	private JCheckBox createRegisterCheckBox() {

		registerCheckBox = new JCheckBox("�o�^", false);
		registerCheckBox.setOpaque(false);

		registerCheckBox.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent event) {

				if (event.getStateChange() == ItemEvent.DESELECTED) {

					// �I�����������ꂽ�ꍇ�͉�ʂ�����������
					clear();

					return;
				}

				// �I����ԃt���O��V�K�o�^��
				mode = 1;

				// ���W�I�{�^�����g�p�s�ɂ���
				registerCheckBox.setEnabled(false);
				updateCheckBox.setEnabled(false);
				deleteCheckBox.setEnabled(false);

				// ���������͉\�ɂ���
				memberNameField.setEditable(true);
				memberAgeField.setEditable(true);
				memberAddressField.setEditable(true);
				memberTelField.setEditable(true);
				memberMailField.setEditable(true);
				rankDivComboBox.setEnabled(true);

				// ���s�{�^�����g�p�\��
				executeButton.setEnabled(true);

				// �V�K����ԍ��ƍ����̓��t�̃Z�b�g
				memberNumberField.setText(getNewMemberNumber());
				enterDayField.setText(getToday());

				// ���b�Z�[�W���x���̃N���A
				messageLabel.setText("");
			}
		});

		return registerCheckBox;
	}

	/**
	 * �X�V�`�F�b�N�{�b�N�X�̐���
	 *
	 * @return �X�V�`�F�b�N�{�b�N�X
	 */
	private JCheckBox createUpdateCheckBox() {

		updateCheckBox = new JCheckBox("�X�V", false);
		updateCheckBox.setOpaque(false);

		updateCheckBox.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == ItemEvent.DESELECTED) {

					// �I�����������ꂽ�ꍇ�͉�ʂ�����������
					clear();

					return;
				}

				// �I����ԃt���O���X�V��
				mode = 2;

				// �`�F�b�N�{�b�N�X���g�p�s��
				registerCheckBox.setEnabled(false);
				updateCheckBox.setEnabled(false);
				deleteCheckBox.setEnabled(false);

				// ����ԍ�����͉\��
				memberNumberField.setEditable(true);

				// �����{�^�����g�p�\��
				searchButton.setEnabled(true);

				// ���b�Z�[�W���x���̃N���A
				messageLabel.setText("");
			}
		});

		return updateCheckBox;
	}

	/**
	 * �폜�`�F�b�N�{�b�N�X�̐���
	 *
	 * @return �폜�`�F�b�N�{�b�N�X
	 */
	private JCheckBox createDeleteCheckBox() {

		deleteCheckBox = new JCheckBox("�폜", false);
		deleteCheckBox.setOpaque(false);

		deleteCheckBox.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == ItemEvent.DESELECTED) {

					// �I�����������ꂽ�ꍇ�͉�ʂ�����������
					clear();

					return;
				}

				// �I����ԃt���O���폜��
				mode = 3;

				// �`�F�b�N�{�b�N�X���g�p�s��
				registerCheckBox.setEnabled(false);
				updateCheckBox.setEnabled(false);
				deleteCheckBox.setEnabled(false);

				// ����ԍ�����͉\��
				memberNumberField.setEditable(true);

				// �����{�^�����g�p�\��
				searchButton.setEnabled(true);

				// ���b�Z�[�W���x���̃N���A
				messageLabel.setText("");
			}
		});

		return deleteCheckBox;
	}

	/**
	 * ����ԍ����x���̐���
	 *
	 * @return ����ԍ����x��
	 */
	private JLabel createMemberNumberlabel() {

		memberNumberLabel = new JLabel("����ԍ�");
		memberNumberLabel.setBounds(174, 53, 126, 21);
		memberNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		memberNumberLabel.setForeground(new Color(0, 6, 0));

		return memberNumberLabel;
	}

	/**
	 * ����ԍ����̐���
	 *
	 * @return ����ԍ���
	 */
	private JTextField createMemberNumberField() {

		memberNumberField = new JTextField();
		memberNumberField.setBounds(173, 79, 188, 39);
		memberNumberField.setFont(new Font("Dialog", Font.BOLD, 20));

		return memberNumberField;
	}

	/**
	 * �����{�^���̐���
	 *
	 * @return �����{�^��
	 */
	private JButton createSearchButton() {

		searchButton = new JButton("����");
		searchButton.setBounds(380, 91, 70, 30);
		searchButton.setFont(new Font("Dialog", Font.PLAIN, 18));

		searchButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (memberNumberField.getText() != null && !memberNumberField.getText().equals("")) {

					messageLabel.setText("");

					boolean result = memberDBAccess.setMember(memberNumberField.getText());

					if (result) {

						// �������ݒ肷��
						memberNameField.setText(memberDBAccess.getMemberName());
						memberAgeField.setText(memberDBAccess.getMemberAge());
						enterDayField.setText(memberDBAccess.getMemberInsert());
						leaveDayField.setText(memberDBAccess.getMemberDelete());
						memberAddressField.setText(memberDBAccess.getMemberAddress());
						memberTelField.setText(memberDBAccess.getMemberTel());
						rankDivComboBox.setSelectedItem(memberDBAccess.getMemberRank());
						memberMailField.setText(memberDBAccess.getMemberMail());

						if (mode == 2) {

							// �X�V���͗��Q���G�f�B�b�g�\�ɂ���
							memberNameField.setEditable(true);
							memberAgeField.setEditable(true);
							enterDayField.setEditable(true);
							leaveDayField.setEditable(true);
							memberAddressField.setEditable(true);
							memberTelField.setEditable(true);
							memberMailField.setEditable(true);

							rankDivComboBox.setEnabled(true);
						}

						// ���s�{�^�����g�p�\�ɂ���
						executeButton.setEnabled(true);

					} else {

						// �����񂪌�����Ȃ��ꍇ�̓G���[���b�Z�[�W��\������
						messageLabel.setText("����ԍ� " + memberNumberField.getText() + " �̉����������܂���ł���");
					}
				}
			}
		});

		return searchButton;
	}

	/**
	 * �������x���̐���
	 *
	 * @return �������x��
	 */
	private JLabel createMemberNameLabel() {

		memberNameLabel = new JLabel("����");
		memberNameLabel.setBounds(14, 145, 69, 24);
		memberNameLabel.setFont(new Font("Dialog", Font.PLAIN, 14));

		return memberNameLabel;
	}

	/**
	 * �������̐���
	 *
	 * @return ������
	 */
	private JTextField createMemberNameField() {

		memberNameField = new JTextField();
		memberNameField.setBounds(13, 175, 153, 30);
		memberNameField.setFont(new Font("Dialog", Font.PLAIN, 18));

		return memberNameField;
	}

	/**
	 * �N��x��
	 *
	 * @return �N��x��
	 */
	private JLabel createMemberAgeLabel() {

		memberAgeLabel = new JLabel("�N��");
		memberAgeLabel.setBounds(177, 147, 42, 24);
		memberAgeLabel.setFont(new Font("Dialog", Font.PLAIN, 14));

		return memberAgeLabel;
	}

	/**
	 * �N��̎擾
	 *
	 * @return �N�
	 */
	private JTextField createMemberAgeField() {

		memberAgeField = new JTextField();
		memberAgeField.setBounds(176, 175, 100, 30);
		memberAgeField.setFont(new Font("Dialog", Font.PLAIN, 18));

		return memberAgeField;
	}

	/**
	 * ��������x���̐���
	 *
	 * @return JLabel
	 */
	private JLabel createEnterDayLabel() {

		enterDayLabel = new JLabel("�����");
		enterDayLabel.setBounds(288, 146, 73, 25);
		enterDayLabel.setFont(new Font("Dialog", Font.PLAIN, 14));

		return enterDayLabel;
	}

	/**
	 * ��������̐���
	 *
	 * @return �������
	 */
	private JTextField createEnterDayField() {

		enterDayField = new JTextField();
		enterDayField.setBounds(288, 175, 100, 30);
		enterDayField.setFont(new Font("Dialog", Font.PLAIN, 18));

		return enterDayField;
	}

	/**
	 * �މ�����x���̐���
	 *
	 * @return �މ�����x��
	 */
	private JLabel createLeaveDayLabel() {

		leaveDayLabel = new JLabel("�މ��");
		leaveDayLabel.setBounds(406, 146, 78, 25);
		leaveDayLabel.setFont(new Font("Dialog", Font.PLAIN, 14));

		return leaveDayLabel;
	}

	/**
	 * �މ�����̐���
	 *
	 * @return JTextField
	 */
	private JTextField createLeaveDayField() {

		leaveDayField = new JTextField();
		leaveDayField.setBounds(405, 175, 100, 30);
		leaveDayField.setFont(new Font("Dialog", Font.PLAIN, 18));

		return leaveDayField;
	}

	/**
	 * �Z�����x���̐���
	 *
	 * @return JLabel
	 */
	private JLabel createMemberAddressLabel() {

		memberAddressLabel = new JLabel("�Z��");
		memberAddressLabel.setBounds(14, 218, 70, 27);
		memberAddressLabel.setFont(new Font("Dialog", Font.PLAIN, 14));

		return memberAddressLabel;
	}

	/**
	 * �Z�����̐���
	 *
	 * @return �Z����
	 */
	private JTextField createMemberAddressField() {

		memberAddressField = new JTextField();
		memberAddressField.setBounds(13, 250, 495, 30);
		memberAddressField.setFont(new Font("Dialog", Font.PLAIN, 18));

		return memberAddressField;
	}

	/**
	 * TEL���x���̐���
	 *
	 * @return TEL���x��
	 */
	private JLabel createMemberTelLabel() {

		memberTelLabel = new JLabel("�d�b�ԍ�");
		memberTelLabel.setBounds(14, 287, 71, 27);
		memberTelLabel.setFont(new Font("Dialog", Font.PLAIN, 14));

		return memberTelLabel;
	}

	/**
	 * �d�b�ԍ����̐���
	 *
	 * @return �d�b�ԍ���
	 */
	private JTextField createMemberTelField() {

		memberTelField = new JTextField();
		memberTelField.setBounds(13, 320, 245, 30);
		memberTelField.setFont(new Font("Dialog", Font.PLAIN, 18));

		return memberTelField;
	}

	/**
	 * �����ʃ��x���̐���
	 *
	 * @return �����ʃ��x��
	 */
	private JLabel createRankDivLabel() {

		rankDivLabel = new JLabel("������");
		rankDivLabel.setBounds(285, 288, 71, 24);
		rankDivLabel.setFont(new Font("Dialog", Font.PLAIN, 14));

		return rankDivLabel;
	}

	/**
	 * ����D�ǋ敪�I���{�b�N�X�̐���
	 *
	 * @return ����D�ǋ敪�I���{�b�N�X
	 */
	private JComboBox<String> createRankDivComboBox() {

		rankDivComboBox = new JComboBox<String>();
		rankDivComboBox.setBounds(285, 320, 60, 30);
		rankDivComboBox.addItem("�D");
		rankDivComboBox.addItem("��");
		rankDivComboBox.addItem("��");
		rankDivComboBox.addItem("�s");

		return rankDivComboBox;
	}

	/**
	 * ���[���A�h���X���x���̐���
	 *
	 * @return ���[���A�h���X���x��
	 */
	private JLabel createMemberMailLabel() {

		memberMailLabel = new JLabel("���[���A�h���X");
		memberMailLabel.setBounds(15, 358, 100, 22);
		memberMailLabel.setFont(new Font("Dialog", Font.PLAIN, 14));

		return memberMailLabel;
	}

	/**
	 * ���[���A�h���X���̐���
	 *
	 * @return ���[���A�h���X��
	 */
	private JTextField createMemberMailField() {

		memberMailField = new JTextField();
		memberMailField.setBounds(13, 385, 350, 30);
		memberMailField.setFont(new Font("Dialog", Font.PLAIN, 18));

		return memberMailField;
	}

	/**
	 * ���s�{�^���̐���
	 *
	 * @return ���s�{�^��
	 */
	private JButton createExecuteButton() {

		executeButton = new JButton("���s");
		executeButton.setBounds(380, 385, 70, 30);
		executeButton.setFont(new Font("Dialog", Font.PLAIN, 18));
		executeButton.setBackground(Color.orange);

		executeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���s�{�^������

				// �V�K�o�^
				if (mode == 1) {
					entryMember();
				}

				// �X�V
				if (mode == 2) {
					updateMember();
				}

				// �폜
				if (mode == 3) {
					leaveMember();
				}
			}
		});

		return executeButton;
	}

	/**
	 * �߂�{�^���̐���
	 *
	 * @return �߂�{�^��
	 */
	private JButton createBackButton() {

		backButton = new JButton("�߂�");
		backButton.setBounds(460, 385, 70, 30);
		backButton.setFont(new Font("Dialog", Font.PLAIN, 18));

		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				MemberView.this.dispose();
			}
		});

		return backButton;
	}

	private JLabel createMessageLabel() {

		messageLabel = new JLabel();
		messageLabel.setBounds(13, 427, 348, 26);
		messageLabel.setText("");
		return messageLabel;
	}

	/**
	 * ����̓o�^����
	 */
	private void entryMember() {

		int result = memberDBAccess.addMember(
				memberNumberField.getText(),
				memberNameField.getText(),
				memberAddressField.getText(),
				memberAgeField.getText(),
				memberTelField.getText(),
				memberMailField.getText(),
				enterDayField.getText(),
				rankDivComboBox.getItemAt(rankDivComboBox.getSelectedIndex()));

		if (result == 1) {

			clear();
			messageLabel.setText("�������o�^���܂����B");

		} else {

			messageLabel.setText("����o�^�Ɏ��s���܂����B");
		}
	}

	/**
	 * ����̍X�V����
	 */
	private void updateMember() {

		int result = memberDBAccess.updateMember(
				memberNumberField.getText(),
				memberNameField.getText(),
				memberAddressField.getText(),
				memberAgeField.getText(),
				memberTelField.getText(),
				memberMailField.getText(),
				enterDayField.getText(),
				leaveDayField.getText(),
				rankDivComboBox.getItemAt(rankDivComboBox.getSelectedIndex()));

		if (result == 1) {

			clear();
			messageLabel.setText("��������X�V���܂����B");

		} else {

			messageLabel.setText("����X�V�Ɏ��s���܂����B");
		}

	}

	/**
	 * ����̍폜����
	 *
	 * �މ���̓��͂������āA�މ�i�폜�j�Ƃ���B
	 */
	private void leaveMember() {

		// �����̓��t�̎擾
		String leaveDay = getToday();

		int result = memberDBAccess.deleteMember(memberNumberField.getText(), leaveDay);

		if (result == 1) {

			clear();
			messageLabel.setText("��������폜���܂����B");

		} else {

			messageLabel.setText("����폜�Ɏ��s���܂����B");
		}
	}

	/**
	 * �����̓��t������̎擾
	 *
	 * @return �����̓��t������iyyyy/MM/dd�j
	 */
	private String getToday() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		return sdf.format(new Date());
	}

	/**
	 * �V�K����ԍ��̎擾
	 *
	 * @return �V�K����ԍ�
	 */
	private String getNewMemberNumber() {

		return memberDBAccess.getNewMemberNumber();
	}

	/**
	 * ��ʓ��e�̃N���A
	 *
	 */
	private void clear() {

		mode = 0;

		// �t�B�[���h�̃N���A
		memberNumberField.setText("");
		memberNameField.setText("");
		memberAgeField.setText("");
		enterDayField.setText("");
		leaveDayField.setText("");
		memberAddressField.setText("");
		memberTelField.setText("");
		memberMailField.setText("");

		// �`�F�b�N�{�b�N�X�𖢑I���ɕύX
		modeSelectGroup.clearSelection();

		// �`�F�b�N�{�b�N�X��I���\�ɕύX
		registerCheckBox.setEnabled(true);
		updateCheckBox.setEnabled(true);
		deleteCheckBox.setEnabled(true);

		// �e�L�X�g�{�b�N�X�̏�����
		memberNumberField.setEditable(false);
		memberNameField.setEditable(false);
		memberAgeField.setEditable(false);
		enterDayField.setEditable(false);
		leaveDayField.setEditable(false);
		memberAddressField.setEditable(false);
		memberTelField.setEditable(false);
		memberMailField.setEditable(false);

		// ����敪�̏�����
		rankDivComboBox.setSelectedIndex(0);
		rankDivComboBox.setEnabled(false);

		enterDayField.setFocusable(false);
		leaveDayField.setFocusable(false);

		searchButton.setEnabled(false);
		executeButton.setEnabled(false);
	}
}