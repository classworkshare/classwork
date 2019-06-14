import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Confirm28Q1 extends JFrame implements ItemListener, ActionListener {
	private FlowLayout flow;
	private JTextField text;
	private JButton button;
	private ButtonGroup btngrp;
	private JRadioButton rbtn1, rbtn2, rbtn3;
	private String str;
	private Container cntnr;

	Confirm28Q1(String title) {
		super(title);
		setBounds(200, 200, 350, 200);
	}

	public static void main(String[] args) {
		Confirm28Q1 frame;
		
		frame = new Confirm28Q1("Confirm28Q1");
		
		frame.prepare();
		frame.setVisible(true);
	}

	void prepare() {
		cntnr = getContentPane();
		flow = new FlowLayout();
		cntnr.setLayout(flow);
		
		btngrp = new ButtonGroup();
		rbtn1 = new JRadioButton("和食", false);
		rbtn2 = new JRadioButton("フレンチ", false);
		rbtn3 = new JRadioButton("イタリアン", false);
		text = new JTextField(20);
		button = new JButton("今選択されているのは？");
		
		btngrp.add(rbtn1);
		btngrp.add(rbtn2);
		btngrp.add(rbtn3);
		cntnr.add(rbtn1);
		cntnr.add(rbtn2);
		cntnr.add(rbtn3);
		cntnr.add(button);
		cntnr.add(text);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		rbtn1.addItemListener(this);
		rbtn2.addItemListener(this);
		rbtn3.addItemListener(this);
		button.addActionListener(this);
	}

	public void itemStateChanged(ItemEvent e) {
		str = ((JRadioButton) e.getItemSelectable()).getText();
	}

	public void actionPerformed(ActionEvent e) {
		if (str != null) {
			text.setText("よし！　" + str + "にしよう！");
		} else {
			text.setText("う～ん　何にしよう？");
		}
	}
}