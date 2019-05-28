import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Confirm29Q1 extends Applet implements ItemListener, ActionListener {
	
	private Choice houseChoice;
	private Button architect;
	private Button clear;
	private String[] itemHouse = { "‰Œ“Ë", "‰®ª", "•Ç", "‘‹" };
	private int x[] = { 175, 75, 275 };
	private int y[] = { 90, 200, 200 };
	private int index = -1;
	private boolean clearFlg = false;
	
	public void init() {
		int i;
		
		houseChoice = new Choice();
		architect = new Button("Œš’z");
		clear = new Button("ƒNƒŠƒA");
		
		for (i = 0; i < 4; i++) {
			houseChoice.addItem(itemHouse[i]);
		}
		
		add(houseChoice);
		add(architect);
		add(clear);
		architect.addActionListener(this);
		clear.addActionListener(this);
		houseChoice.addItemListener(this);
	}
	
	public void paint(Graphics g) {
		if (clearFlg == true) {
			g.setColor(getBackground());
			g.fillRect(0, 0, getSize().width, getSize().height);
			clearFlg = false;
		} else {
			switch (index) {
			case 0: 								// ‰Œ“Ë
				g.fillRect(220, 130, 20, 50);
				break;
			case 1: 								// ‰®ª
				g.setColor(Color.red);
				g.fillPolygon(x, y, 3);
				break;
			case 2: 								// •Ç
				g.setColor(Color.blue);
				g.fillRect(100, 200, 150, 100);
				break;
			case 3: 								// ‘‹
				g.setColor(Color.white);
				g.fillRect(150, 225, 50, 40);
				g.setColor(Color.black);
				g.drawLine(175, 225, 175, 265);
				g.drawLine(150, 245, 200, 245);
				break;
			default:
				break;
			}
		}
	}
	
	public void update(Graphics g) {
		paint(g);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == architect) {
			if (index == -1) {
				index = 0;
			}
		} else {
			clearFlg = true;
		}
		repaint();
	}
	
	public void itemStateChanged(ItemEvent e) {
		index = ((Choice) e.getSource()).getSelectedIndex();
	}
}