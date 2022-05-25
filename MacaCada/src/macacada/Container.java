package macacada;

import javax.swing.JFrame;

import macacada.Modelo.Fase;

public class Container extends JFrame{
	
	
	
	
	public Container(){
	    add(new Fase());
		
	    //define título a janela
	    setTitle("Macaquiz");
	    
	    //faz a janela preencher toda a janela
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    
		//faz com que o programa feche ao clicar no X da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		//define ponto em que a tela aparecerá. Por estar null,
		//vai aparecer no meio da tela
		setLocationRelativeTo(null);
	    
		//impede do usuário mudar o tamanho da janela
		this.setResizable(false);
	    
		//serve para fazer a tela visivel
		setVisible(true);
	    
	}
	public static void main (String [] args) {
		new Container();
	}
	
}
