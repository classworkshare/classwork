package pack3;

/**
 * @author You
 *
 *         カメラインターフェース
 */
public interface Camera {
	/**
	 * カメラ撮影メソッド 各機種によりシャッター音を記述する
	 * 
	 * @return void
	 */
	public abstract void takePicture();
}