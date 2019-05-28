import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Container;

public class Practice509_03 extends JFrame {
	private FlowLayout flow;
	private Container cntnr;
	private JTextField text1;
	private JButton button1;
	private JButton button2;

	Practice509_03(String title) {
		super(title);
		setBounds(200, 200, 450, 300);
	}

	public static void main(String[] args) {
		Practice509_03 frame;
		frame = new Practice509_03("Practice509_03");
		frame.defineVal();
		frame.setVisible(true);
	}

	private void defineVal() {
		cntnr = getContentPane();
		flow = new FlowLayout();
		cntnr.setLayout(flow);
		text1 = new JTextField(20);
		button1 = new JButton("‚Í‚¶‚ß");
		button2 = new JButton("‚¨‚í‚è");
		cntnr.add(button1);
		cntnr.add(text1);
		cntnr.add(button2);
	}
}