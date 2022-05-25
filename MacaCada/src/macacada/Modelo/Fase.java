package macacada.Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt. Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing. ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener{
	
	//objeto do tipo imagem:
	private Image fundo;
	
	
	private Player player;
	private Timer timer;
		
	//construtor
	public Fase(){
			setFocusable(true);
			setDoubleBuffered(true);
			
			//================= define a imagem de fundo ===================
			ImageIcon referencia = new ImageIcon("res\\Background.jpg");
			fundo = referencia.getImage();
	        //==============================================================
			
	        //instanciando jogador 
			player = new Player();
	        
	        //carrega a imagem do jogador
	        player.load();
	        
	        addKeyListener(new TecladoAdapter());
	        
	        //velocidade do jogo
	        timer = new Timer(7, this);
	        timer.start();
	    }
		
	public void paint(Graphics g) {
			Graphics2D graficos  = (Graphics2D) g;
			graficos.drawImage(fundo, 0, 0, null);
			graficos.drawImage(player.getImagem(), player.getX(), player.getY(), this);
			g.dispose();
			
		}

	@Override
	//atualiza a tela
	public void actionPerformed(ActionEvent e) {
		player.update();
		repaint();
	
	}
	
	private class TecladoAdapter extends KeyAdapter{
		
		@Override 
		public void keyPressed(KeyEvent e ) {
			player.keyPressed(e);
		}
		
		@Override 
		public void keyReleased(KeyEvent e ) {
			player.keyReleased(e);
		}
	}
	
}
