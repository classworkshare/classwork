package rentalSystem.db.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * ����Ǘ��pDB�A�N�Z�X�N���X
 *
 * ���R�[�h�p�̃I�u�W�F�N�g�����˂Ă���
 *
 */
public class MemberDBAccess {

	private String memberNumber; // ����ԍ�
	private String memberName; // �����
	private String memberAddress; // �Z��
	private String memberAge; // �N��
	private String memberTel; // �d�b�ԍ�
	private String memberMail; // ���[���A�h���X
	private String enterDay; // �����
	private String leaveDay; // �މ��
	private String rankDiv; // ����D�ǋ敪

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
	public MemberDBAccess(String url, String userName, String password) {

		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	/**
	 * �����V�K�o�^����
	 *
	 * @param memberNumber   ����ԍ�
	 * @param memberName     ����
	 * @param memberAddress  �Z��
	 * @param memberAge      �N��
	 * @param memberTel      �d�b�ԍ�
	 * @param memberMail     ���[���A�h���X
	 * @param entryDay       �����
	 * @param rankDiv        �敪
	 *
	 * @return �o�^����
	 */
	public int addMember(String memberNumber, String memberName, String memberAddress, String memberAge,
			String memberTel, String memberMail, String entryDay, String rankDiv) {

		StringBuffer sql = new StringBuffer(0);

		sql.append("INSERT INTO ");
		sql.append("MEMBER_TABLE");
		sql.append(
				"(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) ");
		sql.append("VALUES ");
		sql.append("(?, ?, ?, ?, ?, ?, ?,  null, ?)");

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql.toString())) {

			preparedStatement.setString(1, memberNumber);
			preparedStatement.setString(2, memberName);
			preparedStatement.setString(3, memberAddress);
			preparedStatement.setString(4, memberAge);
			preparedStatement.setString(5, memberTel);
			preparedStatement.setString(6, memberMail);
			preparedStatement.setString(7, entryDay);
			preparedStatement.setString(8, rankDiv);

			return preparedStatement.executeUpdate();

		} catch (SQLException exception) {
			exception.printStackTrace();
		}

		return 0;
	}

	/**
	 * ��������X�V����
	 *
	 * @param memberNumber �X�V�������ԍ�
	 * @param memberName �V���������i�ύX���Ȃ��ꍇ��null�܂��͋󕶎��j
	 * @param memberAddress �V�����Z���i�ύX���Ȃ��ꍇ��null�܂��͋󕶎��j
	 * @param memberAge �V�����N��i�ύX���Ȃ��ꍇ��null�܂��͋󕶎��j
	 * @param memberTel �V�����d�b�ԍ��i�ύX���Ȃ��ꍇ��null�܂��͋󕶎��j
	 * @param memberMail �V�������[���A�h���X�i�ύX���Ȃ��ꍇ��null�܂��͋󕶎��j
	 * @param entryDay �V����������i�ύX���Ȃ��ꍇ��null�܂��͋󕶎��j
	 * @param leaveDay �V�����މ���i�ύX���Ȃ��ꍇ��null�܂��͋󕶎��j
	 * @param rankDiv �V�����敪�i�ύX���Ȃ��ꍇ��null�܂��͋󕶎��j
	 *
	 * @return �X�V����
	 */
	public int updateMember(String memberNumber, String memberName, String memberAddress, String memberAge,
			String memberTel, String memberMail, String entryDay, String leaveDay, String rankDiv) {

		StringBuffer sql = new StringBuffer(0);
		ArrayList<Object> parameterList = new ArrayList<Object>();

		sql.append("UPDATE ");
		sql.append("MEMBER_TABLE ");
		sql.append("SET ");

		if (memberName != null && !memberName.equals("")) {

			sql.append(" member_name = ?,");
			parameterList.add(memberName);
		}

		if (memberAddress != null && !memberAddress.equals("")) {

			sql.append(" member_address = ?,");
			parameterList.add(memberAddress);
		}

		if (memberAge != null && !memberAge.equals("")) {

			sql.append(" member_age = ?,");
			parameterList.add(Integer.valueOf(memberAge));
		}

		if (memberTel != null && !memberTel.equals("")) {

			sql.append(" member_tel = ?,");
			parameterList.add(memberTel);
		}

		if (memberMail != null && !memberMail.equals("")) {

			sql.append(" member_mail = ?,");
			parameterList.add(memberMail);
		}

		if (entryDay != null && !entryDay.equals("")) {

			sql.append(" enter_day = ?,");
			parameterList.add(entryDay);
		}

		if (leaveDay != null && !leaveDay.equals("")) {

			sql.append(" leave_day = ?,");
			parameterList.add(leaveDay);
		}

		if (rankDiv != null && !rankDiv.equals("")) {

			sql.append(" rank_div = ?,");
			parameterList.add(rankDiv);
		}

		// �Ō��,���͂���
		String wStr = sql.toString();
		if (wStr.endsWith(",")) {
			sql.delete(sql.length() - 1, sql.length());
		}

		sql.append(" WHERE ");
		sql.append("member_num = ?");

		parameterList.add(memberNumber);

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql.toString())) {

			for (int i = 0; i < parameterList.size(); i++) {

				Object parameter = parameterList.get(i);

				preparedStatement.setObject(i + 1, parameter);
			}

			return preparedStatement.executeUpdate();

		} catch (SQLException exception) {
			exception.printStackTrace();
		}

		return 0;
	}

	/**
	 * ����폜���\�b�h
	 *
	 * �މ����ݒ肷��Update���Ăяo��
	 *
	 * @param memberNumber ����ԍ�
	 * @param leaveDay �މ��
	 *
	 * @return �폜����
	 */
	public int deleteMember(String memberNumber, String leaveDay) {
		return updateMember(memberNumber, null, null, null, null, null, null, leaveDay, null);
	}

	/**
	 * ���l���󂯎��A��]�̒����܂Ő擪��0�Ŗ��߂� ������Ƃ��ĕԂ��������\�b�h
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
	 * �V��������ԍ����쐬����
	 *
	 * �V��������ԍ��́A���݂̉���ԍ��̍ő�l�{1�ƂȂ�B
	 *
	 * @return �V��������ԍ��i�G���[�����������ꍇ��null�j
	 */
	public String getNewMemberNumber() {

		StringBuffer sql = new StringBuffer(0);
		sql.append("SELECT ");
		sql.append("member_num ");
		sql.append("FROM ");
		sql.append("MEMBER_TABLE ");
		sql.append("ORDER BY ");
		sql.append("member_num DESC");

		// ���݂̉���ԍ��̍ő�l
		String max;

		// SELECT���̎��s
		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());) {

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (resultSet.next()) {
					max = resultSet.getString("member_num");
				} else {
					max = "00000";
				}
			}

		} catch (SQLException exception) {

			exception.printStackTrace();

			return null;
		}

		// �V��������ԍ����쐬
		int newMeNumber = Integer.parseInt(max) + 1;

		// 5���ɂȂ�悤��0����
		return zeroPad(newMeNumber, 5);
	}

	/**
	 * ����ԍ������Ƃɉ������ݒ肷��B
	 *
	 * �ݒ肵��������͕ʓrget���\�b�h�𗘗p���Ď擾����
	 *
	 * @param memberNumber ����ԍ�
	 *
	 * @return �����񂪐ݒ�ł����ꍇ�� true�A�ݒ�ł��Ȃ������ꍇ�� fales
	 */
	public boolean setMember(String memberNumber) {

		StringBuffer sql = new StringBuffer(0);
		sql.append("SELECT ");
		sql.append("* ");
		sql.append("FROM ");
		sql.append("MEMBER_TABLE ");
		sql.append("WHERE ");
		sql.append("member_num = ?");

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql.toString())) {

			preparedStatement.setString(1, memberNumber);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (!resultSet.next()) {
					return false;
				}

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

				memberName = resultSet.getString("member_name");
				memberAddress = resultSet.getString("member_address");
				memberAge = resultSet.getString("member_age");
				memberTel = resultSet.getString("member_tel");
				memberMail = resultSet.getString("member_mail");

				Date insertDate = resultSet.getDate("enter_day");
				if (insertDate != null) {
					enterDay = sdf.format(insertDate);
				} else {
					enterDay = null;
				}

				Date deleteDate = resultSet.getDate("leave_day");
				if (deleteDate != null) {
					leaveDay = sdf.format(deleteDate);
				} else {
					leaveDay = null;
				}

				rankDiv = resultSet.getString("rank_div");

				return true;
			}

		} catch (SQLException exception) {
			exception.printStackTrace();
			return false;
		}
	}

	/**
	 * @return memberAddress
	 */
	public String getMemberAddress() {
		return memberAddress;
	}

	/**
	 * @return memberAge
	 */
	public String getMemberAge() {
		return memberAge;
	}

	/**
	 * @return memberDelete
	 */
	public String getMemberDelete() {
		return leaveDay;
	}

	/**
	 * @return memberInsert
	 */
	public String getMemberInsert() {
		return enterDay;
	}

	/**
	 * @return memberMail
	 */
	public String getMemberMail() {
		return memberMail;
	}

	/**
	 * @return memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @return memberNumber
	 */
	public String getMemberNumber() {
		return memberNumber;
	}

	/**
	 * @return memberRank
	 */
	public String getMemberRank() {
		return rankDiv;
	}

	/**
	 * @return memberTel
	 */
	public String getMemberTel() {
		return memberTel;
	}
}
