package rentalSystem.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import rentalSystem.db.access.DvdDBAccess;
import rentalSystem.db.record.ArtworkObj;
import rentalSystem.db.record.DvdObj;

/**
 * DVD�Ǘ����
 *
 */
public class DvdView extends JFrame {

	/** �I�𒆂̃��[�h�@1:�o�^�@2:�X�V�@3:�폜*/
	private int selectedMode = 0;

	// �o�^�A�X�V�A�폜�̃��[�h�I��
	private JPanel modeSelectPanel;
	private JRadioButton registerRadioButton;
	private JRadioButton updateRadiuoButton;
	private JRadioButton deleteRadioButton;
	private ButtonGroup modeGroup;

	// ��i�ԍ��Ɣ}�̔ԍ��i�}�̔ԍ��j��
	private JLabel artworkNumberLabel;
	private JTextField artworkNumberField;
	private JLabel mediaNumberLabel;
	private JTextField mediaNumberField;
	private JLabel separetorLabel;
	private JButton searchButton;

	// ��i����
	private JLabel artworkNameLabel;
	private JTextField artworkNameField;

	// �V���敪�I���{�b�N�X
	private JLabel recentDivLabel;
	private JComboBox<String> recentDivBox;

	// �W�������I���{�b�N�X
	private JLabel genreLabel;
	private JComboBox<String> genreBox;

	// ���ד���
	private JLabel entryDayLabel;
	private JTextField entryDayField;

	// �폜����
	private JLabel disuseDayLabel;
	private JTextField disuseDayField;

	// ���s�A�߂�{�^��
	private JButton executeButton;
	private JButton backButton;

	// ���b�Z�[�W���x��
	private JLabel messageLabel;

	// DB�A�N�Z�X�I�u�W�F�N�g
	private DvdDBAccess dvdDBAccess;

	/**
	 * �R���X�g���N�^
	 *
	 * @param url �f�[�^�x�[�X�ڑ�URL
	 * @param userName ���[�U��
	 * @param password �p�X���[�h
	 */
	public DvdView(String url, String userName, String password) {

		super();

		dvdDBAccess = new DvdDBAccess(url, userName, password);

		initialize();
	}

	/**
	 * GUI���i�Q�̏�����
	 */
	private void initialize() {

		this.setTitle("�����^���V�X�e��<DVD�Ǘ�>");

		this.setBounds(0, 0, 540, 400);
		this.setLayout(null);

		Container container = this.getContentPane();
		container.setBackground(new Color(155, 155, 255));

		// �@�\�I���p�l��
		container.add(createModeSelectPanel());

		artworkNumberLabel = new JLabel("��i�ԍ�");
		artworkNumberLabel.setBounds(175, 44, 90, 25);
		artworkNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		container.add(artworkNumberLabel);
		container.add(createArtworkNumberField());

		separetorLabel = new JLabel("�|");
		separetorLabel.setBounds(294, 71, 34, 25);
		separetorLabel.setHorizontalAlignment(JLabel.CENTER);
		separetorLabel.setFont(new Font("Dialog", Font.PLAIN, 24));
		container.add(separetorLabel);

		mediaNumberLabel = new JLabel("�}�̔ԍ�");
		mediaNumberLabel.setBounds(334, 41, 70, 25);
		mediaNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		container.add(mediaNumberLabel);
		container.add(createMediaNumberField());

		// �����{�^��
		container.add(createSearchButton());

		artworkNameLabel = new JLabel("��i��");
		artworkNameLabel.setBounds(15, 150, 70, 25);
		artworkNameLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		container.add(artworkNameLabel);
		container.add(createArtworkNameField());

		recentDivLabel = new JLabel("�V���敪");
		recentDivLabel.setBounds(290, 150, 80, 25);
		recentDivLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		container.add(recentDivLabel);
		container.add(createRecentDivBox());

		genreLabel = new JLabel("�W������");
		genreLabel.setBounds(390, 150, 80, 25);
		genreLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		container.add(genreLabel);
		container.add(createGenreBox());

		entryDayLabel = new JLabel("���ד�");
		entryDayLabel.setBounds(15, 235, 70, 25);
		entryDayLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		container.add(entryDayLabel);
		container.add(createInsertField());

		disuseDayLabel = new JLabel("�폜��");
		disuseDayLabel.setBounds(200, 235, 70, 25);
		disuseDayLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		container.add(disuseDayLabel);
		container.add(createDeleteField());

		// ���s�{�^��
		container.add(createExecuteButton());

		// �߂�{�^��
		container.add(createBackButton());

		// ���b�Z�[�W���x��
		messageLabel = new JLabel("");
		messageLabel.setBounds(15, 310, 336, 25);
		container.add(messageLabel);

		clearAll();
	}

