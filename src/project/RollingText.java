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
	
	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Vilken text vill du ska rulla?");
		
		ColorDisplay abc = new ColorDisplay(1, 4, Color.BLACK, Color.GREEN);
		abc.setDisplay(theColorArray);
		abc.updateDisplay();
		JOptionPane.showMessageDialog(null,abc);
		
		
		
	}
}
