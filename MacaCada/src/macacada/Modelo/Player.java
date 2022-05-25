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
		//coordenada em que o jogador vai nascer
		this.x = 20;
		this.y = 790; 
	}
	
	//definindo a imagem padrão do jogador
	public void load() {
		ImageIcon referencia = new ImageIcon("res\\monk_static.gif");
		imagem = referencia.getImage();
		
		//altura e largura da imagem definidas pelo tamanho da imagem
		//por isso null
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	public void update() {
		
		//deslocamento X do player
		x = x + dx;
		
		//deslocamento Y do player
		y = y + dy;
		
		//definindo limite do macaco
		//para ficar "preso" na tela
		x = Clamp(x,-10,1650);
		y = Clamp(y,0,790);
		
		//simulando gravidade
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
		
		//pulo do player
		if (codigo == KeyEvent.VK_W) { 
			dy = dy*-10;
			
		}
		
		//para baixo
		else if (codigo == KeyEvent.VK_S) {
			dy = 3;
			
		}
		
		//para a esquerda
		else if (codigo == KeyEvent.VK_A) {
			dx = -3;
			ImageIcon referencia = new ImageIcon("res\\monk_left.gif");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		
		//para a direita
		else if (codigo == KeyEvent.VK_D) {
			dx = 3;
			ImageIcon referencia = new ImageIcon("res\\monk_right.gif");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);

		}
		
		//poder especial em desenvolvimento
		else if (codigo == KeyEvent.VK_ENTER) {
			ImageIcon referencia = new ImageIcon("res\\smile.jpg");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		
		//aumenta a velocidade do player
		else if (codigo == KeyEvent.VK_SHIFT) {
				dx = dx * 2;
				if (dx>6) {
					dx = 6;
				}
				if (dx<-6){
					dx = -6;
				}
		}
		
		
	}
	
	//o que acontece quando solta a tecla pressionada
	public void keyReleased(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_W) {
			dy = 5;
			
		}
		else if (codigo == KeyEvent.VK_S) {
			dy = 3;
			
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
				dx = -6;
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
