package rentalSystem.view;

import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * DVD�������
 *
 * ��i�ԍ��Ō������A�o�^����Ă���DVD�̈ꗗ��\������B
 */
public class SearchView extends JFrame {

	private JLabel artworkNumberLabel;
	private JTextField artworkNumberField;
	private JButton searchButton;

	private JLabel artworkNameLabel;
	private JTextField artworkNameField;

	private JScrollPane scrollPanel;
	private JTable resultTable;

	private JLabel messageLabel;

	private final String url;
	private final String userName;
	private final String password;

	/**
	 * �R���X�g���N�^
	 *
	 * @param url �f�[�^�x�[�X�ڑ�URL
	 * @param userName ���[�U��
	 * @param password �p�X���[�h
	 */
	public SearchView(String url, String userName, String password) {

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

		this.setTitle("�����^���V�X�e��<DVD����>");

		this.setBounds(0, 0, 540, 400);
		this.setLayout(null);

		Container container = this.getContentPane();

		container.add(createArtworkNumberLabel());
		container.add(createArtworkNumberField());
		container.add(createSearchButton());

		container.add(createArtworkNameLabel());
		container.add(createArtworkNameField());

		container.add(createScrollPane());

		container.add(createMessageLabel());

		clearTableData();

	}

	/**
	 * ��i�ԍ����x�����쐬����
	 *
	 * @return ��i�ԍ����x��
	 */
	private JLabel createArtworkNumberLabel() {

		artworkNumberLabel = new JLabel("��i�ԍ�");
		artworkNumberLabel.setBounds(10, 10, 70, 20);

		return artworkNumberLabel;
	}

	/**
	 * ��i�ԍ������쐬����
	 *
	 * @return ��i�ԍ���
	 */
	private JTextField createArtworkNumberField() {

		artworkNumberField = new JTextField("");
		artworkNumberField.setBounds(70, 10, 300, 20);

		return artworkNumberField;
	}

	/**
	 * �����{�^�����쐬����
	 *
	 * �����{�^�����N���b�N����ƁA��i�ԍ��Ńf�[�^�x�[�X���������A
	 * ��i����DVD�̏���\������
	 *
	 *
	 * @return �����{�^��
	 */
	private JButton createSearchButton() {

		searchButton = new JButton("����");
		searchButton.setBounds(400, 10, 80, 20);

		searchButton.addActionListener((e) -> {

			messageLabel.setText("");

			String artworkNumber = artworkNumberField.getText();

			// ��i�ԍ������i������������
			String artworkName = getArtworkName(artworkNumber);

			// �Y�������i�񂪓o�^����Ă��Ȃ��ꍇ�̓��b�Z�[�W��\�����A
			// �������ʂ�����������
			if (artworkName == null) {

				messageLabel.setText(
						"��i�ԍ� " + artworkNumber + " �͓o�^����Ă��܂���B");

				artworkNameField.setText("");
				clearTableData();

				return;
			}

			// DVD�̏�����������
			String[][] data = getDvdInformation(artworkNumber);

			// �������ʂ𔽉f����
			artworkNameField.setText(artworkName);
			setTableData(data);
		});

		return searchButton;
	}

	/**
	 * ��i�����x�����쐬����
	 *
	 * @return ��i�����x��
	 */
	private JLabel createArtworkNameLabel() {

		artworkNameLabel = new JLabel("��i��");
		artworkNameLabel.setBounds(10, 35, 70, 20);

		return artworkNameLabel;
	}

	/**
	 * ��i�������쐬����
	 *
	 * ��i�����͕ҏW�s�Ƃ���B
	 *
	 * @return ��i����
	 */
	private JTextField createArtworkNameField() {

		artworkNameField = new JTextField("");
		artworkNameField.setBounds(70, 35, 300, 20);

		// �ҏW�s�ɐݒ肷��
		artworkNameField.setEditable(false);

		return artworkNameField;
	}

