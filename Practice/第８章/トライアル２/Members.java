
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * ����Ǘ����
 *
 * ������́u�ꗗ�\���v�u�X�V�v�u�}���v�u�폜�v��I������
 * �I������ꍇ�́u�I���v��I������B
 */
public class Members extends JFrame implements ActionListener {

	private JButton listButton = new JButton("�ꗗ�\��");
	private JButton updateButton = new JButton("�X�V");
	private JButton insertButton = new JButton("�}��");
	private JButton deleteButton = new JButton("�폜");
	private JButton exitButton = new JButton("�I��");

	private final String url;
	private final String userName;
	private final String password;

	/**
	 * �R���X�g���N�^
	 *
	 * ����Ǘ���ʂ̓��e��ݒ肷��
	 *
	 * @param url �f�[�^�x�[�X�ڑ�URL
	 * @param userName ���[�U��
	 * @param password �p�X���[�h
	 */
	public Members(String url, String userName, String password) {

		super("����Ǘ����");

		// �@�\�I����ʂ���f�[�^�x�[�X�ɐڑ����邽�߂�URL�ƃ��[�U���A�p�X���[�h�������p��
		this.url = url;
		this.userName = userName;
		this.password = password;

		setLocation(400, 400);
		setSize(300, 300);

		Container container = getContentPane();

		GridLayout gridLayout = new GridLayout(3, 2, 5, 5);
		container.setLayout(gridLayout);

		container.add(listButton);
		container.add(updateButton);
		container.add(insertButton);
		container.add(deleteButton);
		container.add(exitButton);

		// �ꗗ�\���{�^�����������ۂ̏�����ݒ�
		listButton.addActionListener(this);
	}

	/**
	 * �{�^�����������ۂ̏���
	 *
	 * �S����̏��{�^���������ꂽ�ہA�S����̏����R���\�[���ɕ\������
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {

		// �S����̏����擾����SQL
		String sql = "SELECT * FROM memberTb";

		// �f�[�^�x�[�X�ɐڑ����A������e�[�u���ɓo�^����Ă���S����̏����擾����
		try (Connection connection = DriverManager.getConnection(url, userName, password);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);) {

			// ���o��
			System.out.print("����ԍ�\t");
			System.out.print("����\t");
			System.out.print("�d�b�ԍ�\t");
			System.out.println("�Z��");

			// ����̏���1�s���\������
			while (resultSet.next()) {
				System.out.print(resultSet.getString("number") + "\t"); // ����ԍ�
				System.out.print(resultSet.getString("name") + "\t"); // ����
				System.out.print(resultSet.getString("tel") + "\t"); // �d�b�ԍ�
				System.out.println(resultSet.getString("address")); // �Z��
			}

		} catch (SQLException e) {

			// �G���[�����������ꍇ�̓G���[���e���o�͂���
			e.printStackTrace();
		}

	}
}
