package project.Arrays;

public class Array7x7 {
	private int[][] arr7x7;
	
	/**
	 * Initierar den lokala referensvariabeln arr7x7 till en tom int[][]
	 */
	public Array7x7(){
		arr7x7 = new int[7][7];
	}
	/**
	 * Initierar den lokala referensvariabeln arr7x7 och fyller den med värdena från theArray
	 * @param theArray
	 */
	public Array7x7(int[][] theArray){
		this.arr7x7 = theArray;
	}
	/**
	 * @return returnerar den lokala referensvariablen arr7x7
	 */
	public int[][] getArray(){
		return arr7x7;
	}
	/**
	 * Sätter värdet i arr7x7 på rad row och kolumn col till värdet value
	 * @param row
	 * @param col
	 * @param value
	 */
	public void setElement(int row, int col, int value){//
		arr7x7[row][col] = value;
	}
	/**
	 * @param row
	 * @param col
	 * @return värdet på rad row och kolumn col
	 */
	public int getElement(int row, int col){
		return arr7x7[row][col];
	}
	/**
	 * Sätter värdena på raden row till samma värden som vektorn theRow
	 * @param row
	 * @param theRow
	 */
	public void setRow(int row, Array7 theRow){
		for(int i = 0; i < 7; i++){
			arr7x7[row][i] = theRow.getElement(i);
		}
	}
	/**
	 * @param row
	 * @return värdena på raden row i en Array7
	 */
	
	public Array7 getRow(int row){
		Array7 temp = new Array7();
		for(int i = 0; i < 7; i++){
			temp.setElement(i, arr7x7[row][i]);
		}
		return temp;
	}
	/**
	 * Sätter värdena på kolumnen col till samma värden som vektorn theCol
	 * @param col
	 * @param theCol
	 */
	public void setCol(int col, Array7 theCol){	// vi har tagit bort int row
		for(int i = 0; i < 7; i++){
			arr7x7[i][col] = theCol.getElement(i);
		}
	}
	/**
	 * @param col
	 * @return värdena på kolumnen col i en Array7
	 */
	public Array7 getCol(int col){
		Array7 temp = new Array7();
		for(int i = 0; i < 7; i++){
			temp.setElement(i, arr7x7[i][col]);
		}
		return temp;
	}
	/**
	 * Flyttar alla rader ett steg åt höger. Tar värdena i vektorn arrIn och sätter dem i arr7x7 vänstraste rad 
	 * (som alltså redan har flyttats ett steg åt höger).
	 * @param arrIn
	 * @return Den sista raden som "trillar av kanten"
	 */
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
	
	/**
	 * Flyttar alla rader ett steg åt vänster. Tar värdena i vektorn arrIn och
	 * sätter dem i arr7x7 högraste rad (som alltså redan har flyttats ett steg
	 * åt vänster).
	 * 
	 * @param arrIn
	 * @return Den sista raden som "trillar av kanten"
	 */
	
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
