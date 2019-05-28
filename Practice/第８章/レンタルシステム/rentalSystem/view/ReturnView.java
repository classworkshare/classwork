package rentalSystem.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import rentalSystem.db.access.ReturnDBAccess;

/**
 * �ԋp��ʃN���X
 *
 */
public class ReturnView extends JFrame {

	private ReturnDBAccess returnDBAccess;

	// �ԋp��
	private JLabel checkInDayLabel;
	private JTextField checkInDayField;

	// �񃉃x��
	private JLabel artworkNumberLabel;
	private JLabel mediaNumberLabel;
	private JLabel artworkNameLabel;
	private JLabel termDayLabel;
	private JLabel arrearsLabel;

	// �ԋp1�s��
	private JTextField artworkNumberField_1;
	private JLabel hyphenLabel_1;
	private JTextField mediaNumberField_1;
	private JTextField artworkNameField_1;
	private JTextField termDayField_1;
	private JTextField arrearsField_1;

	// �ԋp2�s��
	private JTextField artworkNumberField_2;
	private JLabel hyphenLabel_2;
	private JTextField mediaNumberField_2;
	private JTextField artworkNameField_2;
	private JTextField termDayField_2;
	private JTextField arrearsField_2;

	// �ԋp3�s��
	private JTextField artworkNumberField_3;
	private JLabel hyphenLabel_3;
	private JTextField mediaNumberField_3;
	private JTextField artworkNameField_3;
	private JTextField termDayField_3;
	private JTextField arrearsField_3;

	private JLabel totalArrearsLabel;
	private JTextField totalArrearsField;
	private JButton executeButton;
	private JButton backButton;

	private JLabel messageLabel;

	private String memberNumber;

	private String rentalNumber1;
	private String rentalNumber2;
	private String rentalNumber3;

	private String artworkNumber1;
	private String artworkNumber2;
	private String artworkNumber3;

	private String mediaNumber1;
	private String mediaNumber2;
	private String mediaNumber3;

	/**
	 * �R���X�g���N�^
	 */
	public ReturnView(String url, String userName, String password) {

		super();

		initialize();

		returnDBAccess = new ReturnDBAccess(url, userName, password);
	}

	/**
	 * GUI���i�Q�̏�����
	 */
	private void initialize() {

		Container container = this.getContentPane();

		this.setTitle("�����^���r�f�I�V�X�e���@���ԋp��");
		this.setSize(530, 570);
		this.setLayout(null);

		container.setBackground(new Color(205, 155, 255));

		container.add(createCheckInDayLabel());
		container.add(createCheckInDayField());

		container.add(createArtworkNumberLabel());
		container.add(createMediaNumberLabel());
		container.add(createArtworkNameLabel());
		container.add(createTermDayLabel());
		container.add(createArrearsLabel());

		container.add(createArtworkNumberField_1());
		container.add(createHyphenLabel_1());
		container.add(createMediaNumberField_1());
		container.add(createArtworkNameField_1());
		container.add(createTermDayField_1());
		container.add(createArrearsField_1());

		container.add(createArtworkNumberField_2());
		container.add(createHyphenLabel_2());
		container.add(createMediaNumberField_2());
		container.add(createArtworkNameField_2());
		container.add(createTermDayField_2());
		container.add(createArrearsField_2());

		container.add(createArtworkNumberField_3());
		container.add(createHyphenLabel_3());
		container.add(createMediaNumberField_3());
		container.add(createArtworkNameField_3());
		container.add(createTermDayField_3());
		container.add(createArrearsField_3());

		container.add(createTotalArrearsLabel());
		container.add(createTotalArrearsField());

		container.add(createExecuteButton());
		container.add(createBackButton());

		container.add(createMessageLabel());

		clear();
	}

