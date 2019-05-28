import java.applet.Applet;
import java.awt.Graphics;

public class Practice601_01 extends Applet{

	public void init(){
		System.out.println("1 INIT");
	}

	public void start(){
		System.out.println("2 START");
	}

	public void stop(){
		System.out.println("3 STOP");
	}

	public void destroy(){
		System.out.println("4 DESTROY");
	}
	
	public void paint(Graphics g){
		System.out.println("* PAINT");
		g.drawString("アプレット実行中",200,150);
	}
}
