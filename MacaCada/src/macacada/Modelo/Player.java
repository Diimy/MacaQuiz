package macacada.Modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
	private int x, y;
	private int dx, dy;
	private Image imagem;
	private int altura, largura;
	
	public Player() {
		this.x = 100;
		this.y = 100; 
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon("res\\monk_static.gif");
		imagem = referencia.getImage();
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	public void update() {
		
		//deslocamento X do macaco
		x = x + dx;
		//deslocamento Y do macaco
		y = y + dy;
		//definindo limite do macaco
		x = Clamp(x,-10,1650);
		y = Clamp(y,0,790);
		
		//simulação gravidade
		if (y<=800) {
			dy=5;
		}
		else {
			dy=-1;
		}
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_W) { 
			dy = -150;
			ImageIcon referencia = new ImageIcon("res\\monk_static.gif");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		else if (codigo == KeyEvent.VK_S) {
			dy = 3;
			ImageIcon referencia = new ImageIcon("res\\monk_static.gif");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		else if (codigo == KeyEvent.VK_A) {
			dx = -3;
			ImageIcon referencia = new ImageIcon("res\\monk_left.gif");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		else if (codigo == KeyEvent.VK_D) {
			dx = 3;
			ImageIcon referencia = new ImageIcon("res\\monk_right.gif");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);

		}
		else if (codigo == KeyEvent.VK_ENTER) {
			ImageIcon referencia = new ImageIcon("res\\smile.jpg");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		else if (codigo == KeyEvent.VK_SHIFT) {
				dx = dx * 2;
				if (dx>6) {
					dx = 6;
				}
				if (dx<-6){
					dx = -3;
				}
		}
		
		
	}
	
	public void keyReleased(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_W) {
			dy = 5;
			ImageIcon referencia = new ImageIcon("res\\monk_static.gif");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		else if (codigo == KeyEvent.VK_S) {
			dy = 3;
			ImageIcon referencia = new ImageIcon("res\\monk_static.gif");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		else if (codigo == KeyEvent.VK_A) {
			dx = 0;
			ImageIcon referencia = new ImageIcon("res\\monk_static.gif");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		
		}
		else if (codigo == KeyEvent.VK_D) {
			dx = 0;
			ImageIcon referencia = new ImageIcon("res\\monk_static.gif");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		
		}
		else if (codigo == KeyEvent.VK_ENTER) {
			ImageIcon referencia = new ImageIcon("res\\monk_static.gif");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		else if (codigo == KeyEvent.VK_SHIFT) {
			dx = dx/2;
			if (dx>6) {
				dx = 3;
			}
			if (dx<-6){
				dx = -3;
			}
	}
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}
	
	//classe que impede do macaco de fugir da tela do jogo
	private int Clamp(int pos, int min, int max) {
		if (pos>max)
			return max;
		else if (pos<min)
			return min;
		else 
			return pos;
	}
		
	
	
	
}