	/**
	 * DVD���̃e�[�u���悤�ɃX�N���[���\�ȃp�l�����쐬����
	 *
	 * @return �X�N���[���p�l��
	 */
	private JScrollPane createScrollPane() {

		scrollPanel = new JScrollPane();
		scrollPanel.setBounds(10, 60, 505, 280);

		return scrollPanel;
	}

	/**
	 * ���b�Z�[�W���x�����쐬����
	 *
	 * @return ���b�Z�[�W���x��
	 */
	private JLabel createMessageLabel() {

		messageLabel = new JLabel("");
		messageLabel.setBounds(10, 340, 510, 20);

		return messageLabel;
	}

	/**
	 * ��i�ԍ������i�����擾����
	 *
	 * @param artworkNumber ��i�ԍ�
	 * @return ��i���i��i�����擾�ł��Ȃ��ꍇ��null�j
	 */
	private String getArtworkName(String artworkNumber) {

		// ��i�ԍ������i�����Ɖ��
		String sql = "SELECT artwork_name FROM ARTWORK_TABLE WHERE artwork_num = ?;";

		try (Connection connection =
				DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement =
						connection.prepareStatement(sql);) {

			preparedStatement.setString(1, artworkNumber);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (resultSet.next()) {
					return resultSet.getString("artwork_name");
				}
			}

		} catch (SQLException exception) {
			throw new RuntimeException(exception);
		}

