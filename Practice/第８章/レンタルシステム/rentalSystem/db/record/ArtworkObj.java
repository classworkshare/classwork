package rentalSystem.db.record;

/**
 * ��i�e�[�u���̃��R�[�h�I�u�W�F�N�g�N���X
 */
public class ArtworkObj {

	private String artworkNumber = null; // ��i�ԍ�
	private String artworkName = null; // ��i��
	private String recentDiv = null; // �敪
	private String genreName = null; // �W��������

	/**
	 * @return artworkNumber
	 */
	public String getArtworkNumber() {
		return artworkNumber;
	}

	/**
	 * artworkNumber ��ݒ肵�܂��B
	 *
	 * @param artworkNumber
	 */
	public void setArtworkNumber(String artworkNumber) {
		this.artworkNumber = artworkNumber;
	}

	/**
	 * @return artworkName
	 */
	public String getArtworkName() {
		return artworkName;
	}

	/**
	 * artworkName ��ݒ肵�܂��B
	 *
	 * @param artworkName
	 */
	public void setArtworkName(String artworkName) {
		this.artworkName = artworkName;
	}

	/**
	 * @return recentDiv
	 */
	public String getRecentDiv() {
		return recentDiv;
	}

	/**
	 * recentDiv ��ݒ肵�܂��B
	 *
	 * @param recentDiv
	 */
	public void setRecentDiv(String recentDiv) {
		this.recentDiv = recentDiv;
	}

	/**
	 * @return artworkGenumber
	 */
	public String getGenreName() {
		return genreName;
	}

	/**
	 * artworkGenumber ��ݒ肵�܂��B
	 *
	 * @param artworkGenumber
	 */
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
}
