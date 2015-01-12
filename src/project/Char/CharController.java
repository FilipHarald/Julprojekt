package project.Char;

import javax.swing.JOptionPane;

import project.Arrays.Array7x7;

public class CharController {
	private Array7x7[] characterArray;
	private String theString;

	public CharController(String s) {
		if (s != null) {
			int diff = 4 - s.length();
			if (diff > 0) {
				for (int i = 0; i < diff; i++) {
					s = s + " ";
				}
			}
			s = s + " ";
			characterArray = new Array7x7[s.length()];
			theString = s;
		}
	}

	public Array7x7[] getCharacterArray() {

		theString = theString.toUpperCase();
		Char cLibrary = new Char();

		for (int i = 0; i < theString.length(); i++) {
			char chr = theString.charAt(i);

			switch (chr) {
			case 'A':
				characterArray[i] = new Array7x7(cLibrary.charA);
				break;

			case 'B':
				characterArray[i] = new Array7x7(cLibrary.charB);
				break;

			case 'C':
				characterArray[i] = new Array7x7(cLibrary.charC);
				break;

			case 'D':
				characterArray[i] = new Array7x7(cLibrary.charD);
				break;

			case 'E':
				characterArray[i] = new Array7x7(cLibrary.charE);
				break;

			case 'F':
				characterArray[i] = new Array7x7(cLibrary.charF);
				break;

			case 'G':
				characterArray[i] = new Array7x7(cLibrary.charG);
				break;

			case 'H':
				characterArray[i] = new Array7x7(cLibrary.charH);
				break;

			case 'I':
				characterArray[i] = new Array7x7(cLibrary.charI);
				break;

			case 'J':
				characterArray[i] = new Array7x7(cLibrary.charJ);
				break;

			case 'K':
				characterArray[i] = new Array7x7(cLibrary.charK);
				break;

			case 'L':
				characterArray[i] = new Array7x7(cLibrary.charL);
				break;

			case 'M':
				characterArray[i] = new Array7x7(cLibrary.charM);
				break;

			case 'N':
				characterArray[i] = new Array7x7(cLibrary.charN);
				break;

			case 'O':
				characterArray[i] = new Array7x7(cLibrary.charO);
				break;

			case 'P':
				characterArray[i] = new Array7x7(cLibrary.charP);
				break;

			case 'Q':
				characterArray[i] = new Array7x7(cLibrary.charQ);
				break;

			case 'R':
				characterArray[i] = new Array7x7(cLibrary.charR);
				break;

			case 'S':
				characterArray[i] = new Array7x7(cLibrary.charS);
				break;

			case 'T':
				characterArray[i] = new Array7x7(cLibrary.charT);
				break;

			case 'U':
				characterArray[i] = new Array7x7(cLibrary.charU);
				break;

			case 'V':
				characterArray[i] = new Array7x7(cLibrary.charV);
				break;

			case 'W':
				characterArray[i] = new Array7x7(cLibrary.charW);
				break;

			case 'X':
				characterArray[i] = new Array7x7(cLibrary.charX);
				break;

			case 'Y':
				characterArray[i] = new Array7x7(cLibrary.charY);
				break;

			case 'Z':
				characterArray[i] = new Array7x7(cLibrary.charZ);
				break;

			case '0':
				characterArray[i] = new Array7x7(cLibrary.charZero);
				break;

			case '1':
				characterArray[i] = new Array7x7(cLibrary.charOne);
				break;

			case '2':
				characterArray[i] = new Array7x7(cLibrary.charTwo);
				break;

			case '3':
				characterArray[i] = new Array7x7(cLibrary.charThree);
				break;

			case '4':
				characterArray[i] = new Array7x7(cLibrary.charFour);
				break;

			case '5':
				characterArray[i] = new Array7x7(cLibrary.charFive);
				break;

			case '6':
				characterArray[i] = new Array7x7(cLibrary.charSix);
				break;

			case '7':
				characterArray[i] = new Array7x7(cLibrary.charSeven);
				break;

			case '8':
				characterArray[i] = new Array7x7(cLibrary.charEight);
				break;

			case '9':
				characterArray[i] = new Array7x7(cLibrary.charNine);
				break;

			case '+':
				characterArray[i] = new Array7x7(cLibrary.charPlus);
				break;

			case '-':
				characterArray[i] = new Array7x7(cLibrary.charMinus);
				break;

			case '!':
				characterArray[i] = new Array7x7(cLibrary.charXMark);
				break;

			case '*':
				characterArray[i] = new Array7x7(cLibrary.charMulti);
				break;

			case ',':
				characterArray[i] = new Array7x7(cLibrary.charComma);
				break;

			case '.':
				characterArray[i] = new Array7x7(cLibrary.charDot);
				break;

			case '$':
				characterArray[i] = new Array7x7(cLibrary.charDollar);
				break;

			case '=':
				characterArray[i] = new Array7x7(cLibrary.charEquals);
				break;

			case '/':
				characterArray[i] = new Array7x7(cLibrary.charFrontSlash);
				break;

			case '\\':
				characterArray[i] = new Array7x7(cLibrary.charBackSlash);
				break;

			case '>':
				characterArray[i] = new Array7x7(cLibrary.charGreaterThan);
				break;

			case '<':
				characterArray[i] = new Array7x7(cLibrary.charLesserThan);
				break;

			case '&':
				characterArray[i] = new Array7x7(cLibrary.charAnd);
				break;

			case '@':
				characterArray[i] = new Array7x7(cLibrary.charAt);
				break;

			case ' ':
				characterArray[i] = new Array7x7(cLibrary.charSpace);
				break;

			case '?':
				characterArray[i] = new Array7x7(cLibrary.charQuestionmark);
				break;

			case '[':
				characterArray[i] = new Array7x7(cLibrary.charLBracket);
				break;

			case ']':
				characterArray[i] = new Array7x7(cLibrary.charRBracket);
				break;

			case '(':
				characterArray[i] = new Array7x7(cLibrary.charLParenthes);
				break;

			case ')':
				characterArray[i] = new Array7x7(cLibrary.charRParenthes);
				break;

			case '#':
				characterArray[i] = new Array7x7(cLibrary.charHashtag);
				break;

			case '{':
				characterArray[i] = new Array7x7(cLibrary.charCurlyLBracket);
				break;

			case '}':
				characterArray[i] = new Array7x7(cLibrary.charCurlyRBracket);
				break;

			case ';':
				characterArray[i] = new Array7x7(cLibrary.charSemicolon);
				break;

			case '"':
				characterArray[i] = new Array7x7(cLibrary.charQuotationmark);
				break;

			case '_':
				characterArray[i] = new Array7x7(cLibrary.charUnderline);
				break;

			case '%':
				characterArray[i] = new Array7x7(cLibrary.charProcent);
				break;

			default:
				characterArray[i] = new Array7x7(cLibrary.charUnknown);
				break;

			}
		}
		return characterArray;
	}
}
