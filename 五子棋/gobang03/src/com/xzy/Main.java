package com.xzy;

import javax.swing.JFrame;

public class Main extends JFrame {

	private Game game=new Game();
	public Main()
	{
		super("Îå×ÓÆåv2.0");
		this.setSize(Config.WIDTH, Config.HEIGHT);
		this.setLocation(150, 50);
		this.setResizable(false);
		this.add(game);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Main();
	}

}