	/**
	 * ��ʓ��e�̃N���A
	 */
	private void clear() {

		// ��i�ԍ����x���P�ȊO��Edit��s�ɂ��A�t�H�[�J�X���؂�
		checkInDayField.setText("");
		checkInDayField.setEditable(false);
		checkInDayField.setFocusable(false);

		// �ԋp1�s��
		artworkNumberField_1.setText("");

		mediaNumberField_1.setText("");
		mediaNumberField_1.setEditable(false);
		mediaNumberField_1.setFocusable(false);

		artworkNameField_1.setText("");
		artworkNameField_1.setEditable(false);
		artworkNameField_1.setFocusable(false);

		termDayField_1.setText("");
		termDayField_1.setEditable(false);
		termDayField_1.setFocusable(false);

		arrearsField_1.setText("");
		arrearsField_1.setEditable(false);
		arrearsField_1.setFocusable(false);

		// �ԋp2�s��
		artworkNumberField_2.setText("");
		artworkNumberField_2.setEditable(false);
		artworkNumberField_2.setFocusable(false);

		mediaNumberField_2.setText("");
		mediaNumberField_2.setEditable(false);
		mediaNumberField_2.setFocusable(false);

		artworkNameField_2.setText("");
		artworkNameField_2.setEditable(false);
		artworkNameField_2.setFocusable(false);

		termDayField_2.setText("");
		termDayField_2.setEditable(false);
		termDayField_2.setFocusable(false);

		arrearsField_2.setText("");
		arrearsField_2.setEditable(false);
		arrearsField_2.setFocusable(false);

		// �ԋp3�s��
		artworkNumberField_3.setText("");
		artworkNumberField_3.setEditable(false);
		artworkNumberField_3.setFocusable(false);

		mediaNumberField_3.setText("");
		mediaNumberField_3.setEditable(false);
		mediaNumberField_3.setFocusable(false);

		artworkNameField_3.setText("");
		artworkNameField_3.setEditable(false);
		artworkNameField_3.setFocusable(false);

		termDayField_3.setText("");
		termDayField_3.setEditable(false);
		termDayField_3.setFocusable(false);

		arrearsField_3.setText("");
		arrearsField_3.setEditable(false);
		arrearsField_3.setFocusable(false);

		totalArrearsField.setText("");
		totalArrearsField.setEditable(false);
		totalArrearsField.setFocusable(false);

		// ���s�{�^�����N���b�N�s��
		executeButton.setEnabled(false);

		// �C���X�^���X�ϐ��̏�����
		memberNumber = null;

		rentalNumber1 = null;
		rentalNumber2 = null;
		rentalNumber3 = null;

		artworkNumber1 = null;
		artworkNumber2 = null;
		artworkNumber3 = null;

		mediaNumber1 = null;
		mediaNumber2 = null;
		mediaNumber3 = null;

		// �����̓��t�̐ݒ�
		setToday();
	}

	//------------------------------------------------------------------------
	// GUI���i�Q�̐���
	//------------------------------------------------------------------------

	/**
	 * �ԋp�����x���̐���
	 *
	 * @return �ԋp�����x��
	 */
	private JLabel createCheckInDayLabel() {

		checkInDayLabel = new JLabel("�ԋp��");
		checkInDayLabel.setBounds(10, 50, 60, 25);
		checkInDayLabel.setFont(new Font("Dialog", Font.PLAIN, 14));

		return checkInDayLabel;
	}

	/**
	 * �ԋp�����̐���
	 *
	 * @return �ԋp����
	 */
	private JTextField createCheckInDayField() {

		checkInDayField = new JTextField();
		checkInDayField.setSize(170, 35);
		checkInDayField.setLocation(25, 90);
		checkInDayField.setFont(new Font("Dialog", Font.ITALIC, 24));

		return checkInDayField;
	}

	/**
	 * ��i�ԍ����x���̐���
	 *
	 * @return ��i�ԍ����x��
	 */
	private JLabel createArtworkNumberLabel() {

		artworkNumberLabel = new JLabel("��i�ԍ�");
		artworkNumberLabel.setSize(62, 23);
		artworkNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		artworkNumberLabel.setLocation(20, 220);

		return artworkNumberLabel;
	}

	/**
	 * �}�ԁi�}�̔ԍ��j���x���̐���
	 *
	 * @return �}�ԁi�}�̔ԍ��j���x��
	 */
	private JLabel createMediaNumberLabel() {

		mediaNumberLabel = new JLabel("�}��");
		mediaNumberLabel.setSize(35, 23);
		mediaNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		mediaNumberLabel.setLocation(95, 220);

		return mediaNumberLabel;
	}

