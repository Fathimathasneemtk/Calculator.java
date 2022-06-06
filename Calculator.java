
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	boolean isoperaterclicked=false;
	String oldvalue;
	JFrame jf;
	JLabel displayLabel ;
	JButton dotButton,zeroButton,clearButton,slashButton,multiButton,plusButton,minusButton,asignButton;
	JButton oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton,sevenButton,eightButton,nineButton;
	int operator=0;
	public Calculator() {
		jf =new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(550, 600);
		jf.setLocation(800, 100);

		displayLabel = new JLabel();
		displayLabel.setBounds(10, 10, 530, 90);
		displayLabel.setBackground(Color.WHITE);
		displayLabel.setOpaque(true);
		displayLabel.setForeground(Color.black);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT     );
		jf.add(displayLabel);

		sevenButton = new JButton("7");
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial",Font.BOLD, 30));
		sevenButton.setBounds(10, 110, 90, 90);
		jf.add(sevenButton);

		eightButton = new JButton("8");
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Arial",Font.BOLD, 30));
		eightButton.setBounds(125, 110, 90, 90);
		jf.add(eightButton);

		 nineButton = new JButton("9");
		 nineButton.addActionListener(this);
		 nineButton.setFont(new Font("Arial",Font.BOLD, 30));
		nineButton.setBounds(240, 110, 90, 90);
		jf.add(nineButton);

		fiveButton = new JButton("5");
		fiveButton.setFont(new Font("Arial",Font.BOLD, 30));
		fiveButton.addActionListener(this);
		fiveButton.setBounds(125, 220, 90, 90);
		jf.add(fiveButton);

		sixButton = new JButton("6");
		sixButton.setFont(new Font("Arial",Font.BOLD, 30));
		sixButton.addActionListener(this);
		sixButton.setBounds(240, 220, 90, 90);
		jf.add(sixButton);

		 fourButton = new JButton("4");
		 fourButton.setFont(new Font("Arial",Font.BOLD, 30));
		 fourButton.addActionListener(this);
		fourButton.setBounds(10, 220, 90, 90);
		jf.add(fourButton);

		 oneButton = new JButton("1");
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial",Font.BOLD, 30));
		oneButton.setBounds(10, 340, 90, 90);
		jf.add(oneButton);

	 twoButton = new JButton("2");
	 twoButton.addActionListener(this);
	 twoButton.setFont(new Font("Arial",Font.BOLD, 30));
		twoButton.setBounds(125, 340, 90, 90);
		jf.add(twoButton);

		threeButton = new JButton("3");
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial",Font.BOLD, 30));
		threeButton.setBounds(240, 340, 90, 90);
		jf.add(threeButton);

	dotButton = new JButton(".");
	dotButton.addActionListener(this);
	dotButton.setFont(new Font("Arial",Font.BOLD, 30));
		dotButton.setBounds(10, 460, 90, 90);
		jf.add(dotButton);

		zeroButton = new JButton("0");
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Arial",Font.BOLD, 30));
		zeroButton.setBounds(125, 460, 90, 90);
		jf.add(zeroButton);

		asignButton = new JButton("=");
		asignButton.addActionListener(this);
		asignButton.setFont(new Font("Arial",Font.BOLD, 30));
		asignButton.setBounds(240, 460, 90, 90);
		jf.add(asignButton);

		 minusButton = new JButton("-");
		 minusButton.addActionListener(this);
		 minusButton.setFont(new Font("Arial",Font.BOLD, 30));
		minusButton.setBounds(355, 340, 90, 90);
		jf.add(minusButton);

		slashButton = new JButton("/");
		slashButton.addActionListener(this);
		slashButton.setFont(new Font("Arial",Font.BOLD, 30));
		slashButton.setBounds(355, 110, 90, 90);
		jf.add(slashButton);

		 plusButton = new JButton("+");
		 plusButton.addActionListener(this);
		 plusButton.setFont(new Font("Arial",Font.BOLD, 30));
		plusButton.setBounds(355, 460, 90, 90);
		jf.add(plusButton);

		 multiButton = new JButton("*");
		 multiButton.addActionListener(this);
		 multiButton.setFont(new Font("Arial",Font.BOLD, 30));
		multiButton.setBounds(355, 220, 90, 90);
		jf.add(multiButton);

		clearButton = new JButton("clear");
		clearButton.setFont(new Font("Arial",Font.BOLD, 30));
	clearButton.addActionListener(this);
		clearButton.setBounds(455, 110, 70, 435);
		jf.add(clearButton);

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			if(isoperaterclicked) {
			displayLabel.setText("7");
			isoperaterclicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");	
				displayLabel.setFont(new Font("Arial",Font.BOLD, 30));
			}
			
		}else if(e.getSource()==eightButton) {
			if(isoperaterclicked) {
				displayLabel.setText("8");
				isoperaterclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"8");
				}
		
		}else if(e.getSource()==nineButton) {
			if(isoperaterclicked) {
				displayLabel.setText("9");
				isoperaterclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"9");
				}
		}else if(e.getSource()==fourButton) {
			if(isoperaterclicked) {
				displayLabel.setText("4");
				isoperaterclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"4");
				}
		}else if(e.getSource()==fiveButton) {
			if(isoperaterclicked) {
				displayLabel.setText("5");
				isoperaterclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"5");
				}
		}else if(e.getSource()==sixButton) {
			if(isoperaterclicked) {
				displayLabel.setText("6");
				isoperaterclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"6");	
				}
		}else if(e.getSource()==oneButton) {
			if(isoperaterclicked) {
				displayLabel.setText("1");
				isoperaterclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"1");
				}
		}else if(e.getSource()==twoButton) {
			if(isoperaterclicked) {
				displayLabel.setText("2");
				isoperaterclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"2");	
				}
		}else if(e.getSource()==threeButton) {
			if(isoperaterclicked) {
				displayLabel.setText("3");
				isoperaterclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"3");
				}
		}else if(e.getSource()==dotButton) {
			if(isoperaterclicked) {
				displayLabel.setText(".");
				isoperaterclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+".");
				}
		}else if(e.getSource()==zeroButton) {
			if(isoperaterclicked) {
				displayLabel.setText("0");
				isoperaterclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"0");
					
				}
		}else if(e.getSource()==plusButton) {
			isoperaterclicked=true;
			oldvalue=displayLabel.getText();
			operator=1;
		}else if(e.getSource()==minusButton) {
			isoperaterclicked=true;
			oldvalue=displayLabel.getText();
			operator=2;
		}else if(e.getSource()==slashButton) {
			isoperaterclicked=true;
			oldvalue=displayLabel.getText();
			operator=4;
		}else if(e.getSource()==multiButton) {
			isoperaterclicked=true;
			oldvalue=displayLabel.getText();
			operator=3;
		}else if(e.getSource()==asignButton) {
			String newvalue=displayLabel.getText();
			float oldvalueF=Float.parseFloat(oldvalue);
			float newvalueF=Float.parseFloat(newvalue);
			switch(operator) {
			case 1:
				float result1= newvalueF+oldvalueF;
				displayLabel.setFont(new Font("Arial",Font.BOLD, 30));
				displayLabel.setText(result1+"");
				break;
			case 2:
				float result2= oldvalueF-newvalueF;
				displayLabel.setFont(new Font("Arial",Font.BOLD, 30));
				displayLabel.setText(result2+"");
				break;
			case 3:
				float result3= newvalueF*oldvalueF;
				displayLabel.setFont(new Font("Arial",Font.BOLD, 30));
				displayLabel.setText(result3+"");
				break;
			case 4:
				float result4= oldvalueF/newvalueF;
				displayLabel.setFont(new Font("Arial",Font.BOLD, 30));
				displayLabel.setText(result4+"");
				break;
			default:
				float result5=0;
				displayLabel.setText(result5+"");
			}	
			
			
			
		
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");
			
	}
		}
}

