import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;

public class Practice601_02 extends Applet
					implements ItemListener,
								MouseListener{

	int shape = 0;
	int color = 0;
	Color[] colorHairetsu = {Color.blue,Color.red};
	Choice  shapeChoice;
	Choice  colorChoice;
	String[] itemShape = {"â~","éläp"};
	String[] itemColor = {"ê¬", "ê‘"};
	int x_axis=-1, y_axis=-1;

	public void init(){
		int i;

		shapeChoice = new Choice();
		for(i=0;i<2;i++){
		shapeChoice.addItem(itemShape[i]);
		}
		colorChoice = new Choice();
		for(i=0;i<2;i++){
		colorChoice.addItem(itemColor[i]);
		}
		add(shapeChoice);
		add(colorChoice);
		shapeChoice.addItemListener(this);
		colorChoice.addItemListener(this);
		addMouseListener(this);
	}
	public void paint(Graphics g){
		if(x_axis!=-1){
			g.setColor(colorHairetsu[color]);
			switch(shape){
				case 0:
					g.drawOval(x_axis-20,y_axis-20,40,40);
					break;
				case 1:
					g.drawRect(x_axis-20,y_axis-20,40,40);
					break;
			}
		}
	}

	public void itemStateChanged(ItemEvent e){
		if(e.getSource() == shapeChoice){
			shape = shapeChoice.getSelectedIndex();
		}
		else if(e.getSource() == colorChoice){
			color = colorChoice.getSelectedIndex();
		}
	}

	public void update(Graphics g){
		paint(g);
	}

	public void mouseClicked(MouseEvent e){
		x_axis = e.getX();
		y_axis = e.getY();
		repaint();
	}

	public void mousePressed(MouseEvent e){
	}
	public void mouseReleased(MouseEvent e){
	}
	public void mouseEntered(MouseEvent e){	
	}
	public void mouseExited(MouseEvent e){
	}
}