	/**
	 * ��i�����x���̐���
	 *
	 * @return ��i�����x��
	 */
	private JLabel createArtworkNameLabel() {

		artworkNameLabel = new JLabel("��i��");
		artworkNameLabel.setSize(58, 23);
		artworkNameLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		artworkNameLabel.setLocation(201, 220);

		return artworkNameLabel;
	}

	/**
	 * �ԋp�������x���̐���
	 *
	 * @return �ԋp�������x��
	 */
	private JLabel createTermDayLabel() {

		termDayLabel = new JLabel("�ԋp����");
		termDayLabel.setSize(79, 23);
		termDayLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		termDayLabel.setLocation(335, 220);

		return termDayLabel;
	}

	/**
	 * ���؋����x���̐���
	 *
	 * @return ���؋����x��
	 */
	private JLabel createArrearsLabel() {

		arrearsLabel = new JLabel("���؋�");
		arrearsLabel.setSize(58, 23);
		arrearsLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		arrearsLabel.setLocation(440, 220);

		return arrearsLabel;
	}

	/**
	 * ���؋����v���x���̐���
	 *
	 * @return ���؋����v���x��
	 */
	private JLabel createTotalArrearsLabel() {

		totalArrearsLabel = new JLabel("���؋����v");
		totalArrearsLabel.setSize(101, 23);
		totalArrearsLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		totalArrearsLabel.setLocation(289, 365);

		return totalArrearsLabel;
	}

	/**
	 * ���؋����v���̐���
	 *
	 * @return ���؋����v��
	 */
	private JTextField createTotalArrearsField() {

		totalArrearsField = new JTextField();
		totalArrearsField.setSize(90, 30);
		totalArrearsField.setLocation(395, 360);

		return totalArrearsField;
	}

