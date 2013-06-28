import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class WindowsHandlerDemo extends JFrame implements WindowListener{
	
	public WindowsHandlerDemo(){
		this.setVisible(true);
		this.setSize(700, 800);
		this.addWindowListener(this);
		this.setTitle("Eventos");
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("activar");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("cerrar");
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("cerrando");
		//System.exit(0);
		int n = JOptionPane.showConfirmDialog(null, "quieres cerrar");
		System.out.println(n);
		if(n == 0){
			System.exit(n);
		}else{
			
		}
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("desactivar");
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("maximizar");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("minimizar");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("abrir");
	}
	
}
