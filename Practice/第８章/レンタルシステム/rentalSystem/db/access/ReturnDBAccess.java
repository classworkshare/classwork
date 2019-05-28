package rentalSystem.db.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * �ԋp�pDB�A�N�Z�X�N���X
 */
public class ReturnDBAccess {

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
	public ReturnDBAccess(String url, String userName, String password) {

		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	/**
	 * ��i�ԍ������Ƃɍ�i�����擾����
	 *
	 * @param artworkNumber
	 *
	 * @return ��i�� (�擾���s����null)
	 */
	public String getArtworkName(String artworkNumber) {

		// ��i���̎擾
		StringBuffer sql = new StringBuffer(0);
		sql.append("SELECT ");
		sql.append("artwork_name, recent_div ");
		sql.append("FROM ");
		sql.append("ARTWORK_TABLE ");
		sql.append("WHERE ");
		sql.append("artwork_num = ?");

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());) {

			preparedStatement.setString(1, artworkNumber);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (!resultSet.next()) {
					return null;
				}

				return resultSet.getString("artwork_name");
			}

		} catch (SQLException exception) {
			exception.printStackTrace();
		}

		return null;
	}

	/**
	 * ��i�ԍ��ƘA�Ԃ̑g�ݍ��킹�����Ƃ�
	 * �ݏo�e�[�u������ԋp�������擾����
	 * �O��:�ԋp����NULL�Ȃ猻�ݑݏo��
	 *
	 * @param artworkNumber ��i�ԍ�
	 * @param mediaNumber �}�̔ԍ�
	 *
	 * @return �ԋp���� (�擾���s����null)
	 */
	public Date getTermDay(String artworkNumber, String mediaNumber) {

		StringBuffer sql = new StringBuffer(0);
		sql.append("SELECT ");
		sql.append("term_day ");
		sql.append("FROM ");
		sql.append("RENTAL_TABLE ");
		sql.append("WHERE ");
		sql.append("artwork_num = ? ");
		sql.append("AND media_num = ?");
		sql.append("AND check_in_day IS NULL");

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());) {

			preparedStatement.setString(1, artworkNumber);
			preparedStatement.setString(2, mediaNumber);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (!resultSet.next()) {
					return null;
				}

				return resultSet.getDate("term_day");
			}

		} catch (SQLException exception) {
			exception.printStackTrace();
		}

		return null;
	}

	/**
	 * ��i�ԍ������ƂɁA���̍�i�P���������
	 * ���ؗ������擾����
	 *
	 * @param artworkNumber ��i�ԍ�
	 *
	 * @return ���ؗ���
	 */
	public int getArrearsPerUnitDay(String artworkNumber) {

		StringBuffer sql1 = new StringBuffer(0);
		sql1.append("SELECT ");
		sql1.append("recent_div ");
		sql1.append("FROM ");
		sql1.append("ARTWORK_TABLE ");
		sql1.append("WHERE ");
		sql1.append("artwork_num = ?");

		String recentDiv = null;

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql1.toString());) {

			preparedStatement.setString(1, artworkNumber);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (!resultSet.next()) {
					return 0;
				}

				recentDiv = resultSet.getString("recent_div");
			}

		} catch (SQLException exception) {

			exception.printStackTrace();

			return 0;
		}

		StringBuffer sql2 = new StringBuffer(0);
		sql2.append("SELECT arrears FROM PRICE_TABLE ");
		sql2.append("WHERE recent_div = ?");

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql2.toString());) {

			preparedStatement.setString(1, recentDiv);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (!resultSet.next()) {
					return 0;
				}

				return resultSet.getInt("arrears");
			}

		} catch (SQLException exception) {
			exception.printStackTrace();
		}

		return 0;
	}

	/**
	 * ��i�ԍ��ƘA�Ԃ̑g�ݍ��킹�����Ƃ�
	 * �ݏo�e�[�u���������ԍ����擾����
	 * �O��:�ԋp����NULL�Ȃ猻�ݑݏo��
	 *
	 * @param artworkNumber ��i�ԍ�
	 * @param mediaNumber �}�̔ԍ�
	 *
	 * @return �؂�Ă������̔ԍ� (�擾���s����null)
	 */
	public String getBorrowersNumber(String artworkNumber, String mediaNumber) {

		StringBuffer sql = new StringBuffer(0);
		sql.append("SELECT ");
		sql.append("member_num ");
		sql.append("FROM ");
		sql.append("RENTAL_TABLE ");
		sql.append("WHERE ");
		sql.append("artwork_num = ? ");
		sql.append("AND media_num = ? ");
		sql.append("AND check_in_day IS NULL");

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());) {

			preparedStatement.setString(1, artworkNumber);
			preparedStatement.setString(2, mediaNumber);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (!resultSet.next()) {
					return null;
				}

				return resultSet.getString("member_num");
			}

		} catch (SQLException exception) {

			exception.printStackTrace();
		}

		return null;
	}

	/**
	 * ��i�ԍ��ƘA�Ԃ̑g�ݍ��킹�����Ƃ�
	 * �ݏo�e�[�u������ݏo�ԍ����擾����
	 * �O��:�ԋp����NULL�Ȃ猻�ݑݏo��
	 *
	 * @param artworkNumber ��i�ԍ�
	 * @param mediaNumber �A��
	 * @return ����ԍ�
	 */
	public String getRentalNumber(String artworkNumber, String mediaNumber) {

		StringBuffer sql = new StringBuffer(0);
		sql.append("SELECT ");
		sql.append("rental_num ");
		sql.append("FROM ");
		sql.append("RENTAL_TABLE ");
		sql.append("WHERE ");
		sql.append("artwork_num = ? ");
		sql.append("AND media_num = ? ");
		sql.append("AND check_in_day is NULL");

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());) {

			preparedStatement.setString(1, artworkNumber);
			preparedStatement.setString(2, mediaNumber);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				if (!resultSet.next()) {
					return null;
				}

				return resultSet.getString("rental_num");
			}

		} catch (SQLException exception) {

			exception.printStackTrace();
		}

		return null;
	}

	/**
	 * �ԋp����
	 *
	 * @param rentalNumber �ݏo�ԍ�
	 * @param checkInDay �ԋp��
	 * @param arrears ���ؗ���
	 *
	 * @return
	 */
	public int checkIn(String rentalNumber, String checkInDay, String arrears) {

		StringBuffer sql = new StringBuffer(0);
		sql.append("UPDATE ");
		sql.append("RENTAL_TABLE ");
		sql.append("SET ");
		sql.append("check_in_day = ? ");

		// ���؂�����ꍇ
		if (arrears != null && !arrears.equals("")) {
			sql.append(", arrears = ? ");
		}

		sql.append("WHERE ");
		sql.append("rental_num = ?");

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());) {

			preparedStatement.setString(1, checkInDay);

			if (arrears != null && !arrears.equals("")) {
				// ���؂�����ꍇ

				preparedStatement.setString(2, arrears);
				preparedStatement.setString(3, rentalNumber);

			} else {
				// ���؂��Ȃ��ꍇ

				preparedStatement.setString(2, rentalNumber);
			}

			// SQL�����s
			return preparedStatement.executeUpdate();

		} catch (SQLException exception) {

			exception.printStackTrace();
		}

		return 0;
	}
}
