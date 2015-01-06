package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestArrayViewer extends JPanel implements ActionListener {
	private JPanel inputRowPanel;
	private JPanel inputColPanel;
	private JPanel commandPanel;
	private JPanel arrayPanel;

	private JButton readRow, writeRow, inputRowNbr, readCol, writeCol,
			inputColNbr;

	private Array7x7 arr7x7;
	private JTextField[] arrCol;
	private JTextField[] arrRow;

	public TestArrayViewer() {
		arr7x7 = new Array7x7();

		arrCol = new JTextField[7];
		arrRow = new JTextField[7];

		inputRowPanel = new JPanel();
		inputColPanel = new JPanel();
		commandPanel = new JPanel();
		arrayPanel = new JPanel();

		readRow = new JButton("Läs rad");
		writeRow = new JButton("Skriv rad");
		inputRowNbr = new JButton("Input rad nr");
		readCol = new JButton("Läs kol");
		writeCol = new JButton("Skriv kol");
		inputColNbr = new JButton("Input kol nr");

		JFrame frame = new JFrame("Testning");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		commandPanel.setLayout(new GridLayout(6, 1));
		inputRowPanel.setPreferredSize(new Dimension(70, 10));
		inputRowPanel.setLayout(new GridLayout(7, 1));
		inputColPanel.setPreferredSize(new Dimension(10, 70));
		inputColPanel.setLayout(new GridLayout(1, 7));
		arrayPanel.setPreferredSize(new Dimension(350, 350));
		arrayPanel.setLayout(new GridLayout(7, 7));

		frame.add(inputRowPanel, BorderLayout.WEST);
		frame.add(inputColPanel, BorderLayout.SOUTH);
		frame.add(commandPanel, BorderLayout.EAST);
		frame.add(arrayPanel, BorderLayout.CENTER);

		// fylla inputRowPanel
		for (int i = 0; i < 7; i++) {
			arrRow[i] = new JTextField();
			inputRowPanel.add(arrRow[i]);
		}
		// fylla inputColPanel
		for (int i = 0; i < 7; i++) {
			arrCol[i] = new JTextField();
			inputColPanel.add(arrCol[i]);
		}
		// fylla arrayPanel
		JTextArea temp;
		for (int i = 0; i < 7; i++) {
			for(int k = 0; k < 7; k++){
				temp = new JTextArea("" + arr7x7.getElement(i, k));
				arrayPanel.add(temp);			
			}
		}
		
		commandPanel.add(readRow);
		commandPanel.add(writeRow);
		commandPanel.add(inputRowNbr);
		commandPanel.add(readCol);
		commandPanel.add(writeCol);
		commandPanel.add(inputColNbr);
		
		readRow.addActionListener( this );
		writeRow.addActionListener(this);
		inputRowNbr.addActionListener(this);
		readCol.addActionListener(this);
		writeCol.addActionListener(this);
		inputColNbr.addActionListener(this);
		
		frame.pack();
		frame.setVisible(true);
	}
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == readRow){
				
			}
			if(e.getSource() == writeRow){
				
			}
			if(e.getSource() == inputRowNbr){
				
			}
			if(e.getSource() == readCol){
				
			}
			if(e.getSource() == writeCol){
				
			}
			if(e.getSource() == inputColNbr){
				
			}
			
		
		
	}

	public static void main(String[] args) {
		TestArrayViewer lol = new TestArrayViewer();
		// int[][] array = new int[][]{
		// { 0, 0, 0, 0, 0, 1, 0 },
		// { 0, 0, 0, 0, 0, 0, 0 },
		// { 0, 1, 0, 0, 0, 1, 0 },
		// { 0, 0, 1, 0, 0, 1, 0 },
		// { 0, 1, 1, 0, 1, 1, 1 },
		// { 0, 0, 1, 0, 1, 0, 0 },
		// { 1, 0, 1, 0, 0, 1, 0 }
		// };
	

		
	}
}
