import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;

public class Practice509_04 extends JFrame implements ActionListener {
	private BorderLayout border;
	private Container cntnr;
	private JTextField text1;
	private JButton button1, button2, button3;

	Practice509_04(String title) {
		super(title);
		setBounds(200, 200, 200, 150);
	}

	public static void main(String[] args) {
		Practice509_04 frame;
		frame = new Practice509_04("Practice509_04");
		frame.defineVal();
		frame.setVisible(true);
	}

	private void defineVal() {
		cntnr = getContentPane();
		border = new BorderLayout();
		cntnr.setLayout(border);
		text1 = new JTextField();
		button1 = new JButton("ÅÉÅÉí©ÅÑÅÑ");
		button2 = new JButton("ÅÉÅÉñÈÅÑÅÑ");
		button3 = new JButton("ÅÉèIóπÅÑ");
		cntnr.add(text1, BorderLayout.NORTH);
		cntnr.add(button1, BorderLayout.WEST);
		cntnr.add(button2, BorderLayout.EAST);
		cntnr.add(button3, BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			text1.setText("Ç®ÇÕÇÊÇ§ÅI");
		} else if (e.getSource() == button2) {
			text1.setText("Ç≥ÇÊÇ§Ç»ÇÁ");
		} else if (e.getSource() == button3) {
			System.exit(0);
		}
	}
}