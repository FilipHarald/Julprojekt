package project;

public class Array7x7 {
	private int[][] arr7x7;
	
	
	public Array7x7(){
		arr7x7 = new int[7][7];
		
	}
	
	public void setElement(int row, int col, int value){
		arr7x7[row][col] = value;
		
		
	}
	
	public int getElement(int row, int col){
		
		return arr7x7[row][col];
		
	}
	
	public void setRow(int row, Array7 theRow){ // vi har tagit bort int col!
		for(int i = 0; i < 7; i++){
			arr7x7[row][i] = theRow.getElement(i);			
		}
	}
	
	public Array7 getRow(int row){
		Array7 temp = new Array7();
		for(int i = 0; i < 7; i++){
			temp.setElement(i, arr7x7[row][i]);
		}
		return temp;
	}
	
	public void setCol(int col, Array7 theCol){	// vi har tagit bort int row
		for(int i = 0; i < 7; i++){
			arr7x7[i][col] = theCol.getElement(i);
		}
	}
	
	public Array7 getCol(int col){
		Array7 temp = new Array7();
		for(int i = 0; i < 7; i++){
			temp.setElement(i, arr7x7[i][col]);
		}
		return temp;
	}
}
