package project.Arrays;

public class Array7x7 {
	private int[][] arr7x7;
	
	
	public Array7x7(){
		arr7x7 = new int[7][7];
	}
	
	public Array7x7(int[][] theArray){
		this.arr7x7 = theArray;
	}
	
	public void setElement(int row, int col, int value){//
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
	
	public Array7 moveRight(Array7 arrIn){  //Man ger den nya Array7 som input och får ut Array7 som skulle "trilla av"
		Array7 temp = arrIn;
		Array7 tempNext = getCol(0);
		for(int i = 0; i < 7; i++){
			if(i < 6){
				setCol(i, temp);
				temp = tempNext;
				tempNext = getCol(i + 1);
			}else{
				setCol(i, temp);
			}
		}
		
		return tempNext;
	}
	
	public Array7 moveLeft(Array7 arrIn){ //Man ger den nya Array7 som input och får ut Array7 som skulle "trilla av"
		Array7 temp = arrIn;
		Array7 tempNext = getCol(6);
		for(int i = 6; i > -1; i--){
			if(i > 0){
				setCol(i, temp);
				temp = tempNext;
				tempNext = getCol(i - 1);
			}else{
				setCol(i, temp);
			}
		}
		
		return tempNext;
	}
}