		return null;
	}

	/**
	 * ��i�ԍ�����DVD�̏��̈ꗗ���擾����
	 *
	 * DVD���́A�}�̔ԍ��A��ԁA���ד��A�ݏo��~���A
	 * �ݏo���A�ԋp�����A�ݏo�ԍ��ō\��������ŁA
	 * ���ꂼ��𕶎���Ƃ��Ĉ����B
	 * �߂�l�ł���DVD���̈ꗗ�́A������^��2�����z��Ƃ��ĕԂ�
	 *
	 * @param artworkNumber ��i�ԍ�
	 *
	 * @return DVD���̈ꗗ
	 */
	private String[][] getDvdInformation(String artworkNumber) {

		ArrayList<TableRow> dataList = new ArrayList<TableRow>();

		// DVD�e�[�u���ɓo�^����Ă�����ƁA
		// �ݏo�e�[�u���ɓo�^����Ă���ݏo���̏����������ďЉ��
		// �Љ�̌��ʂ͔}�̔ԍ����ɕ��בւ���
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ");
		sql.append("DVD.media_num, entry_day, disuse_day, ");
		sql.append("rental_num, check_out_day, term_day ");
		sql.append("FROM");
		sql.append("(SELECT media_num, entry_day, disuse_day ");
		sql.append("FROM DVD_TABLE ");
		sql.append("WHERE artwork_num = ?) AS DVD ");
		sql.append("LEFT JOIN ");
		sql.append("(SELECT media_num, rental_num, check_out_day, term_day  ");
		sql.append("FROM RENTAL_TABLE ");
		sql.append("WHERE artwork_num = ? AND check_in_day IS NULL) AS RENTAL ");
		sql.append("ON DVD.media_num = RENTAL.media_num ");
		sql.append("ORDER BY DVD.media_num;");

		try (Connection connection =
				DriverManager.getConnection(url, userName, password);) {

			try (PreparedStatement preparedStatement =
					connection.prepareStatement(sql.toString());) {

				preparedStatement.setString(1, artworkNumber);
				preparedStatement.setString(2, artworkNumber);

				// DVD���̏Ɖ�
				try (ResultSet resultSet = preparedStatement.executeQuery();) {

					while (resultSet.next()) {

						// �e�[�u���̍s�f�[�^�̍쐬
						TableRow tableRow =
								new TableRow(resultSet.getString("media_num"));

						tableRow.entryDay = resultSet.getDate("entry_day");
						tableRow.disuseDay = resultSet.getDate("disuse_day");
						tableRow.checkOutDay = resultSet.getDate("check_out_day");
						tableRow.termDay = resultSet.getDate("term_day");
						tableRow.rentalNumber = resultSet.getString("rental_num");

						dataList.add(tableRow);
					}
				}
			}

		} catch (SQLException exception) {
			throw new RuntimeException(exception);
		}

		String[][] dataArray = new String[dataList.size()][7];
		for (int i = 0; i < dataList.size(); i++) {

			TableRow tableRow = dataList.get(i);
			dataArray[i] = tableRow.toStringArray();
		}

		return dataArray;
	}

	/**
	 * �\�̓��e���폜����
	 */
	private void clearTableData() {
		setTableData(null);
	}

	/**
	 * �n���ꂽDVD���̈ꗗ����\���쐬����
	 * null���n���ꂽ�ꍇ�͋�̕\���쐬����
	 *
	 * @param data DVD���̈ꗗ
	 */
	private void setTableData(String[][] data) {

		// �e�[�u���̃^�C�g��
		String[] columns = { "�}�̔ԍ�", "���", "���ד�", "�폜��", "�ݏo��",
				"�ԋp����", "�ݏo�ԍ�" };

		if (data == null) {
			// ��̃f�[�^���쐬
			data = new String[0][7];
		}

		// �e�[�u�����쐬���A�p�l���ɓo�^����
		resultTable = new JTable(data, columns);
		scrollPanel.setViewportView(resultTable);
	}

	/**
	 * �e�[�u���̍s�f�[�^�������N���X
	 *
	 *  1�s���́u�}�̔ԍ��v�u���ד��v�u�ݏo��~���v�u�ݏo���v
	 * �u�ԋp�����v�u�ݏo�ԍ��v��ێ�����B
	 * �u��ԁv�͑��̏�񂩂猈�肷��B
	 */
	private class TableRow {

		public String mediaNumber;
		public Date entryDay;
		public Date disuseDay;
		public Date checkOutDay;
		public Date termDay;
		public String rentalNumber;

		/**
		 * �R���X�g���N�^
		 *
		 * @param mediaNumber �}�̔ԍ�
		 */
		public TableRow(String mediaNumber) {
			this.mediaNumber = mediaNumber;
		}

		/**
		 * 1�s���̃f�[�^��String�̔z��`���ɕϊ�����
		 *
		 * �u��ԁv�͑��̏�񂩂猈�肷��B
		 * �l��null�̏ꍇ�͋󕶎���i""�j�Ƃ��Ĉ���
		 *
		 * @return �s�f�[�^��String�z��
		 */
		public String[] toStringArray() {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

			String[] array = new String[7];

			array[0] = mediaNumber;
			array[1] = getStatus();

			if (entryDay == null) {
				array[2] = "";
			} else {
				array[2] = sdf.format(entryDay);
			}
			if (disuseDay == null) {
				array[3] = "";
			} else {
				array[3] = sdf.format(disuseDay);
			}
			if (checkOutDay == null) {
				array[4] = "";
			} else {
				array[4] = sdf.format(checkOutDay);
			}
			if (termDay == null) {
				array[5] = "";
			} else {
				array[5] = sdf.format(termDay);
			}
			if (rentalNumber == null) {
				array[6] = "";
			} else {
				array[6] = rentalNumber;
			}

			return array;
		}

		/**
		 * ��Ԃ𔻒肷��
		 *
		 * ��Ԃ͈ȉ��̂悤�ɔ��肷��
		 * 1. �ݏo���E�E�E�E�ݏo�����o�^����Ă���
		 * 2. �ݏo��~�E�E�E�ݏo��~�����o�^����Ă���
		 * 3. �ݏo�\�E�E�E��L�ȊO
		 *
		 * @return ��Ԃ̔��茋��
		 */
		private String getStatus() {

			if (this.checkOutDay != null) {
				return "�ݏo��";
			} else if (disuseDay != null) {
				return "�ݏo��~";
			} else {
				return "�ݏo�\";
			}
		}
	}

}
