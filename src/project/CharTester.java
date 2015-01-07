package project;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class CharTester extends JFrame{
	
	public CharTester(){
		setTitle("CharTester");
		setSize(360, 380);
		setBackground(java.awt.Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g) {	
		
		int[][] arr = {
				{0,0,1,1,0,0,0},
				{0,1,0,0,1,0,0},
				{0,1,0,0,1,0,0},
				{0,1,1,1,1,0,0},
				{0,1,0,0,1,0,0},
				{0,1,0,0,1,0,0},
				{0,1,0,0,1,0,0}};
		
		for (int y = 0; y < 7; y ++) {
			for (int x = 0; x < 7; x ++) {
				if(arr[y][x] == 1){
					g.setColor(Color.BLACK);
				}
				else{
					g.setColor(Color.LIGHT_GRAY);
				}
				g.fillRect((x*50+10), (y*50+30), 40, 40);
			}
		}
	}
	
	public static void main(String args[]) {
		CharTester tester = new CharTester();
	}
}