	/**
	 * �@�\�I���p�l���̐���
	 *
	 * �u�o�^�v�u�X�V�v�u�폜�v�̋@�\�I���̃��W�I�{�^�����o�^���ꂽ�p�l���𐶐�����
	 *
	 * @return �@�\�I���p�l��
	 */
	private JPanel createModeSelectPanel() {

		modeSelectPanel = new JPanel();
		modeSelectPanel.setBounds(15, 45, 140, 75);
		modeSelectPanel.setBackground(new Color(153, 255, 204));

		GridLayout gridLayout = new GridLayout();
		modeSelectPanel.setLayout(gridLayout);
		gridLayout.setRows(3);
		gridLayout.setColumns(1);

		// �p�l���Ƀ��W�I�{�^����ǉ�
		modeSelectPanel.add(createRegisterRadioButton());
		modeSelectPanel.add(createUpdateRadiuoButton());
		modeSelectPanel.add(createDeleteRadioButton());

		// ���W�I�{�^���̃O���[�v��
		modeGroup = new ButtonGroup();
		modeGroup.add(registerRadioButton);
		modeGroup.add(updateRadiuoButton);
		modeGroup.add(deleteRadioButton);

		return modeSelectPanel;
	}

	/**
	 * �o�^�̃��W�I�{�^���̐���
	 *
	 * �o�^�I�����ɂ͍�i�ԍ����̂ݓ��͉\�ƂȂ�
	 *
	 * @return �o�^�̃��W�I�{�^��
	 */
	private JRadioButton createRegisterRadioButton() {

		registerRadioButton = new JRadioButton("�o�^");
		registerRadioButton.setOpaque(false);

		// �I�����ꂽ�ۂ̏�����ǉ�
		registerRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {

				clearDvdInformation();

				// �I���t���O��1(�o�^)�ɂ���
				selectedMode = 1;

				// ��i�ԍ�����͉\�ɂ���
				artworkNumberField.setFocusable(true);
				artworkNumberField.setEditable(true);

				// �}�̔ԍ�����͕s�ɂ���
				mediaNumberField.setFocusable(false);
				mediaNumberField.setEditable(false);

				// �����{�^�����g�p�\�ɂ���
				searchButton.setEnabled(true);

			}
		});

		return registerRadioButton;
	}

	/**
	 * �X�V�̃��W�I�{�^���̐���
	 *
	 * �X�V�I�����ɂ͍�i�ԍ����̂ݓ��͉\�ƂȂ�
	 *
	 * @return �X�V�̃��W�I�{�^��
	 */
	private JRadioButton createUpdateRadiuoButton() {

		updateRadiuoButton = new JRadioButton("�X�V");
		updateRadiuoButton.setOpaque(false);

		// �I�����ꂽ�ۂ̏�����ǉ�
		updateRadiuoButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {

				clearDvdInformation();

				// �I���t���O��2(�X�V)��Ԃɂ���
				selectedMode = 2;

				// ��i�ԍ�����͉\�ɂ���
				artworkNumberField.setFocusable(true);
				artworkNumberField.setEditable(true);

				// �}�̔ԍ�����͕s�ɂ���
				mediaNumberField.setFocusable(false);
				mediaNumberField.setEditable(false);

				// �����{�^�����g�p�\�ɂ���
				searchButton.setEnabled(true);
			}
		});

		return updateRadiuoButton;
	}

	/**
	 * �폜�̃��W�I�{�^���̐���
	 *
	 * �폜�I�����ɂ͍�i�ԍ��Ɣ}�̔ԍ��̗��̂ݓ��͉\�ƂȂ�
	 *
	 * @return �폜�̃��W�I�{�^��
	 */
	private JRadioButton createDeleteRadioButton() {

		deleteRadioButton = new JRadioButton("�폜");
		deleteRadioButton.setOpaque(false);

		deleteRadioButton.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent event) {

				clearDvdInformation();

				// �I���t���O��3(�폜)�ɂ���
				selectedMode = 3;

				// ��i�ԍ��Ɣ}�̔ԍ�����͉\�ɂ���
				artworkNumberField.setFocusable(true);
				artworkNumberField.setEditable(true);
				mediaNumberField.setFocusable(true);
				mediaNumberField.setEditable(true);

				// �����{�^�����g�p�\�ɂ���
				searchButton.setEnabled(true);
			}
		});

		return deleteRadioButton;
	}

	/**
	 * ��i�ԍ����̐���
	 *
	 * @return ��i�ԍ���
	 */
	private JTextField createArtworkNumberField() {

		artworkNumberField = new JTextField();
		artworkNumberField.setBounds(177, 69, 110, 30);
		artworkNumberField.setFont(new Font("Dialog", Font.PLAIN, 14));

		return artworkNumberField;
	}

	/**
	 * ��i�}�̔ԍ����̐���
	 *
	 * @return ��i�}�̔ԍ���
	 */
	private JTextField createMediaNumberField() {

		mediaNumberField = new JTextField();
		mediaNumberField.setBounds(334, 68, 60, 30);
		mediaNumberField.setFont(new Font("Dialog", Font.PLAIN, 14));

		return mediaNumberField;
	}

	/**
	 * �����{�^���̐���
	 *
	 * �����{�^�����������ۂ̏����̓��[�h�ɂ���Ĉȉ��̂悤�ɕ��򂷂�
	 * �E�o�^
	 * �@�@���͂��ꂽ��i�ԍ������݂���ꍇ�́A��i����\������<br>
	 * �@�@���ד���ҏW�\�ɂ��A�����l�Ƃ��Ė{���̓��t����͂���<br>
	 *
	 * �E�X�V
	 * �@�@��i����\�����A�ҏW�\�ɂ���
	 *
	 * �E�폜
	 * �@�@��i����\�����A�ҏW�\�ɂ���
	 *
	 * @return �����{�^��
	 */
	private JButton createSearchButton() {

		searchButton = new JButton("����");
		searchButton.setBounds(427, 87, 70, 30);
		searchButton.setFont(new Font("Dialog", Font.PLAIN, 18));

		searchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {

				messageLabel.setText("");

				// ���͂��ꂽ��i�ԍ��ɑΉ������i���o�^����Ă��Ȃ��ꍇ�A
				// �G���[���b�Z�[�W��\������
				if (!setArtWork()) {
					messageLabel.setText("��i�ԍ� " + artworkNumberField.getText() + " �o�^����Ă��܂���B");

					// �V���敪��I��s�\��
					recentDivBox.setEnabled(false);
					recentDivBox.setFocusable(false);

					// �W��������I��s�\��
					genreBox.setEnabled(false);
					genreBox.setFocusable(false);

					return;
				}

				if (selectedMode == 1) {
					// �o�^����

					setNewMediaNumber();

					// �V���敪��I��s�\��
					recentDivBox.setEnabled(false);
					recentDivBox.setFocusable(false);

					// �W��������I��s�\��
					genreBox.setEnabled(false);
					genreBox.setFocusable(false);

					// ���ד�����͉\�ɂ���
					entryDayField.setFocusable(true);
					entryDayField.setEditable(true);

					// ���ד��ɍ����̓��t������
					entryDayField.setText(getToday());

					// ���s�{�^�����g�p�\�ɂ���
					executeButton.setEnabled(true);

				} else if (selectedMode == 2) {
					// �X�V����

					// �V���敪��I���\��
					recentDivBox.setEnabled(true);
					recentDivBox.setFocusable(true);

					// �W��������I���\��
					genreBox.setEnabled(true);
					genreBox.setFocusable(true);

					// ���s�{�^�����g�p�\�ɂ���
					executeButton.setEnabled(true);

				} else if (selectedMode == 3) {
					// �폜����

					setArtWork();
					setEntryDay();

					// �V���敪��I��s�\��
					recentDivBox.setEnabled(false);
					recentDivBox.setFocusable(false);

					// �W��������I��s�\��
					genreBox.setEnabled(false);
					genreBox.setFocusable(false);

					// �폜���ɍ����̓��t������
					disuseDayField.setText(getToday());
				}
			}
		});

		return searchButton;
	}

	/**
	 * ��i�敪�I���{�b�N�X�̐���
	 *
	 * @return ��i�敪�I���{�b�N�X
	 */
	private JComboBox<String> createRecentDivBox() {

		recentDivBox = new JComboBox<String>();
		recentDivBox.setBounds(290, 180, 75, 30);
		recentDivBox.setFont(new Font("Dialog", Font.PLAIN, 14));

		recentDivBox.addItem("�V");
		recentDivBox.addItem("��");
		recentDivBox.addItem("��");

		return recentDivBox;
	}

	/**
	 * ��i�����̐���
	 *
	 * @return ��i����
	 */
	private JTextField createArtworkNameField() {

		artworkNameField = new JTextField();
		artworkNameField.setBounds(15, 180, 265, 30);
		artworkNameField.setFont(new Font("Dialog", Font.PLAIN, 14));

		return artworkNameField;
	}

	/**
	 * ��i�W�������I���{�b�N�X�̐���
	 *
	 * @return ��i�W�������I���{�b�N�X
	 */
	private JComboBox<String> createGenreBox() {

		genreBox = new JComboBox<String>();
		genreBox.setBounds(390, 180, 130, 30);
		genreBox.setFont(new Font("Dialog", Font.PLAIN, 14));

		genreBox.addItem("�z���[");
		genreBox.addItem("�l���h���}");
		genreBox.addItem("�A�N�V����");
		genreBox.addItem("�J���t�[");
		genreBox.addItem("�푈");
		genreBox.addItem("���̑�");

		return genreBox;
	}

	/**
	 * ���ד����̐���
	 *
	 * @return ���ד���
	 */
	private JTextField createInsertField() {

		entryDayField = new JTextField();
		entryDayField.setBounds(15, 265, 150, 30);

		return entryDayField;
	}

	/**
	 * �폜�����̐���
	 *
	 * @return �폜����
	 */
	private JTextField createDeleteField() {

		disuseDayField = new JTextField();
		disuseDayField.setBounds(200, 265, 150, 30);

		return disuseDayField;
	}

	/**
	 * ���s�{�^���̐���
	 *
	 * ���s�{�^�����������ۂ̓��[�h�ɂ���Ċe�������\�b�h�����s����
	 *
	 * @return ���s�{�^��
	 */
	private JButton createExecuteButton() {

		executeButton = new JButton("���s");
		executeButton.setBounds(370, 280, 70, 30);
		executeButton.setFont(new Font("Dialog", Font.PLAIN, 18));
		executeButton.setBackground(Color.orange);

		executeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {

				messageLabel.setText("");

				if (selectedMode == 1) {
					// �o�^�̏ꍇ

					entryDvd();

				} else if (selectedMode == 2) {
					// �X�V�̏ꍇ

					updateArtwork();

				} else if (selectedMode == 3) {
					// �폜�̏ꍇ

					disuseDvd();
				}
			}
		});

		return executeButton;
	}

	/**
	 * �߂�{�^���̐���
	 *
	 * �߂�{�^���������ꂽ�ꍇ�́A���̃t���[����p������
	 *
	 * @return �߂�{�^��
	 */
	private JButton createBackButton() {

		backButton = new JButton();
		backButton.setBounds(450, 280, 70, 30);
		backButton.setText("�߂�");
		backButton.setFont(new Font("Dialog", Font.PLAIN, 18));

		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {

				messageLabel.setText("");

				DvdView.this.dispose();
			}
		});

		return backButton;
	}

	/**
	 * ��i�ԍ������i���E�敪�E�W���������擾���A�e���i�ɒl��ݒ肷��
	 *
	 * @return �擾�ɐ��������ꍇ��true�A�擾�ł��Ȃ������ꍇ��false
	 */
	private boolean setArtWork() {

		if (artworkNumberField.getText() == null || artworkNumberField.getText().equals("")) {

			messageLabel.setText("��i�ԍ� ����͂��Ă�������");
			return false;
		}

		ArtworkObj artworkObj = dvdDBAccess.getArtwork(artworkNumberField.getText());

		if (artworkObj == null) {
			return false;
		}

		// �擾������i����\������
		artworkNameField.setText(artworkObj.getArtworkName());
		recentDivBox.setSelectedItem(artworkObj.getRecentDiv());
		genreBox.setSelectedItem(artworkObj.getGenreName());

		return true;

	}

	/**
	 * ��i�ԍ��Ɣ}�̔ԍ�������ד����擾���A���ד����ɐݒ肷��
	 */
	private void setEntryDay() {

		DvdObj dvdObj = dvdDBAccess.getDvdRecord(artworkNumberField.getText(), mediaNumberField.getText());

		if (dvdObj == null) {

			messageLabel.setText("��i�ԍ� " + artworkNumberField.getText() + " ��"
					+ "�}�̔ԍ� " + mediaNumberField.getText() + " ��������܂���");

			mediaNumberField.setText("");

			return;
		}

		entryDayField.setText(dvdObj.getEntryDay().substring(0, 10));

		if (dvdObj.getDisuseDay() != null && !dvdObj.getDisuseDay().equals("")) {

			messageLabel.setText("��i�ԍ� " + artworkNumberField.getText() + " ��"
					+ "�}�̔ԍ� " + mediaNumberField.getText() + " �͊��ɍ폜����Ă��܂��B");

			disuseDayField.setText(dvdObj.getDisuseDay().substring(0, 10));
			mediaNumberField.setText("");

			return;
		}

		executeButton.setEnabled(true);
	}

	/**
	 * �Ώۂ̍�i�ɂ��āA�V�K�̔}�̔ԍ����擾���A�}�̔ԍ����ɐݒ肷��
	 *
	 * �V�K�̔}�̔ԍ��́A���݂̔}�̔ԍ��̍ő�l�{1�̔ԍ��ƂȂ�
	 *
	 */
	private void setNewMediaNumber() {

		String newMediaNumber = dvdDBAccess.getNextMediaNumber(artworkNumberField.getText());

		mediaNumberField.setText(newMediaNumber);
	}

	/**
	 * DVD���̃N���A
	 *
	 */
	private void clearDvdInformation() {

		artworkNumberField.setText("");
		artworkNumberField.setEditable(false);
		artworkNumberField.setFocusable(false);

		mediaNumberField.setText("");
		mediaNumberField.setEditable(false);
		mediaNumberField.setFocusable(false);

		artworkNameField.setText("");
		artworkNameField.setEditable(false);
		artworkNameField.setFocusable(false);

		recentDivBox.setSelectedIndex(0);
		recentDivBox.setFocusable(false);
		recentDivBox.setEnabled(false);

		genreBox.setSelectedIndex(0);
		genreBox.setFocusable(false);
		genreBox.setEnabled(false);

		entryDayField.setText("");
		entryDayField.setEditable(false);
		entryDayField.setFocusable(false);

		disuseDayField.setText("");
		disuseDayField.setEditable(false);
		disuseDayField.setFocusable(false);

		searchButton.setEnabled(false);

		executeButton.setEnabled(false);

		messageLabel.setText("");
	}

	/**
	 * ��ʓ��e�̃N���A
	 *
	 */
	private void clearAll() {

		modeGroup.clearSelection();

		clearDvdInformation();
	}

	/**
	 * DVD�̓��׏���
	 */
	private void entryDvd() {

		int result = 0;

		String artworkNumber = artworkNumberField.getText();
		String mediaNumber = mediaNumberField.getText();
		String entryDay = entryDayField.getText();

		result = dvdDBAccess.entryDvd(artworkNumber, mediaNumber, entryDay);

		if (result == 1) {

			clearAll();

			messageLabel.setText("��i�ԍ� " + artworkNumber + " �� �}�̔ԍ� " + mediaNumber + " ��ǉ����܂����B");
		}
	}

	/**
	 * ��i���̍X�V����
	 */
	private void updateArtwork() {

		String artworkNumber = artworkNumberField.getText();
		String recentDiv = recentDivBox.getItemAt(recentDivBox.getSelectedIndex());
		String genre = genreBox.getItemAt(genreBox.getSelectedIndex());

		ArtworkObj artworkObj = new ArtworkObj();

		if (artworkNumber != null && !artworkNumber.equals("")) {
			artworkObj.setArtworkNumber(artworkNumber);
		}

		// �V���敪
		if (recentDiv != null && !recentDiv.equals("")) {
			artworkObj.setRecentDiv(recentDiv);
		}

		// �W������
		if (genre != null && !genre.equals("")) {
			artworkObj.setGenreName(genre);
		}

		// �X�V�̎��s
		int result = dvdDBAccess.updateArtwork(artworkObj);

		if (result == 1) {

			clearAll();
			messageLabel.setText("��i�ԍ� " + artworkNumber + " ���X�V���܂����B");

		} else {

			messageLabel.setText("��i�ԍ� " + artworkNumber + " �̍X�V�Ɏ��s���܂����B");
		}
	}

	/**
	 * DVD�̍폜����
	 */
	private void disuseDvd() {

		String artworkNumber = artworkNumberField.getText();
		String mediaNumber = mediaNumberField.getText();
		String disuseDay = getToday();

		DvdObj dvdObj = new DvdObj();

		dvdObj.setArtworkNumber(artworkNumber);
		dvdObj.setMediaNumber(mediaNumber);
		dvdObj.setDisuseDay(disuseDay);

		int result = dvdDBAccess.updateDvd(dvdObj);

		if (result == 1) {

			clearAll();
			messageLabel.setText("��i�ԍ� " + artworkNumber + " �� �}�̔ԍ� " + mediaNumber + " ���폜���܂����B");

		} else {
			messageLabel.setText("�폜�����Ɏ��s���܂����B");
		}
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
