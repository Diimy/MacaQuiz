package macacada;

import javax.swing.JFrame;

import macacada.Modelo.Fase;

public class Container extends JFrame{
	public Container(){
	    add(new Fase());
		setTitle("Macaquiz");
	    setSize(1200,675);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    this.setResizable(false);
	    setVisible(true);
	}

	public static void main (String [] args) {
		new Container();
	}
}