	/**
	 * ���s�{�^���̐���
	 *
	 * @return ���s�{�^��
	 */
	private JButton createExecuteButton() {

		executeButton = new JButton("���s");
		executeButton.setSize(70, 30);
		executeButton.setLocation(340, 470);
		executeButton.setFont(new Font("Dialog", Font.PLAIN, 18));
		executeButton.setBackground(Color.orange);

		executeButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				executeTermDay();
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
		backButton.setSize(70, 30);
		backButton.setLocation(420, 470);
		backButton.setFont(new Font("Dialog", Font.PLAIN, 18));

		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ReturnView.this.dispose();
			}
		});

		return backButton;
	}

	/**
	 * ���b�Z�[�W���x���̐���
	 *
	 * @return ���b�Z�[�W���x��
	 */
	private JLabel createMessageLabel() {

		messageLabel = new JLabel("");
		messageLabel.setBounds(29, 493, 470, 43);

		return messageLabel;
	}

	//------------------------------------------
	// �ԋp��i�P
	//------------------------------------------

	/**
	 * �u-�v���x���̐���
	 *
	 * @return �u-�v���x��
	 */
	private JLabel createHyphenLabel_1() {

		hyphenLabel_1 = new JLabel("�|");
		hyphenLabel_1.setSize(19, 23);
		hyphenLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		hyphenLabel_1.setLocation(78, 249);

		return hyphenLabel_1;
	}

	/**
	 * ��i�ԍ����P�̐���
	 *
	 * @return ��i�ԍ����P
	 */
	private JTextField createArtworkNumberField_1() {

		artworkNumberField_1 = new JTextField();
		artworkNumberField_1.setSize(55, 20);
		artworkNumberField_1.setLocation(20, 250);

		artworkNumberField_1.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {

				// �ύX����Ă��Ȃ���Ή������Ȃ�
				if (artworkNumber1 != null && artworkNumber1.equals(artworkNumberField_1.getText())) {
					return;
				}

				artworkNumber1 = artworkNumberField_1.getText();

				mediaNumberField_1.setText("");
				artworkNameField_1.setText("");
				termDayField_1.setText("");
				arrearsField_1.setText("");
				setTotalArrears();

				messageLabel.setText("");
				setArtworkName(artworkNumberField_1, mediaNumberField_1, artworkNameField_1);
			}
		});

		return artworkNumberField_1;
	}

	/**
	 * �}�̔ԍ����P�̐���
	 *
	 * @return �}�̔ԍ����P
	 */
	private JTextField createMediaNumberField_1() {

		mediaNumberField_1 = new JTextField();
		mediaNumberField_1.setSize(24, 20);
		mediaNumberField_1.setLocation(98, 250);

		mediaNumberField_1.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {

				// �ύX����Ă��Ȃ���Ή������Ȃ�
				if (mediaNumber1 != null && mediaNumber1.equals(mediaNumberField_1.getText())) {
					return;
				}

				mediaNumber1 = mediaNumberField_1.getText();

				termDayField_1.setText("");
				arrearsField_1.setText("");
				setTotalArrears();

				setTermDayInfo(artworkNumberField_1, mediaNumberField_1, termDayField_1, arrearsField_1);

				if (termDayField_1.getText().equals("")) {

					rentalNumber3 = null;

					// 2�s�ڂ̍�i�ԍ����͗��̖�����
					artworkNumberField_2.setEditable(false);
					artworkNumberField_2.setFocusable(false);

				} else {

					rentalNumber1 = returnDBAccess.getRentalNumber(artworkNumberField_1.getText(),
							mediaNumberField_1.getText());

					// 2�s�ڂ̍�i�ԍ����͗��̗L����
					artworkNumberField_2.setEditable(true);
					artworkNumberField_2.setFocusable(true);

					// ���s�{�^���̗L����
					executeButton.setEnabled(true);
				}

			}
		});

		return mediaNumberField_1;
	}

	/**
	 * ��i�����P�̐���
	 *
	 * @return ��i�����P
	 */
	private JTextField createArtworkNameField_1() {

		artworkNameField_1 = new JTextField();
		artworkNameField_1.setSize(175, 20);
		artworkNameField_1.setLocation(140, 250);

		return artworkNameField_1;
	}

	/**
	 * �ԋp�������P�̐���
	 *
	 * @return �ԋp�������P
	 */
	private JTextField createTermDayField_1() {

		termDayField_1 = new JTextField();
		termDayField_1.setSize(81, 20);
		termDayField_1.setLocation(330, 250);

		return termDayField_1;
	}

	/**
	 * ���؋����P�̐���
	 *
	 * @return ���؋����P
	 */
	private JTextField createArrearsField_1() {

		arrearsField_1 = new JTextField();
		arrearsField_1.setSize(50, 20);
		arrearsField_1.setLocation(436, 250);

		return arrearsField_1;
	}

	//------------------------------------------
	// �ԋp��i�Q
	//------------------------------------------

	/**
	 * �u-�v���x���̐���
	 *
	 * @return �u-�v���x��
	 */
	private JLabel createHyphenLabel_2() {

		hyphenLabel_2 = new JLabel();
		hyphenLabel_2.setSize(19, 23);
		hyphenLabel_2.setText("�|");
		hyphenLabel_2.setLocation(78, 290);
		hyphenLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));

		return hyphenLabel_2;
	}

	/**
	 * ��i�ԍ����Q�̐���
	 *
	 * @return ��i�ԍ����Q
	 */
	private JTextField createArtworkNumberField_2() {

		artworkNumberField_2 = new JTextField();
		artworkNumberField_2.setSize(55, 20);
		artworkNumberField_2.setLocation(20, 290);

		artworkNumberField_2.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {

				// �ύX����Ă��Ȃ���Ή������Ȃ�
				if (artworkNumber2 != null && artworkNumber2.equals(artworkNumberField_2.getText())) {
					return;
				}

				artworkNumber2 = artworkNumberField_2.getText();

				mediaNumberField_2.setText("");
				artworkNameField_2.setText("");
				termDayField_2.setText("");
				arrearsField_2.setText("");
				setTotalArrears();

				messageLabel.setText("");
				setArtworkName(artworkNumberField_2, mediaNumberField_2, artworkNameField_2);
			}
		});

		return artworkNumberField_2;
	}

	/**
	 * �}�̔ԍ����Q�̐���
	 *
	 * @return �}�̔ԍ����Q
	 */
	private JTextField createMediaNumberField_2() {

		mediaNumberField_2 = new JTextField();
		mediaNumberField_2.setSize(24, 20);
		mediaNumberField_2.setLocation(98, 290);

		mediaNumberField_2.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {

				// �ύX����Ă��Ȃ���Ή������Ȃ�
				if (mediaNumber2 != null && mediaNumber2.equals(mediaNumberField_2.getText())) {
					return;
				}

				mediaNumber2 = mediaNumberField_2.getText();

				termDayField_2.setText("");
				arrearsField_2.setText("");
				setTotalArrears();

				setTermDayInfo(artworkNumberField_2, mediaNumberField_2, termDayField_2, arrearsField_2);

				if (termDayField_2.getText().equals("")) {

					rentalNumber2 = null;

					// 3�s�ڂ̍�i�ԍ����͗��̖�����
					artworkNumberField_3.setEditable(false);
					artworkNumberField_3.setFocusable(false);

				} else {

					rentalNumber2 = returnDBAccess.getRentalNumber(artworkNumberField_2.getText(),
							mediaNumberField_2.getText());

					// 3�s�ڂ̍�i�ԍ����͗��̗L����
					artworkNumberField_3.setEditable(true);
					artworkNumberField_3.setFocusable(true);
				}

			}
		});

		return mediaNumberField_2;
	}

	/**
	 * ��i�����Q�̐���
	 *
	 * @return ��i�����Q
	 */
	private JTextField createArtworkNameField_2() {

		artworkNameField_2 = new JTextField();
		artworkNameField_2.setSize(175, 20);
		artworkNameField_2.setLocation(140, 290);

		return artworkNameField_2;
	}

	/**
	 * �ԋp�������Q�̐���
	 *
	 * @return �ԋp�������Q
	 */
	private JTextField createTermDayField_2() {

		termDayField_2 = new JTextField();
		termDayField_2.setSize(81, 20);
		termDayField_2.setLocation(330, 290);

		return termDayField_2;
	}

	/**
	 * ���؋����Q�̐���
	 *
	 * @return ���؋����Q
	 */
	private JTextField createArrearsField_2() {

		arrearsField_2 = new JTextField();
		arrearsField_2.setSize(50, 20);
		arrearsField_2.setLocation(436, 290);

		return arrearsField_2;
	}

	//------------------------------------------
	// �ԋp��i�R
	//------------------------------------------

	/**
	 * �u-�v���x���̐���
	 *
	 * @return �u-�v���x��
	 */
	private JLabel createHyphenLabel_3() {

		hyphenLabel_3 = new JLabel();
		hyphenLabel_3.setSize(19, 23);
		hyphenLabel_3.setText("�|");
		hyphenLabel_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		hyphenLabel_3.setLocation(78, 330);

		return hyphenLabel_3;
	}

	/**
	 * ��i�ԍ����R�̐���
	 *
	 * @return ��i�ԍ���
	 */
	private JTextField createArtworkNumberField_3() {

		artworkNumberField_3 = new JTextField();
		artworkNumberField_3.setSize(55, 20);
		artworkNumberField_3.setLocation(20, 330);

		artworkNumberField_3.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {

				// �ύX����Ă��Ȃ���Ή������Ȃ�
				if (artworkNumber3 != null && artworkNumber3.equals(artworkNumberField_3.getText())) {
					return;
				}

				artworkNumber3 = artworkNumberField_3.getText();

				mediaNumberField_3.setText("");
				artworkNameField_3.setText("");
				termDayField_3.setText("");
				arrearsField_3.setText("");
				setTotalArrears();

				messageLabel.setText("");
				setArtworkName(artworkNumberField_3, mediaNumberField_3, artworkNameField_3);
			}
		});

		return artworkNumberField_3;
	}

	/**
	 * �}�̔ԍ����R�̐���
	 *
	 * @return �}�̔ԍ����R
	 */
	private JTextField createMediaNumberField_3() {

		mediaNumberField_3 = new JTextField();
		mediaNumberField_3.setSize(24, 20);
		mediaNumberField_3.setLocation(98, 330);

		mediaNumberField_3.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {

				// �ύX����Ă��Ȃ���Ή������Ȃ�
				if (mediaNumber3 != null && mediaNumber3.equals(mediaNumberField_3.getText())) {
					return;
				}

				mediaNumber3 = mediaNumberField_3.getText();

				termDayField_3.setText("");
				arrearsField_3.setText("");
				setTotalArrears();

				setTermDayInfo(artworkNumberField_3, mediaNumberField_3, termDayField_3, arrearsField_3);

				if (!termDayField_3.getText().equals("")) {
					rentalNumber3 = returnDBAccess.getRentalNumber(artworkNumberField_3.getText(),
							mediaNumberField_3.getText());
				} else {
					rentalNumber3 = null;
				}
			}
		});

		return mediaNumberField_3;
	}

	/**
	 * ��i�����R�̐���
	 *
	 * @return ��i�����R
	 */
	private JTextField createArtworkNameField_3() {

		artworkNameField_3 = new JTextField();
		artworkNameField_3.setSize(175, 20);
		artworkNameField_3.setLocation(140, 330);

		return artworkNameField_3;
	}

	/**
	 * �ԋp�������R�̐���
	 *
	 * @return �ԋp�������R
	 */
	private JTextField createTermDayField_3() {

		termDayField_3 = new JTextField();
		termDayField_3.setSize(81, 20);
		termDayField_3.setLocation(330, 330);

		return termDayField_3;
	}

	/**
	 * ���؋����R�̐���
	 *
	 * @return ���؋����R
	 */
	private JTextField createArrearsField_3() {

		arrearsField_3 = new JTextField();
		arrearsField_3.setSize(50, 20);
		arrearsField_3.setLocation(436, 330);

		return arrearsField_3;
	}

	//------------------------------------------------------------------------
	// �������\�b�h�Q
	//------------------------------------------------------------------------

	/**
	 * ���t�ݒ�
	 */
	private void setToday() {

		// �{�����t�̎擾
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		checkInDayField.setText(sdf.format(new Date()));
	}

	/**
	 * ��i���ݒ胁�\�b�h
	 *
	 * ��i�ԍ��A�}�̔ԍ��A��i���̗�
	 * ���󂯎��A��i�ԍ������i�����擾�ł����
	 * �����\�����A�}�̔ԍ�����L��������B
	 *
	 * @param artworkNumberField
	 * @param mediaNumberField
	 * @param artworkNameField
	 */
	private void setArtworkName(JTextField artworkNumberField, JTextField mediaNumberField,
			JTextField artworkNameField) {

		// ��i�ԍ����󔒂Ȃ牽�����Ȃ�
		if (artworkNumberField.getText().equals("")) {
			return;
		}

		// ��i���̎擾
		String artworkName = returnDBAccess.getArtworkName(artworkNumberField.getText());

		// ��i�����擾�ł��Ȃ��ꍇ�̓G���[���b�Z�[�W��\������
		if (artworkName == null) {

			messageLabel.setText("��i�ԍ� " + artworkNumberField.getText() + " ��������܂���ł����B");

			return;
		}

		// ��i���̕\��
		artworkNameField.setText(artworkName);

		// �}�̔ԍ����̗L����
		mediaNumberField.setEditable(true);
		mediaNumberField.setFocusable(true);
	}

	/**
	 * �ԋp���ݒ�
	 *
	 * ��i�ԍ��Ɣ}�̔ԍ������DB�ɑ΂���
	 * �₢���킹���s���A�ԋp�����A���ؗ�����ݒ肷��
	 *
	 * @param artworkNumberField
	 * @param mediaNumberField
	 * @param termDayField
	 * @param arrearsField
	 */
	private void setTermDayInfo(JTextField artworkNumberField, JTextField mediaNumberField, JTextField termDayField,
			JTextField arrearsField) {

		// �}�̔ԍ�������Ȃ牽�����Ȃ�
		if (mediaNumberField.getText().equals("")) {
			return;
		}

		// �ݏo����ԍ����擾
		String borrowersNumber = returnDBAccess.getBorrowersNumber(artworkNumberField.getText(),
				mediaNumberField.getText());

		// ����ԍ����擾�ł��Ȃ��ꍇ�̓G���[���b�Z�[�W��\������
		if (borrowersNumber == null) {

			messageLabel.setText(
					"��i�ԍ� " + artworkNumberField.getText() + " �� "
							+ "�}�ԁi�}�̔ԍ��j " + mediaNumberField.getText() + " �͑ݏo���ł͂���܂���B");

			return;
		}

		// memberNuber�� null
		if (memberNumber == null) {

			memberNumber = borrowersNumber; // ����ԍ���ݒ�

		} else {

			// ��������ɂ��ԋp�łȂ��ꍇ�̓G���[���b�Z�[�W��\������
			if (!borrowersNumber.equals(memberNumber)) {

				messageLabel.setText("���p�҂��قȂ�܂�");
				executeButton.setEnabled(false);

				return;
			}
		}

		// �ԋp�����̎擾
		Date termDay = returnDBAccess.getTermDay(artworkNumberField.getText(), mediaNumberField.getText());

		if (termDay != null) {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

			// �ԋp�����̕\��
			termDayField.setText(sdf.format(termDay));

			// �x���������v�Z
			long between = calcArrears(termDay);

			// ���؂��Ă���ꍇ
			if (between > 0) {

				int arrearsPerUnitDay = returnDBAccess.getArrearsPerUnitDay(artworkNumberField.getText());

				// ���ؗ�����\���i���ؗ��� = 1��������̉��ؗ��� * ���ؓ����j
				arrearsField.setText(String.valueOf(arrearsPerUnitDay * between));

				setTotalArrears();

			}

			// ���s�{�^���̗L����
			executeButton.setEnabled(true);

		}
	}

	/**
	 * ���ؓ����v�Z
	 *
	 * @param termDayLimit �ԋp����
	 */
	private long calcArrears(Date termDayLimit) {

		Date today = new Date();

		// �����̓��t-�ԋp����
		long between = today.getTime() - termDayLimit.getTime();

		// �~���b����Ɋ��Z���ă��^�[��
		return between / (1000 * 60 * 60 * 24);
	}

	/**
	 * ���v���z�̕\�����\�b�h
	 *
	 * ���v���z��\�����A���ʂƂ���
	 * 0�łȂ���΁A�u���s�v�{�^���̉������\�ɂ���
	 */
	private void setTotalArrears() {

		int total = 0;

		String arrears1 = arrearsField_1.getText();
		String arrears2 = arrearsField_2.getText();
		String arrears3 = arrearsField_3.getText();

		if (!arrears1.equals("")) {
			total += Integer.parseInt(arrears1);
		}

		if (!arrears2.equals("")) {
			total += Integer.parseInt(arrears2);
		}

		if (!arrears3.equals("")) {
			total += Integer.parseInt(arrears3);
		}

		totalArrearsField.setText(total + "");
	}

	/**
	 * �ԋp���\�b�h
	 *
	 * ���ɐݒ�ς݂�i_rentalNumberX�̒l�����
	 * DB�ݏo�e�[�u���̕ԋp���E���؋�����
	 * �X�V���s��
	 */
	private void executeTermDay() {

		int result = 0;

		if (!termDayField_1.getText().equals("")) {
			result = returnDBAccess.checkIn(rentalNumber1, checkInDayField.getText(), arrearsField_1.getText());
		}

		if (!termDayField_2.getText().equals("")) {
			result = returnDBAccess.checkIn(rentalNumber2, checkInDayField.getText(), arrearsField_2.getText());
		}

		if (!termDayField_3.getText().equals("")) {
			result = returnDBAccess.checkIn(rentalNumber3, checkInDayField.getText(), arrearsField_3.getText());
		}

		if (result == 1) {

			clear();
			messageLabel.setText("�ԋp�������������܂����B");

		} else {
			messageLabel.setText("�ԋp�����Ɏ��s���܂����B");
		}
	}
}
