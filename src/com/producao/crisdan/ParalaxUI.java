package com.producao.crisdan;

import javax.swing.JFrame;

public class ParalaxUI {
	
	private JFrame janela;
	int width = 830;
	int height = 640;
	
	protected void preparaJanela() {
		janela = new JFrame("Crisdan Paralax - Login");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	protected void chamaJanela(){
		janela.pack();
		janela.setVisible(true);
		janela.setSize(width, height);
	}
	
}
