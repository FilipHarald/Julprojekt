package project;
import java.awt.*;
import javax.swing.*;


public class TestArrayVeiwer extends JPanel{ 
	private JPanel arr7x7 = new JPanel();
	private JPanel arrCol = new JPanel(new GridLayout(7,7,10,10));
	private JPanel arrRow = new JPanel();
	
	private int[][] array;
	
	public TestArrayVeiwer(int[][] array){
		this.array = array;
		setPreferredSize(new Dimension(500,500));
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				if(array[i][j] == 0){
					//Vitt
				}
				else{
					//En annan färg
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		
		int[][] array = new int[][]{
				  { 0, 1, 0, 0, 0, 1, 0 },
				  { 0, 0, 1, 0, 0, 0, 0 },
				  { 0, 1, 0, 0, 0, 1, 0 },
				  { 0, 0, 1, 0, 0, 1, 0 },
				  { 0, 1, 1, 0, 1, 1, 1 },
				  { 0, 0, 1, 0, 1, 0, 0 },
				  { 1, 0, 1, 0, 0, 1, 0 }
		};
		
		TestArrayVeiwer test = new TestArrayVeiwer(array);
		
		
		
		JOptionPane.showMessageDialog(null,test);	
	}
}
