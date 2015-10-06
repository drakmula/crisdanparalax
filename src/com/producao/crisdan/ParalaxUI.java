package com.producao.crisdan;

import javax.swing.JFrame;

public class ParalaxUI {
	
	private JFrame janela;
	int width = 415;
	int height = 215;
	
	protected void preparaJanela() {
		janela = new JFrame("Crisdan Paralax - Login");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	protected void chamaJanela(){
		janela.pack();
		janela.setVisible(true);
		janela.setSize(width, height);
	}

	public JFrame getJanela() {
		return janela;
	}

	public void setJanela(JFrame janela) {
		this.janela = janela;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
