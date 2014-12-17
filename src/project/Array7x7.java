package project;

public class Array7x7 {
	
	private int row;
	private int col;
	private int[][] arr7x7 = new int[7][7];
	
	public void setElement(int row, int col, int value){
		arr7x7[row][col] = value;	
	}
	
	public int getElement(int row, int col){
		return arr7x7[row][col];
	}
	

}
