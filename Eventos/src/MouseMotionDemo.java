import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;


public class MouseMotionDemo extends JFrame implements MouseMotionListener, KeyListener{
	
	private int x, y, x1, y1;
	private boolean linea,control = false;
	
	
	public MouseMotionDemo(){
		this.setSize(700, 600);
		this.setTitle("Mouse Motion Demo");
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		//this.setFocusable(true);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(linea){
			y1 = arg0.getY();
			x1 = arg0.getX();
			linea = false;
			this.repaint();
		}else{
			
		}
		x = arg0.getX();
		y = arg0.getY();
		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("x: " + arg0.getX());
		//System.out.println("y: " + arg0.getY());
		this.repaint();
		linea = true;
		
	}
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		if(control){
			g2.drawOval(x1,y1,x,y);
		}
		else{
			g2.drawLine(x1,y1,x,y);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyCode() == 17){
			control = true;
		}
		System.out.println(arg0.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
