package com.xzy;

public class Config 
{
    public static final int WIDTH=800;
    public static final int HEIGHT=650;
    
    public static final int ROWS=15;//行
    public static final int COLS=15;//列
    
    public static final int[][]MAP=new int[ROWS][COLS];
    
    
    public static final int EMPTY=0;
    public static final int BLACK=2;
    public static final int WHITE=3;
    public static final int FOCUS=1;
    
    public static final int CELL=40;//单元格的宽
    
    public static final int OFFSETX=25;//偏移
    public static final int OFFSETY=10;//偏移
    
    
    static {
    	MAP[3][3]=FOCUS;
    	MAP[3][13]=FOCUS;
    	MAP[13][3]=FOCUS;
    	MAP[13][13]=FOCUS;
    	MAP[7][8]=FOCUS;
    	
    }
   
}
