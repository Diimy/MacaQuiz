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
		ImageIcon referencia = new ImageIcon("res\\frente.png");
		imagem = referencia.getImage();
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	public void update() {
		x += dx;
		y += dy;
	}
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_UP) { 
			dy = -3;
			ImageIcon referencia = new ImageIcon("res\\frente.png");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		else if (codigo == KeyEvent.VK_DOWN) {
			dy = 3;
			ImageIcon referencia = new ImageIcon("res\\frente.png");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		else if (codigo == KeyEvent.VK_LEFT) {
			dx = -3;
			ImageIcon referencia = new ImageIcon("res\\ESQUERDA.png");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		else if (codigo == KeyEvent.VK_RIGHT) {
			dx = 3;
			ImageIcon referencia = new ImageIcon("res\\MACMACACO .png");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		
		}	
		else if (codigo == KeyEvent.VK_SHIFT & codigo == KeyEvent.VK_RIGHT) {
			dx = 8;
		}
		else if (codigo == KeyEvent.VK_ENTER) {
			ImageIcon referencia = new ImageIcon("res\\smile.jpg");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		
	}
	
	public void keyReleased(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_UP) {
			dy = 0;
			ImageIcon referencia = new ImageIcon("res\\frente.png");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		else if (codigo == KeyEvent.VK_DOWN) {
			dy = 0;
			ImageIcon referencia = new ImageIcon("res\\frente.png");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		}
		else if (codigo == KeyEvent.VK_LEFT) {
			dx = 0;
			ImageIcon referencia = new ImageIcon("res\\ESQUERDA.png");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
			
		}
		else if (codigo == KeyEvent.VK_RIGHT) {
			dx = 0;
			ImageIcon referencia = new ImageIcon("res\\MACMACACO .png");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
		
		}
		else if (codigo == KeyEvent.VK_SHIFT && codigo == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
		
		else if (codigo == KeyEvent.VK_ENTER) {
			ImageIcon referencia = new ImageIcon("res\\MACMACACO .png");
			imagem = referencia.getImage();
			altura = imagem.getHeight(null);
			largura = imagem.getWidth(null);
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
	
		
	
	
	
}
