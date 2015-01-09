package project.Arrays;


public class Controller {
	private Array7 storedRow;
	private Array7 storedCol;
	private Array7x7 arr7x7;

	
	public Controller(){
		storedRow = new Array7();
		storedCol = new Array7();
		arr7x7 = new Array7x7();
	}
	
	public void storeRow(int[] row){
		storedRow.setArray(row);
	}
	
	public void storeCol(int[] col){
		storedCol.setArray(col);
	}
	
//	public int[] getRow(){
//		return storedRow.getArray();
//	}
//	
//	public int[] getCol(){
//		return storedCol.getArray();
//	}

	public void inputRow(int rowNbr){
		arr7x7.setRow(rowNbr, storedRow);
	}
	
	public void inputCol(int colNbr){
		arr7x7.setCol(colNbr, storedCol);
	}
	
	public void writeRow(){
		inputRow(6);
	}
	
	public void writeRow(int rowNbr){
		inputRow(rowNbr);
	}
	
	public void writeCol(){
		inputCol(0);
	}
	
	public void writeCol(int colNbr){
		inputCol(colNbr);
	}
	
	public int getElement(int row, int col){
		return arr7x7.getElement(row, col);
	}
	
	
}
