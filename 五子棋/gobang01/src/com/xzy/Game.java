package com.xzy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Game extends JPanel 
{
   private BufferedImage  bak;
   private BufferedImage  black;
   private BufferedImage  white;
   
   public Game()
   {
	   this.setSize(Config.WIDTH, Config.HEIGHT);
	   this.initImg();
   }
   //实始化图片
   public void initImg()
   {
	   try {
		bak=ImageIO.read(Game.class.getResource("/com/res/bak.png"));
		black=ImageIO.read(Game.class.getResource("/com/res/black.png"));
		white=ImageIO.read(Game.class.getResource("/com/res/white.png"));
	} catch (IOException e) {
		 System.out.println("ERROR_001_初始化图片失败");
	}
   }
@Override
public void paint(Graphics g) {
	// TODO Auto-generated method stub
	super.paint(g);
	g.drawImage(bak, 0, 0, null);
	
	//画线
	for(int i=0;i<Config.ROWS;i++)
	{
		for(int j=0;j<Config.COLS;j++)
		{
			g.setColor(new Color(137,92,44));
			g.drawRect(j*Config.CELL+Config.OFFSETX, i*Config.CELL+Config.OFFSETY, Config.CELL, Config.CELL);
		}
	}
	//画焦点
	for(int i=0;i<Config.ROWS;i++)
	{
		for(int j=0;j<Config.COLS;j++)
		{
			if(Config.MAP[i][j]==Config.FOCUS)
			{
			  g.setColor(new Color(137,92,44));
			   g.fillRect(j*Config.CELL+Config.OFFSETX-5, i*Config.CELL+Config.OFFSETY-5, 10, 10);
			}
		}
	}
}
@Override
public Dimension getPreferredSize() {
	// TODO Auto-generated method stub
	return new Dimension(Config.WIDTH, Config.HEIGHT);
}
   
   
   
   
}
