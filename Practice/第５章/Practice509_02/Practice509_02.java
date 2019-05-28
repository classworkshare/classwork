import javax.swing.JFrame;

public class Practice509_02 extends JFrame {
	public Practice509_02(String title) {
		super(title);
		setLocation(200, 200);
		setSize(300, 200);
	}

	public static void main(String[] args) {
		Practice509_02 frame;
		frame = new Practice509_02("Practice509_02");
		frame.setVisible(true);
	}
}