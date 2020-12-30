package main;

import javax.swing.JFrame;

public class Startup {

	private static JFrame frame;
	private static int Width = 100, Height = 100;
	private static KeyManeger km;
	

	public static void main(String[] args){
		frame = new JFrame("AC");
		frame.setSize(Width, Height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		km = new KeyManeger();
		
		frame.addKeyListener(km);
		frame.setVisible(true);
		
	}
}