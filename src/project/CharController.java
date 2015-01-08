package project;

import javax.swing.JOptionPane;

public class CharController {

	public CharController() {

	}

	public static void main(String args[]){
		Char cLibrary = new Char();

		String c = JOptionPane.showInputDialog("Mata in ett tecken");
		
		c = c.toUpperCase();
		int hej = c.length();
		System.out.println(hej);
		int[][] arr = new int[7][7];
		
		for (int i = 0; i < c.length(); i++) {
			char chr = c.charAt(i);
			System.out.println("runda"+i+"   Svar: "+chr);
			
			switch(chr){
			case 'A' : arr = cLibrary.charA;	//charA funktionen som symbolen finns på i Char
			break;
			
			case 'B' : arr = cLibrary.charB;
			break;
			
			case 'C' : arr = cLibrary.charC;
			break;
			
			case 'D' : arr = cLibrary.charD;
			break;
			
			case 'E' : arr = cLibrary.charE;
			break;

			case 'F' : arr = cLibrary.charF;
			break;

			case 'G' : arr = cLibrary.charG;
			break;

			case 'H' : arr = cLibrary.charH;
			break;

			case 'I' : arr = cLibrary.charI;
			break;

			case 'J' : arr = cLibrary.charJ;
			break;

			case 'K' : arr = cLibrary.charK;
			break;

			case 'L' : arr = cLibrary.charL;
			break;

			case 'M' : arr = cLibrary.charM;
			break;

			case 'N' : arr = cLibrary.charN;
			break;

			case 'O' : arr = cLibrary.charO;
			break;

			case 'P' : arr = cLibrary.charP;
			break;

			case 'Q' : arr = cLibrary.charQ;
			break;

			case 'R' : arr = cLibrary.charR;
			break;

			case 'S' : arr = cLibrary.charS;
			break;

			case 'T' : arr = cLibrary.charT;
			break;

			case 'U' : arr = cLibrary.charU;
			break;

			case 'V' : arr = cLibrary.charV;
			break;

			case 'X' : arr = cLibrary.charX;
			break;

			case 'Y' : arr = cLibrary.charY;
			break;

			case 'Z' : arr = cLibrary.charZ;
			break;

			case '1' : arr = cLibrary.charOne;
			break;

			case '2' : arr = cLibrary.charTwo;
			break;

			case '3' : arr = cLibrary.charThree;
			break;

			case '4' : arr = cLibrary.charFour;
			break;

			case '5' : arr = cLibrary.charFive;
			break;

			case '6' : arr = cLibrary.charSix;
			break;

			case '7' : arr = cLibrary.charSeven;
			break;

			case '8' : arr = cLibrary.charEight;
			break;

			case '9' : arr = cLibrary.charNine;
			break;

			case '+' : arr = cLibrary.charPlus;
			break;

			case '-' : arr = cLibrary.charMinus;
			break;

			case '!' : arr = cLibrary.charXMark;
			break;

			case '*' : arr = cLibrary.charMulti;
			break;

			case ',' : arr = cLibrary.charComma;
			break;

			case '.' : arr = cLibrary.charDot;
			break;

			case '$' : arr = cLibrary.charDollar;
			break;

			case '=' : arr = cLibrary.charEquals;
			break;

			case '/' : arr = cLibrary.charFrontSlash;
			break;

			case '\\' : arr = cLibrary.charBackSlash;
			break;

			case '>' : arr = cLibrary.charGreaterThan;
			break;

			case '<' : arr = cLibrary.charLesserThan;
			break;

			case '&' : arr = cLibrary.charAnd;
			break;

			case '@' : arr = cLibrary.charAt;
			break;

			case ' ' : arr = cLibrary.charSpace;
			break;

			case '?' : arr = cLibrary.charQuestionmark;
			break;

			case '[' : arr = cLibrary.charLBracket;
			break;

			case ']' : arr = cLibrary.charRBracket;
			break;

			case '(' : arr = cLibrary.charLParenthes;
			break;

			case ')' : arr = cLibrary.charRParenthes;
			break;

			case '#' : arr = cLibrary.charHashtag;
			break;

			case '{' : arr = cLibrary.charCurlyLBracket;
			break;

			case '}' : arr = cLibrary.charCurlyRBracket;
			break;

			case ';' : arr = cLibrary.charSemicolon;
			break;

			case '"' : arr = cLibrary.charQuotationmark;
			break;

			case '_' : arr = cLibrary.charUnderline;
			break;
			
			case '%' : arr = cLibrary.charProcent;
			break;

			
			}
			
			
			try {
			    Thread.sleep(20);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			CharTester tester = new CharTester(arr);
			if(i == 2){
				System.out.print("HÄR");
			}
		}
	}
}
