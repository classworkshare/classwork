package rentalSystem.db.record;

/**
 * DVD�e�[�u���̃��R�[�h�p�I�u�W�F�N�g�N���X
 */
public class DvdObj {

	private String artworkNumber; // ��i�ԍ�
	private String mediaNumber; // �}�̔ԍ�
	private String entryDay; // ���ד�
	private String disuseDay; // �폜��

	/**
	 * @return artworkNumber
	 */
	public String getArtworkNumber() {
		return artworkNumber;
	}

	/**
	 * awNumber ��ݒ肵�܂��B
	 *
	 * @param awNumber
	 */
	public void setArtworkNumber(String artworkNumber) {
		this.artworkNumber = artworkNumber;
	}

	/**
	 * @return mediaNumber
	 */
	public String getMediaNumber() {
		return mediaNumber;
	}

	/**
	 * mediaNumber ��ݒ肵�܂��B
	 *
	 * @param mediaNumber
	 */
	public void setMediaNumber(String mediaNumber) {
		this.mediaNumber = mediaNumber;
	}

	/**
	 * @return entryDay
	 */
	public String getEntryDay() {
		return entryDay;
	}

	/**
	 * insertDay ��ݒ肵�܂��B
	 *
	 * @param insertDay
	 */
	public void setEntryDay(String entryDay) {
		this.entryDay = entryDay;
	}

	/**
	 * @return disuseDay
	 */
	public String getDisuseDay() {
		return disuseDay;
	}

	/**
	 * deleteDay ��ݒ肵�܂��B
	 *
	 * @param deleteDay
	 */
	public void setDisuseDay(String disuseDay) {
		this.disuseDay = disuseDay;
	}
}
