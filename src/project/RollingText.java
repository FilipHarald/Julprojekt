package project;

import javax.swing.*;


public class RollingText{
	private static int[][] theColorArray = {
		{Color.BLACK,Color.RED,Color.BLACK,Color.BLACK,Color.BLACK,Color.RED,Color.BLACK},
		{Color.BLACK,Color.BLACK,Color.RED,Color.BLACK,Color.RED,Color.BLACK,Color.BLACK},
		{Color.BLACK,Color.BLACK,Color.RED,Color.BLACK,Color.RED,Color.BLACK,Color.BLACK},
		{Color.BLACK,Color.BLACK,Color.BLACK,Color.RED,Color.BLACK,Color.BLACK,Color.BLACK},
		{Color.BLACK,Color.BLACK,Color.RED,Color.BLACK,Color.RED,Color.BLACK,Color.BLACK},
		{Color.BLACK,Color.BLACK,Color.RED,Color.BLACK,Color.RED,Color.BLACK,Color.BLACK},
		{Color.BLACK,Color.RED,Color.BLACK,Color.BLACK,Color.BLACK,Color.RED,Color.BLACK}};

//	public RollingText() {
//		ColorDisplay cd = new ColorDisplay(Color.RED, 4, Color.BLACK, Color.RED);
//		JOptionPane.showMessageDialog(null,cd);
//	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		ColorDisplay cd = new ColorDisplay(1, 4, Color.BLACK, Color.RED);
		JOptionPane.showMessageDialog(null,cd);
		
		
		
		ColorDisplay abc = new ColorDisplay(1, 4, Color.BLACK, Color.RED);
		abc.setDisplay(theColorArray);
		abc.updateDisplay();
		JOptionPane.showMessageDialog(null,abc);
		
		
		
	}
}
