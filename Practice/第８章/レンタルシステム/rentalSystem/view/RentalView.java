package rentalSystem.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * �ݏo��ʃN���X
 *
 * ��ʕ\���ƁA�f�[�^�x�[�X�ւ̃A�N�Z�X�����˂Ă���
 */
public class RentalView extends JFrame {

	private int newRentalNumber = 0; // �ݏo�ԍ�

	// ������
	private JLabel memberNumberLabel;
	private JTextField memberNumberField;
	private JLabel memberNameLabel;
	private JTextField memberNameField;
	private JLabel rankDivLabel;
	private JTextField rankDivField;

	// �����񌟍��{�^��
	private JButton searchButton;

	// �ݏo��
	private JLabel checkOutDayLabel;
	private JTextField checkOutDayField;

	// ��^�C�g�����x��
	private JLabel rentalNumberLabel;
	private JLabel artworkNumberLabel;
	private JLabel mediaNumberLabel;
	private JLabel artworkNameLabel;
	private JLabel termDayLabel;
	private JLabel rentalChargeLabel;

	// �ݏo���e1�s��
	private JTextField rentalNumberField_1;
	private JTextField artworkNumberField_1;
	private JLabel hyphenLabel_1;
	private JTextField mediaNumberField_1;
	private JTextField artworkNameField_1;
	private JTextField termDayField_1;
	private JTextField rentalChargeField_1;

	// �ݏo���e2�s��
	private JTextField rentalNumberField_2;
	private JTextField artworkNumberField_2;
	private JLabel hyphenLabel_2;
	private JTextField mediaNumberField_2;
	private JTextField artworkNameField_2;
	private JTextField termDayField_2;
	private JTextField rentalChargeField_2;

	// �ݏo���e3�s��
	private JTextField rentalNumberField_3;
	private JTextField artworkNumberField_3;
	private JLabel hyphenLabel_3;
	private JTextField mediaNumberField_3;
	private JTextField artworkNameField_3;
	private JTextField termDayField_3;
	private JTextField rentalChargeField_3;

	// ���v���z
	private JTextField totalField;
	private JLabel totalLabel;

	// ���s�{�^���A�߂�{�^��
	private JButton executeButton;
	private JButton backButton;

	// ���b�Z�[�W���x���i�ǉ�)
	private JLabel messageLabel;

	//------------------------------------------------------------------------
	// �f�[�^�x�[�X�ڑ��ɕK�v�ȕϐ��Q
	//------------------------------------------------------------------------
	private final String url;
	private final String userName;
	private final String password;

	/**
	 * �R���X�g���N�^
	 *
	 * @param connection �f�[�^�x�[�X�ڑ��ς݃R�l�N�V����
	 */
	public RentalView(String url, String userName, String password) {

		super();

		this.url = url;
		this.userName = userName;
		this.password = password;

		initialize();
	}

	/**
	 * GUI���i�Q�̏�����
	 */
	private void initialize() {

		Container container = this.getContentPane();

		this.setTitle("�����^���V�X�e��<�ݏo>");
		this.setBounds(0, 0, 550, 600);
		container.setBackground(new Color(205, 155, 255));

		this.setLayout(null);

		// �����񌟍�
		container.add(createMemberNumberLabel());
		container.add(createMemberNumberField());
		container.add(createSearchButton());

		// �����񌟍�����
		container.add(createMemberNameLabel());
		container.add(createMemberNameField());
		container.add(createRankDivLabel());
		container.add(createRankDivField());

		// �ݏo���̕\��
		container.add(createCheckOutDayLabel());
		container.add(createCheckOutDayField());

		// ��^�C�g��
		container.add(createRentalNumberLabel());
		container.add(createArtworkNumberLabel());
		container.add(createMediaNumberLabel());
		container.add(createArtworkNameLabel());
		container.add(createTermDayLabel());
		container.add(createChargeLabel());

		// �ݏo1�s��
		container.add(createRentalNumberField_1());
		container.add(createArtworkNumberField_1());
		container.add(createHyphenLabel_1());
		container.add(createMediaNumberField_1());
		container.add(createArtworkNameField_1());
		container.add(createTermDayField_1());
		container.add(createChargeField_1());

		// �ݏo2�s��
		container.add(createRentalNumberField_2());
		container.add(createArtworkNumberField_2());
		container.add(createHyphenLabel_2());
		container.add(createMediaNumberField_2());
		container.add(createArtworkNameField_2());
		container.add(createTermDayField_2());
		container.add(createChargeField_2());

		// �ݏo3�s��
		container.add(createRentalNumberField_3());
		container.add(createArtworkNumberField_3());
		container.add(createHyphenLabel_3());
		container.add(createMediaNumberField_3());
		container.add(createArtworkNameField_3());
		container.add(createTermDayField_3());
		container.add(createChargeField_3());

		// ���v���z
		container.add(createTotalField());
		container.add(createTotalLabel());

		// �ݏo���s�A�߂�{�^��
		container.add(createExecButton());
		container.add(createBackButton());

		// ���b�Z�[�W���x��
		container.add(createMessageLabel());

		clear(); // ���i�̃t�H�[�J�X��������Ԃ�

	}

	//------------------------------------------------------------------------
	// GUI���i�Q�̐���
	//------------------------------------------------------------------------

	/**
	 * ����ԍ����x���̐���
	 *
	 * @return ����ԍ����x��
	 */
	private JLabel createMemberNumberLabel() {

		memberNumberLabel = new JLabel("����ԍ�");
		memberNumberLabel.setBounds(10, 35, 65, 25);
		memberNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		memberNumberLabel.setBackground(new Color(205, 155, 255));

		return memberNumberLabel;
	}

	/**
	 * ����ԍ����̐���
	 *
	 * @return ����ԍ���
	 */
	private JTextField createMemberNumberField() {

		memberNumberField = new JTextField();
		memberNumberField.setSize(200, 35);
		memberNumberField.setFont(new Font("Dialog", Font.PLAIN, 20));
		memberNumberField.setLocation(25, 60);

		return memberNumberField;
	}

	/**
	 * �����{�^���̐���
	 *
	 * @return �����{�^��
	 */
	private JButton createSearchButton() {

		searchButton = new JButton("����");
		searchButton.setSize(70, 30);
		searchButton.setFont(new Font("Dialog", Font.PLAIN, 18));
		searchButton.setLocation(387, 56);

		searchButton.addActionListener(new ActionListener() {

			// �����{�^���������̏���
			public void actionPerformed(ActionEvent e) {

				// ���b�Z�[�W���x���̏�����
				messageLabel.setText("");

				String sql = "SELECT * FROM MEMBER_TABLE WHERE member_num = ? AND leave_day IS NULL";

				// ������̏Ɖ�
				try (Connection connection = DriverManager.getConnection(url, userName, password);
						PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

					preparedStatement.setString(1, memberNumberField.getText());

					try (ResultSet resultSet = preparedStatement.executeQuery();) {

						if (resultSet.next()) {

							// ������̐ݒ�
							memberNameField.setText(resultSet.getString("member_name"));
							rankDivField.setText(resultSet.getString("rank_div"));

							// �ݏo���̐ݒ�
							checkOutDayField.setText(getToday());

							// ��i�ԍ����P�̗L����
							artworkNumberField_1.setEditable(true);
							artworkNumberField_1.setFocusable(true);

						} else {

							messageLabel.setText("����ԍ� " + memberNumberField.getText() + " ��������܂���B");
						}
					}

				} catch (Exception exception) {

					// ��i�ԍ����P�̖�����
					artworkNumberField_1.setEditable(false);
					artworkNumberField_1.setFocusable(false);

					exception.printStackTrace();
				}
			}
		});

		return searchButton;
	}

	/**
	 * ����������x���̐���
	 *
	 * @return �������
	 */
	private JLabel createMemberNameLabel() {

		memberNameLabel = new JLabel("�������");
		memberNameLabel.setBounds(10, 110, 65, 25);
		memberNameLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		memberNameLabel.setBackground(new Color(205, 155, 255));

		return memberNameLabel;
	}

	/**
	 * ����������̐���
	 *
	 * @return ���������
	 */
	private JTextField createMemberNameField() {

		memberNameField = new JTextField();
		memberNameField.setBounds(25, 140, 250, 35);
		memberNameField.setFont(new Font("�l�r �S�V�b�N", Font.ITALIC, 24));

		return memberNameField;
	}

	/**
	 * ����D�ǋ敪���x���̐���
	 *
	 * @return ����D�ǋ敪���x��
	 */
	private JLabel createRankDivLabel() {

		rankDivLabel = new JLabel("����D�ǋ敪");
		rankDivLabel.setSize(85, 23);
		rankDivLabel.setLocation(300, 110);
		rankDivLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		rankDivLabel.setBackground(new Color(205, 155, 255));

		return rankDivLabel;
	}

	/**
	 * ����D�ǋ敪���̐���
	 *
	 * @return ����D�ǋ敪��
	 */
	private JTextField createRankDivField() {

		rankDivField = new JTextField();
		rankDivField.setSize(30, 35);
		rankDivField.setLocation(316, 140);
		rankDivField.setFont(new Font("Dialog", Font.PLAIN, 24));

		return rankDivField;
	}

	/**
	 * �ݏo�����x���̐���
	 *
	 * @return �ݏo�����x��
	 */
	private JLabel createCheckOutDayLabel() {

		checkOutDayLabel = new JLabel("�ݏo��");
		checkOutDayLabel.setSize(60, 25);
		checkOutDayLabel.setLocation(10, 190);
		checkOutDayLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		checkOutDayLabel.setBackground(new Color(205, 155, 255));

		return checkOutDayLabel;
	}

	/**
	 * �ݏo�����̐���
	 *
	 * @return �ݏo����
	 */
	private JTextField createCheckOutDayField() {

		checkOutDayField = new JTextField();
		checkOutDayField.setSize(170, 35);
		checkOutDayField.setLocation(25, 220);
		checkOutDayField.setFont(new Font("Dialog", Font.ITALIC, 24));

		return checkOutDayField;
	}

	/**
	 * �ݏo�ԍ����x���̐���
	 *
	 * @return JLabel
	 */
	private JLabel createRentalNumberLabel() {

		rentalNumberLabel = new JLabel("�ݏo�ԍ�");
		rentalNumberLabel.setSize(63, 23);
		rentalNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		rentalNumberLabel.setLocation(12, 270);
		rentalNumberLabel.setBackground(new Color(205, 155, 255));

		return rentalNumberLabel;
	}

	/**
	 * ��i�ԍ����x���̐���
	 *
	 * @return ��i�ԍ����x��
	 */
	private JLabel createArtworkNumberLabel() {

		artworkNumberLabel = new JLabel("��i�ԍ�");
		artworkNumberLabel.setSize(61, 23);
		artworkNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		artworkNumberLabel.setLocation(88, 270);
		artworkNumberLabel.setBackground(new Color(205, 155, 255));

		return artworkNumberLabel;
	}

	/**
	 * �}�ԁi�}�̔ԍ��j���x���̐���
	 *
	 * @return �}�ԁi�}�̔ԍ��j���x��
	 */
	private JLabel createMediaNumberLabel() {

		mediaNumberLabel = new JLabel("�}��");
		mediaNumberLabel.setSize(36, 23);
		mediaNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		mediaNumberLabel.setLocation(155, 270);
		mediaNumberLabel.setBackground(new Color(205, 155, 255));

		return mediaNumberLabel;
	}

	/**
	 * ��i�����x���̐���
	 *
	 * @return ��i�����x��
	 */
	private JLabel createArtworkNameLabel() {

		artworkNameLabel = new JLabel("��i��");
		artworkNameLabel.setSize(55, 23);
		artworkNameLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		artworkNameLabel.setLocation(250, 270);
		artworkNameLabel.setBackground(new Color(205, 155, 255));

		return artworkNameLabel;
	}

	/**
	 * �ԋp�������x���̐���
	 *
	 * @return �ԋp�������x��
	 */
	private JLabel createTermDayLabel() {

		termDayLabel = new JLabel("�ԋp����");
		termDayLabel.setSize(77, 23);
		termDayLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		termDayLabel.setLocation(372, 270);
		termDayLabel.setBackground(new Color(205, 155, 255));

		return termDayLabel;
	}

	/**
	 * �������x���̐���
	 *
	 * @return �������x��
	 */
	private JLabel createChargeLabel() {

		rentalChargeLabel = new JLabel("����");
		rentalChargeLabel.setSize(33, 23);
		rentalChargeLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		rentalChargeLabel.setLocation(480, 270);
		rentalChargeLabel.setBackground(new Color(205, 155, 255));

		return rentalChargeLabel;
	}

	//-------------
	// �ݏo�P
	//-------------
	/**
	 * �ݏo�ԍ����P�̐���
	 *
	 * @return �ݏo�ԍ����P
	 */
	private JTextField createRentalNumberField_1() {

		rentalNumberField_1 = new JTextField();
		rentalNumberField_1.setSize(65, 20);
		rentalNumberField_1.setColumns(6);
		rentalNumberField_1.setLocation(12, 305);

		return rentalNumberField_1;
	}

	/**
	 * ��i�ԍ����P�̐���
	 *
	 * @return ��i�ԍ����P
	 */
	private JTextField createArtworkNumberField_1() {

		artworkNumberField_1 = new JTextField();
		artworkNumberField_1.setSize(55, 20);
		artworkNumberField_1.setLocation(89, 305);

		artworkNumberField_1.addFocusListener(new FocusListener() {

			// ���̗��Ƀt�H�[�J�X�������̏���
			@Override
			public void focusGained(FocusEvent e) {

				// �ݏo�ԍ���1����Ȃ�V�K�ݏo�ԍ���ݒ肷��
				if (rentalNumberField_1.getText().equals("")) {

					// �V�K�ݏo�ԍ��̐ݒ�
					rentalNumberField_1.setText(getNewRentalNumber());
				}
			}

			// ���̗�����t�H�[�J�X���O�������̏���
			@Override
			public void focusLost(FocusEvent e) {

				messageLabel.setText("");

				// ��i�����擾
				String artworkName = getArtworkName(artworkNumberField_1.getText());

				if (artworkName != null) {
					// ��i������Ύ}�ԁi�}�̔ԍ��j����͉\�ɂ���

					artworkNameField_1.setText(artworkName);
					mediaNumberField_1.setFocusable(true);
					mediaNumberField_1.setEditable(true);

				} else {
					// ��i���Ȃ��ꍇ�G���[���b�Z�[�W��\������

					messageLabel.setText("��i�ԍ� " + artworkNumberField_1.getText() + " ��������܂���B");

					artworkNameField_1.setText("");
					mediaNumberField_1.setText("");
					termDayField_1.setText("");
					rentalChargeField_1.setText("");
					mediaNumberField_1.setFocusable(false);
					mediaNumberField_1.setEditable(false);
				}
			}
		});

		return artworkNumberField_1;
	}

	/**
	 * �n�C�t�����x���P
	 *
	 * @return �n�C�t�����x���P
	 */
	private JLabel createHyphenLabel_1() {

		hyphenLabel_1 = new JLabel("�|");
		hyphenLabel_1.setSize(14, 23);
		hyphenLabel_1.setLocation(145, 305);
		hyphenLabel_1.setBackground(new Color(205, 155, 255));

		return hyphenLabel_1;
	}

	/**
	 * �}�ԁi�}�̔ԍ��j���P�̐���
	 *
	 * @return �}�ԁi�}�̔ԍ��j���P
	 */
	private JTextField createMediaNumberField_1() {

		mediaNumberField_1 = new JTextField();

		mediaNumberField_1.setSize(24, 20);
		mediaNumberField_1.setLocation(160, 305);
		mediaNumberField_1.setColumns(2);

		mediaNumberField_1.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {

				messageLabel.setText("");

				if (!mediaNumberField_1.getText().equals("")) {

					int dvdState = getDvdState(artworkNumberField_1.getText(), mediaNumberField_1.getText());

					if (dvdState == 0) {
						// �ݏo�\�ȏꍇ

						// �����Ƒݏo�����̐ݒ�
						rentalChargeField_1.setText(getRentalCharge(artworkNumberField_1.getText()));
						termDayField_1.setText(getTermDay(artworkNumberField_1.getText()));

						// ��i�ԍ����Q�̗L����
						artworkNumberField_2.setFocusable(true);
						artworkNumberField_2.setEditable(true);

						// ���v���z�̎Z�o
						setTotal();

					} else {
						// �ݏo�s�\�ȏꍇ�G���[���b�Z�[�W��\������

						if (dvdState == -1) {
							// DVD���o�^����Ă��Ȃ��ꍇ

							messageLabel.setText(
									"��i�ԍ� " + artworkNumberField_1.getText() + " �� "
											+ "�}�ԁi�}�̔ԍ��j " + mediaNumberField_1.getText() + " ��"
											+ "������܂���B");

						} else if (dvdState == 2) {
							// DVD���ݏo��~�̏ꍇ

							messageLabel.setText(
									"��i�ԍ� " + artworkNumberField_1.getText() + " �� "
											+ "�}�ԁi�}�̔ԍ��j " + mediaNumberField_1.getText() + " ��"
											+ "�ݏo���s���Ă���܂���B");

						} else if (dvdState == 1) {
							// DVD���ݏo���̏ꍇ

							messageLabel.setText(
									"��i�ԍ� " + artworkNumberField_1.getText() + " �� "
											+ "�}�ԁi�}�̔ԍ��j " + mediaNumberField_1.getText() + " ��"
											+ "���ݑݏo���ł��B");

						}

						// �����Ƒݏo������������
						termDayField_1.setText("");
						rentalChargeField_1.setText("");

						// ��i�ԍ����Q�̖�����
						artworkNumberField_2.setFocusable(false);
						artworkNumberField_2.setEditable(false);
					}
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
		artworkNameField_1.setLocation(187, 305);
		artworkNameField_1.setColumns(30);

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
		termDayField_1.setLocation(370, 305);
		termDayField_1.setColumns(10);

		return termDayField_1;
	}

	/**
	 * �������P�̐���
	 *
	 * @return �������P
	 */
	private JTextField createChargeField_1() {

		rentalChargeField_1 = new JTextField();
		rentalChargeField_1.setSize(50, 20);
		rentalChargeField_1.setColumns(4);
		rentalChargeField_1.setLocation(470, 305);

		return rentalChargeField_1;
	}

	//------------
	// �ݏo�Q
	//------------
	/**
	 * �ݏo�ԍ����Q�̐���
	 *
	 * @return �ݏo�ԍ����Q
	 */
	private JTextField createRentalNumberField_2() {

		rentalNumberField_2 = new JTextField();
		rentalNumberField_2.setSize(65, 20);
		rentalNumberField_2.setLocation(12, 340);

		return rentalNumberField_2;
	}

	/**
	 * ��i�ԍ����Q�̐���
	 *
	 * @return ��i�ԍ����Q
	 */
	private JTextField createArtworkNumberField_2() {

		artworkNumberField_2 = new JTextField();
		artworkNumberField_2.setSize(55, 20);
		artworkNumberField_2.setLocation(89, 340);

		artworkNumberField_2.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {

				if (rentalNumberField_2.getText().equals("")) {
					rentalNumberField_2.setText(getNewRentalNumber());
				}
			}

			@Override
			public void focusLost(FocusEvent e) {

				// ��i�����擾
				String artworkName = getArtworkName(artworkNumberField_2.getText());

				// ��i������Ύ}�ԁi�}�̔ԍ��j����͉\�ɂ���
				if (artworkName != null) {

					artworkNameField_2.setText(artworkName);
					mediaNumberField_2.setEditable(true);
					mediaNumberField_2.setFocusable(true);

				} else {
					// ��i���Ȃ��ꍇ�G���[���b�Z�[�W��\������

					messageLabel.setText("��i�ԍ� " + artworkNumberField_2.getText() + " ��������܂���B");

					artworkNameField_2.setText("");
					mediaNumberField_2.setText("");
					termDayField_2.setText("");
					rentalChargeField_2.setText("");
					mediaNumberField_2.setFocusable(false);
					mediaNumberField_2.setEditable(false);
				}
			}
		});

		return artworkNumberField_2;
	}

	/**
	 * �}�ԁi�}�̔ԍ��j���Q�̐���
	 *
	 * @return �}�ԁi�}�̔ԍ��j���Q
	 */
	private JTextField createMediaNumberField_2() {

		mediaNumberField_2 = new JTextField();
		mediaNumberField_2.setSize(24, 20);
		mediaNumberField_2.setLocation(160, 340);

		mediaNumberField_2.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
			}

			@Override
			public void focusGained(FocusEvent e) {

				if (!mediaNumberField_2.getText().equals("")) {

					int dvdState = getDvdState(artworkNumberField_2.getText(), mediaNumberField_2.getText());

					if (dvdState == 0) {
						// �ݏo�\�ȏꍇ

						// �����Ƒݏo�����̐ݒ�
						rentalChargeField_2.setText(getRentalCharge(artworkNumberField_2.getText()));
						termDayField_2.setText(getTermDay(artworkNumberField_2.getText()));

						// ��i�ԍ����R�̗L����
						artworkNumberField_3.setFocusable(true);
						artworkNumberField_3.setEditable(true);

						// ���v���z�̎Z�o
						setTotal();

					} else {
						// �ݏo�s�\�ȏꍇ�G���[���b�Z�[�W��\������

						if (dvdState == -1) {
							// DVD���o�^����Ă��Ȃ��ꍇ

							messageLabel.setText(
									"��i�ԍ� " + artworkNumberField_2.getText() + " �� "
											+ "�}�ԁi�}�̔ԍ��j " + mediaNumberField_2.getText() + " ��"
											+ "������܂���B");

						} else if (dvdState == 2) {
							// DVD���ݏo��~�̏ꍇ

							messageLabel.setText(
									"��i�ԍ� " + artworkNumberField_2.getText() + " �� "
											+ "�}�ԁi�}�̔ԍ��j " + mediaNumberField_2.getText() + " ��"
											+ "�ݏo���s���Ă���܂���B");

						} else if (dvdState == 1) {
							// DVD���ݏo���̏ꍇ

							messageLabel.setText(
									"��i�ԍ� " + artworkNumberField_2.getText() + " �� "
											+ "�}�ԁi�}�̔ԍ��j " + mediaNumberField_2.getText() + " ��"
											+ "���ݑݏo���ł��B");

						}

						// �����Ƒݏo������������
						termDayField_2.setText("");
						rentalChargeField_2.setText("");

						// ��i�ԍ����R�̖�����
						artworkNumberField_3.setFocusable(false);
						artworkNumberField_3.setEditable(false);
					}
				}
			}
		});

		return mediaNumberField_2;
	}

	/**
	 * �n�C�t�����x���Q
	 *
	 * @return �n�C�t�����x���Q
	 */
	private JLabel createHyphenLabel_2() {

		hyphenLabel_2 = new JLabel("�|");
		hyphenLabel_2.setSize(14, 23);
		hyphenLabel_2.setLocation(145, 340);
		hyphenLabel_2.setBackground(new Color(205, 155, 255));

		return hyphenLabel_2;
	}

	/**
	 * ��i�����Q�̐���
	 *
	 * @return ��i�����Q
	 */
	private JTextField createArtworkNameField_2() {

		artworkNameField_2 = new JTextField();
		artworkNameField_2.setSize(175, 20);
		artworkNameField_2.setLocation(187, 340);

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
		termDayField_2.setLocation(370, 340);

		return termDayField_2;
	}

	/**
	 * �������Q�̐���
	 *
	 * @return �������Q
	 */
	private JTextField createChargeField_2() {

		rentalChargeField_2 = new JTextField();
		rentalChargeField_2.setSize(50, 20);
		rentalChargeField_2.setLocation(470, 340);

		return rentalChargeField_2;
	}

	//------------
	// �ݏo�R
	//------------
	/**
	 * �ݏo�ԍ����R�̐���
	 *
	 * @return �ݏo�ԍ����R
	 */
	private JTextField createRentalNumberField_3() {

		rentalNumberField_3 = new JTextField();
		rentalNumberField_3.setSize(65, 20);
		rentalNumberField_3.setLocation(12, 375);

		return rentalNumberField_3;
	}

	/**
	 * ��i�ԍ����R�̐���
	 *
	 * @return ��i�ԍ����R
	 */
	private JTextField createArtworkNumberField_3() {

		artworkNumberField_3 = new JTextField();
		artworkNumberField_3.setSize(55, 20);
		artworkNumberField_3.setLocation(89, 375);

		artworkNumberField_3.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if (rentalNumberField_3.getText().equals("")) {
					rentalNumberField_3.setText(getNewRentalNumber());
				}
			}

			@Override
			public void focusLost(FocusEvent e) {

				// ��i�����擾
				String artworkName = getArtworkName(artworkNumberField_3.getText());

				// ��i������Ύ}�ԁi�}�̔ԍ��j����͉\�ɂ���
				if (artworkName != null) {

					artworkNameField_3.setText(artworkName);
					mediaNumberField_3.setEditable(true);
					mediaNumberField_3.setFocusable(true);

				} else {
					// ��i���Ȃ��ꍇ�G���[���b�Z�[�W��\������

					messageLabel.setText("��i�ԍ� " + artworkNumberField_2.getText() + " ��������܂���B");

					artworkNameField_3.setText("");
					mediaNumberField_3.setText("");
					termDayField_3.setText("");
					rentalChargeField_3.setText("");
					mediaNumberField_3.setFocusable(false);
					mediaNumberField_3.setEditable(false);
				}
			}
		});

		return artworkNumberField_3;
	}

	/**
	 * �n�C�t�����x���R�̐���
	 *
	 * @return �n�C�t�����x���R
	 */
	private JLabel createHyphenLabel_3() {

		hyphenLabel_3 = new JLabel("�|");
		hyphenLabel_3.setSize(14, 23);
		hyphenLabel_3.setLocation(145, 375);
		hyphenLabel_3.setBackground(new Color(205, 155, 255));

		return hyphenLabel_3;
	}

	/**
	 * �}�ԁi�}�̔ԍ��j���R�̐���
	 *
	 * @return �}�ԁi�}�̔ԍ��j���R
	 */
	private JTextField createMediaNumberField_3() {

		mediaNumberField_3 = new JTextField();
		mediaNumberField_3.setSize(24, 20);
		mediaNumberField_3.setLocation(160, 375);

		mediaNumberField_3.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {

				if (!mediaNumberField_3.getText().equals("")) {

					int dvdState = getDvdState(artworkNumberField_3.getText(), mediaNumberField_3.getText());

					if (dvdState == 0) {
						// �ݏo�\�ȏꍇ

						// �����Ƒݏo�����̐ݒ�
						rentalChargeField_3.setText(getRentalCharge(artworkNumberField_3.getText()));
						termDayField_3.setText(getTermDay(artworkNumberField_3.getText()));

						// ���v���z�̎Z�o
						setTotal();

					} else {
						// �ݏo�s�\�ȏꍇ�G���[���b�Z�[�W��\������

						if (dvdState == -1) {
							// DVD���o�^����Ă��Ȃ��ꍇ

							messageLabel.setText(
									"��i�ԍ� " + artworkNumberField_3.getText() + " �� "
											+ "�}�ԁi�}�̔ԍ��j " + mediaNumberField_3.getText() + " ��"
											+ "������܂���B");

						} else if (dvdState == 2) {
							// DVD���ݏo��~�̏ꍇ

							messageLabel.setText(
									"��i�ԍ� " + artworkNumberField_3.getText() + " �� "
											+ "�}�ԁi�}�̔ԍ��j " + mediaNumberField_3.getText() + " ��"
											+ "�ݏo���s���Ă���܂���B");

						} else if (dvdState == 1) {
							// DVD���ݏo���̏ꍇ

							messageLabel.setText(
									"��i�ԍ� " + artworkNumberField_3.getText() + " �� "
											+ "�}�ԁi�}�̔ԍ��j " + mediaNumberField_3.getText() + " ��"
											+ "���ݑݏo���ł��B");

						}

						// �����Ƒݏo������������
						termDayField_3.setText("");
						rentalChargeField_3.setText("");
					}
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
		artworkNameField_3.setLocation(187, 375);

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
		termDayField_3.setLocation(370, 375);

		return termDayField_3;
	}

	/**
	 * �������R�̐���
	 *
	 * @return �������R
	 */
	private JTextField createChargeField_3() {

		rentalChargeField_3 = new JTextField();
		rentalChargeField_3.setSize(50, 20);
		rentalChargeField_3.setLocation(470, 375);

		return rentalChargeField_3;
	}

	/**
	 * ���v���z���x���̐���
	 *
	 * @return ���v���z���x��
	 */
	private JLabel createTotalLabel() {

		totalLabel = new JLabel("���v���z");
		totalLabel.setBounds(335, 415, 87, 23);
		totalLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		totalLabel.setBackground(new Color(205, 155, 255));

		return totalLabel;
	}

	/**
	 * ���v���̐���
	 *
	 * @return ���v��
	 */
	private JTextField createTotalField() {

		totalField = new JTextField();
		totalField.setSize(90, 30);
		totalField.setLocation(430, 411);

		return totalField;
	}

	/**
	 * ���s�{�^���̐���
	 *
	 * @return ���s�{�^��
	 */
	private JButton createExecButton() {

		executeButton = new JButton("���s");
		executeButton.setSize(70, 30);
		executeButton.setLocation(370, 500);
		executeButton.setFont(new Font("Dialog", Font.PLAIN, 18));
		executeButton.setBackground(Color.orange);

		executeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executeRental();
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
		backButton.setLocation(450, 500);
		backButton.setFont(new Font("Dialog", Font.PLAIN, 18));

		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// �E�B���h�E�����
				RentalView.this.dispose();
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
		messageLabel.setBounds(18, 529, 450, 28);
		messageLabel.setText("");

		return messageLabel;
	}

	//------------------------------------------------------------------------
	// �������\�b�h
	//------------------------------------------------------------------------

	/**
	 * �V�K�ݏo�ԍ��擾���\�b�h
	 *
	 * �f�[�^�x�[�X���猻�݂̑ݏo�ԍ��̍ő�l���擾���A
	 * �C���X�^���X�ϐ�newRentalNumber�ɐݒ肷��B
	 * 2��ڂ���̃A�N�Z�X��newRentalNumber���C���N�������g���āA
	 * �ݏo�ԍ��̕�����ɂ��ĕԂ��B
	 *
	 * @return �V�K�ݏo�ԍ�
	 */
	private String getNewRentalNumber() {

		// ���݂̑ݏo�ԍ���0(�ŏ��̃A�N�Z�X)
		if (newRentalNumber == 0) {

			String currentNumber = null; // ���݂̍ő�ݏo�ԍ�

			// ���݂̑ݏo�ԍ��̍ő���Ɖ�
			String sql = "SELECT rental_num FROM RENTAL_TABLE ORDER BY rental_num DESC";

			try (Connection connection = DriverManager.getConnection(url, userName, password);
					Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(sql);) {

				if (resultSet.next()) {
					currentNumber = resultSet.getString("rental_num");
				}

				// �ݏo���o�^����Ă��Ȃ��ꍇ�� 0�A
				// �o�^����Ă���ꍇ�� �ő�l+1
				if (currentNumber == null) {
					newRentalNumber = 1;
				} else {
					newRentalNumber = Integer.parseInt(currentNumber) + 1;
				}

			} catch (SQLException exception) {

				exception.printStackTrace();

				return null;
			}

		} else {

			// +1���ĐV�K�ݏo�ԍ��ɂ���
			newRentalNumber++;
		}
		String newNumber = zeroPad(newRentalNumber, 6);

		return newNumber;
	}

	/**
	 * ���l���󂯎��A��]�̒����܂Ő擪��0�Ŗ��߂�
	 * ������Ƃ��ĕԂ��������\�b�h
	 *
	 * @param value 0���߂��ĕϊ����������l
	 * @param length ��]�̒���
	 *
	 * @return ��]�̒����܂Ő擪��0�Ŗ��߂�������
	 */
	private String zeroPad(int value, int length) {

		String result = String.valueOf(value);

		while (result.length() < length) {
			result = "0" + result;
		}

		return result;
	}

	/**
	 * �ԋp�����̎擾
	 *
	 * ��i�ԍ�����ɕԋp�������擾����
	 *
	 * @return �ԋp����
	 */
	private String getTermDay(String artworkNumber) {

		// ��i�ԍ�����ɐV���敪���擾
		String recentDiv = getRecentDiv(artworkNumber);

		// �����e�[�u������ݏo���Ԃ��Ɖ��
		String sql = "SELECT rental_period FROM PRICE_TABLE WHERE recent_div = ?";

		String rentalPeriod;

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setString(1, recentDiv);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (!resultSet.next()) {
					return null;
				}

				rentalPeriod = resultSet.getString("rental_period");
			}

		} catch (SQLException exception) {

			exception.printStackTrace();

			return null;
		}

		int period = Integer.parseInt(rentalPeriod); // int�^�ɕϊ�

		// �{�����t�ɑݏo���Ԃ������ĕԋp�����ɂ���
		Calendar termDayCalendar = Calendar.getInstance();
		termDayCalendar.add(Calendar.DATE, period);

		// yyyy/MM/dd�̌`���ɕϊ�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date termDay = termDayCalendar.getTime();

		return sdf.format(termDay);
	}

	/**
	 * DVD�̏�Ԃ��擾����
	 *
	 * @param artworkNumber ��i�ԍ�
	 * @param mediaNumber �}�ԁi�}�̔ԍ��j
	 *
	 * @return -1:DVD���o�^����Ă��Ȃ��A0:DVD���ݏo�\�A1:DVD���ݏo���A2:DVD���ݏo�I��
	 */
	private int getDvdState(String artworkNumber, String mediaNumber) {

		// �}�ԁi�}�̔ԍ��j��2���ɂȂ�悤�ɏ���
		String w_mediaNumber = zeroPad(Integer.parseInt(mediaNumber), 2);

		try (Connection connection = DriverManager.getConnection(url, userName, password);) {

			// DVD�̑��݂��m�F
			String sql1 = "SELECT * FROM DVD_TABLE WHERE artwork_num = ? AND media_num = ?";

			try (PreparedStatement preparedStatement = connection.prepareStatement(sql1);) {

				preparedStatement.setString(1, artworkNumber);
				preparedStatement.setString(2, w_mediaNumber);

				try (ResultSet resultSet = preparedStatement.executeQuery();) {

					if (!resultSet.next()) {

						// DVD���o�^����Ă��Ȃ�
						return -1;
					}

					Date disuseDay = resultSet.getDate("disuse_day");

					if (disuseDay != null) {

						// DVD���ݏo�I��
						return 2;
					}
				}
			}

			// DVD���ݏo���̊m�F
			String sql2 = "SELECT * FROM RENTAL_TABLE WHERE artwork_num = ? AND media_num = ? AND check_in_day IS NULL";

			try (PreparedStatement preparedStatement = connection.prepareStatement(sql2);) {

				preparedStatement.setString(1, artworkNumber);
				preparedStatement.setString(2, w_mediaNumber);

				try (ResultSet resultSet = preparedStatement.executeQuery();) {

					if (resultSet.next()) {

						// DVD���ݏo��
						return 1;

					} else {

						// DVD���ݏo�\
						return 0;
					}
				}
			}

		} catch (SQLException exception) {
			exception.printStackTrace();
		}

		return -1;
	}

	/**
	 * �����擾���\�b�h
	 *
	 * ��i�ԍ�����ɗ������擾���郁�\�b�h
	 *
	 * @param artworkNumber ��i�ԍ�
	 * @return ����
	 */
	private String getRentalCharge(String artworkNumber) {

		// ��i�ԍ�����ɐV���敪���擾
		String saPridiv = getRecentDiv(artworkNumber);

		// �擾�����V���敪����ɗ������Ɖ�
		String sql = "SELECT rental_charge FROM PRICE_TABLE WHERE recent_div = ?";

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

			preparedStatement.setString(1, saPridiv);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (resultSet.next()) {
					return resultSet.getString("rental_charge");
				}
			}

		} catch (SQLException exception) {
			exception.printStackTrace();
		}

		return null;
	}

	/**
	 * ��i�ԍ�����ɓ��Y��i�̐V���敪���擾����
	 *
	 * @param artworkNumber ��i�ԍ�
	 *
	 * @return �V���敪
	 */
	private String getRecentDiv(String artworkNumber) {

		// ��i�e�[�u������V���敪���Ɖ�
		String sql = "SELECT recent_div FROM ARTWORK_TABLE WHERE artwork_num = ?";

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

			preparedStatement.setString(1, artworkNumber);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (resultSet.next()) {
					return resultSet.getString("recent_div");
				}
			}

		} catch (SQLException exception) {
			exception.printStackTrace();
		}

		return null;
	}

	/**
	 * ��i�ԍ������Ƃɍ�i�����擾����
	 *
	 * @param artworkNumber ��i�ԍ�
	 *
	 * @return ��i��
	 */
	private String getArtworkName(String artworkNumber) {

		// ��i���̏Ɖ�
		StringBuffer sql = new StringBuffer(0);
		sql.append("SELECT artwork_name, recent_div ");
		sql.append("FROM ARTWORK_TABLE ");
		sql.append("WHERE ");
		sql.append("artwork_num = ?");

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());) {

			preparedStatement.setString(1, artworkNumber);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (resultSet.next()) {
					return resultSet.getString("artwork_name");
				}
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return null;
	}

	/**
	 * ���v���z�̕\�����\�b�h
	 * ���v���z��\�����A���ʂƂ���
	 * 0�łȂ���΁A�u���s�v�{�^���̉������\�ɂ���
	 */
	private void setTotal() {

		String rentalCharge1 = rentalChargeField_1.getText();
		String rentalCharge2 = rentalChargeField_2.getText();
		String rentalCharge3 = rentalChargeField_3.getText();

		int total = 0;

		if (!rentalCharge1.equals("")) {
			total += Integer.parseInt(rentalCharge1);
		}

		if (!rentalCharge2.equals("")) {
			total += Integer.parseInt(rentalCharge2);
		}

		if (!rentalCharge3.equals("")) {
			total += Integer.parseInt(rentalCharge3);
		}

		// ���v���z�̐ݒ�
		totalField.setText(String.valueOf(total));

		// ���v���z��0�łȂ���΁u���s�v�{�^���̎g�p���ɂ���
		if (total != 0) {
			executeButton.setEnabled(true);
		} else {
			executeButton.setEnabled(false);
		}
	}

	/**
	 * �ݏo����
	 *
	 */
	private void executeRental() {

		int result = 0;

		// �ݏo�ڍׂP
		if ((!rentalChargeField_1.getText().equals("")) && rentalChargeField_1.getText() != null) {

			result = insert(rentalNumberField_1.getText(), artworkNumberField_1.getText(),
					mediaNumberField_1.getText(),
					termDayField_1.getText());
		}

		// �ݏo�ڍׂQ
		if ((!rentalChargeField_2.getText().equals("")) && rentalChargeField_2.getText() != null) {

			result = insert(rentalNumberField_2.getText(), artworkNumberField_2.getText(),
					mediaNumberField_2.getText(),
					termDayField_2.getText());
		}

		// �ݏo�ڍׂR
		if ((!rentalChargeField_3.getText().equals("")) && rentalChargeField_3.getText() != null) {

			result = insert(rentalNumberField_3.getText(), artworkNumberField_3.getText(),
					mediaNumberField_3.getText(),
					termDayField_3.getText());
		}

		// �}������
		if (result == 1) {

			messageLabel.setText("�ݏo�������������܂����B");
			clear();

		} else {

			messageLabel.setText("�ݏo�������ُ�I�����܂����B");
		}
	}

	/**
	 * �f�[�^�x�[�X�}�����\�b�h
	 *
	 * �p�����[�^����ɑݏo�����f�[�^�x�[�X�ɓo�^����
	 *
	 * @param rentalNumber �ݏo�ԍ�
	 * @param artworkNumber ��i�ԍ�
	 * @param mediaNumber ��i�}�ԁi�}�̔ԍ��j
	 * @param termDay �ԋp����
	 *
	 * @return 0:���s(0�s)
	 *          1:����(1�s)
	 */
	private int insert(String rentalNumber, String artworkNumber, String mediaNumber, String termDay) {

		// ����ԍ��̎擾
		String memberNumber = memberNumberField.getText();

		// �ݏo���̎擾
		// yyyyMMdd�̌`���ɕϊ�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String checkOutDay = sdf.format(new Date());

		// �}�ԁi�}�̔ԍ��j��2���`����
		String w_mediaNumber = zeroPad(Integer.parseInt(mediaNumber), 2);

		String sql = "INSERT INTO RENTAL_TABLE "
				+ "(rental_num, check_out_day, member_num, artwork_num, media_num, term_day) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

			preparedStatement.setString(1, rentalNumber);
			preparedStatement.setString(2, checkOutDay);
			preparedStatement.setString(3, memberNumber);
			preparedStatement.setString(4, artworkNumber);
			preparedStatement.setString(5, w_mediaNumber);
			preparedStatement.setString(6, termDay);

			return preparedStatement.executeUpdate();

		} catch (SQLException exception) {
			exception.printStackTrace();
		}

		return 0;

	}

	/**
	 * �N���A���\�b�h
	 * ���i���N���A���A�t�H�[�J�X��������Ԃɂ���
	 * ���\�b�h�B�N�����Ƒݏo�������ɌĂяo�����
	 */
	private void clear() {

		// ������
		memberNumberField.setText("");

		memberNameField.setText("");
		memberNameField.setEditable(false);
		memberNameField.setFocusable(false);

		rankDivField.setText("");
		rankDivField.setEditable(false);
		rankDivField.setFocusable(false);

		// �ݏo��
		checkOutDayField.setText("");
		checkOutDayField.setEditable(false);
		checkOutDayField.setFocusable(false);

		// �ݏo1�s��
		rentalNumberField_1.setText("");
		rentalNumberField_1.setEditable(false);
		rentalNumberField_1.setFocusable(false);

		artworkNumberField_1.setText("");
		artworkNumberField_1.setEditable(false);
		artworkNumberField_1.setFocusable(false);

		artworkNameField_1.setText("");
		artworkNameField_1.setEditable(false);
		artworkNameField_1.setFocusable(false);

		mediaNumberField_1.setText("");
		mediaNumberField_1.setEditable(false);
		mediaNumberField_1.setFocusable(false);

		rentalChargeField_1.setText("");
		rentalChargeField_1.setEditable(false);
		rentalChargeField_1.setFocusable(false);

		termDayField_1.setText("");
		termDayField_1.setEditable(false);
		termDayField_1.setFocusable(false);

		// �ݏo2�s��
		rentalNumberField_2.setText("");
		rentalNumberField_2.setEditable(false);
		rentalNumberField_2.setFocusable(false);

		artworkNumberField_2.setText("");
		artworkNumberField_2.setEditable(false);
		artworkNumberField_2.setFocusable(false);

		artworkNameField_2.setText("");
		artworkNameField_2.setEditable(false);
		artworkNameField_2.setFocusable(false);

		mediaNumberField_2.setText("");
		mediaNumberField_2.setEditable(false);
		mediaNumberField_2.setFocusable(false);

		rentalChargeField_2.setText("");
		rentalChargeField_2.setEditable(false);
		rentalChargeField_2.setFocusable(false);

		termDayField_2.setText("");
		termDayField_2.setEditable(false);
		termDayField_2.setFocusable(false);

		// �ݏo3�s��
		rentalNumberField_3.setText("");
		rentalNumberField_3.setEditable(false);
		rentalNumberField_3.setFocusable(false);

		artworkNumberField_3.setText("");
		artworkNumberField_3.setEditable(false);
		artworkNumberField_3.setFocusable(false);

		artworkNameField_3.setText("");
		artworkNameField_3.setEditable(false);
		artworkNameField_3.setFocusable(false);

		mediaNumberField_3.setText("");
		mediaNumberField_3.setEditable(false);
		mediaNumberField_3.setFocusable(false);

		rentalChargeField_3.setText("");
		rentalChargeField_3.setEditable(false);
		rentalChargeField_3.setFocusable(false);

		termDayField_3.setText("");
		termDayField_3.setEditable(false);
		termDayField_3.setFocusable(false);

		// ���v���z
		totalField.setText("");
		totalField.setEditable(false);
		totalField.setFocusable(false);

		// ���s�{�^��
		executeButton.setEnabled(false);

	}

	/**
	 * �����̓��t��\����������擾����
	 *
	 * @return �����̓��t�̕�����iyyyy/MM/dd �`���j
	 */
	private String getToday() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		return sdf.format(new Date());
	}
}
