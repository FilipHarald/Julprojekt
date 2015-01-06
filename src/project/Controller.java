package project;

public class Controller {
	private int[] tempRow;
	private int[] tempCol;

	
	public Controller(){
//		tempRow = new int[7];
//		tempCol = new int[7];
		
	}
	
	public void setRow(int[] row){
		tempRow = row;
	}
	
	public void setCol(int[] col){
		tempCol = col;
	}
	
	public int[] getRow(){
		return tempRow;
	}
	
	public int[] getCol(){
		return tempCol;
	}
	
}
