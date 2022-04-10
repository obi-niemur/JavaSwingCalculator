import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
	
	private JTextField textField;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq, bcel;
	
	private static double a=0, b=0, result =0;
	private static int operator = 0;
	
	public Calculator() {
		super("IT232 Calculator ");
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(30,40,280,30);
		add(textField);
		
		b1 = new JButton("1");
		b1.setBounds(40,240,50,40);
		add(b1);
		
		b2 = new JButton("2");
		b2.setBounds(110,240,50,40);
		add(b2);
		
		b3 = new JButton("3");
		b3.setBounds(180,240,50,40);
		add(b3);
		
		b4 = new JButton("4");
		b4.setBounds(40,170,50,40);
		add(b4);
		
		b5 = new JButton("5");
		b5.setBounds(110,170,50,40);
		add(b5);
		
		b6 = new JButton("6");
		b6.setBounds(180,170,50,40);
		add(b6);
		
		b7 = new JButton("7");
		b7.setBounds(40,100,50,40);
		add(b7);
		
		b8 = new JButton("8");
		b8.setBounds(110,100,50,40);
		add(b8);
		
		b9 = new JButton("9");
		b9.setBounds(180,100,50,40);
		add(b9);
		
		b0 = new JButton("0");
		b0.setBounds(110,310,50,40);
		add(b0);
		
		
		bdiv = new JButton("/");
		bdiv.setBounds(250,100,50,40);
		add(bdiv);
		
		bmul = new JButton("*");
		bmul.setBounds(250,170,50,40);
		add(bmul);
		
		bsub = new JButton("-");
		bsub.setBounds(250,240,50,40);
		add(bsub);
		
		badd = new JButton("+");
		badd.setBounds(250,310,50,40);
		add(badd);
		
		bdec = new JButton(".");
		bdec.setBounds(40,310,50,40);
		add(bdec);
		
		beq = new JButton("=");
		beq.setBounds(180,310,50,40);
		add(beq);
		
		bcel = new JButton("Clear");
		bcel.setBounds(40, 390, 260, 40);
		add(bcel);
		
		
		
		
		
		TexteventHandler handler = new TexteventHandler();
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		b0.addActionListener(handler);
		bdec.addActionListener(handler);
		
		badd.addActionListener(handler);
		bsub.addActionListener(handler);
		bmul.addActionListener(handler);
		bdiv.addActionListener(handler);
		beq.addActionListener(handler);
		
		bcel.addActionListener(handler);
		
	}
	
	private class TexteventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==b1)
				textField.setText(textField.getText().concat("1"));
			
			if(e.getSource()==b2)
				textField.setText(textField.getText().concat("2"));
			
			if(e.getSource()==b3)
				textField.setText(textField.getText().concat("3"));
			
			if(e.getSource()==b4)
				textField.setText(textField.getText().concat("4"));
			
			if(e.getSource()==b5)
				textField.setText(textField.getText().concat("5"));
			
			if(e.getSource()==b6)
				textField.setText(textField.getText().concat("6"));
			
			if(e.getSource()==b7)
				textField.setText(textField.getText().concat("7"));
			
			if(e.getSource()==b8)
				textField.setText(textField.getText().concat("8"));
			
			if(e.getSource()==b9)
				textField.setText(textField.getText().concat("9"));
			
			if(e.getSource()==b0)
				textField.setText(textField.getText().concat("0"));
			
			
			if(e.getSource()==bdec)
				textField.setText(textField.getText().concat("."));
			
			if(e.getSource()==bcel)
				textField.setText("");
			
			if(e.getSource()==badd) {
				a = Double.parseDouble(textField.getText());
				operator=1;
				textField.setText("");
			}
			
			if(e.getSource()==bsub) {
				a = Double.parseDouble(textField.getText());
				operator=2;
				textField.setText("");
			}
			
			if(e.getSource()==bdiv) {
				a = Double.parseDouble(textField.getText());
				operator=3;
				textField.setText("");
			}
			
			if(e.getSource()==bmul) {
				a = Double.parseDouble(textField.getText());
				operator=4;
				textField.setText("");
			}
			
			if(e.getSource() == beq) {
				b = Double.parseDouble(textField.getText());
				switch(operator) {
				case 1: result = a+b;
				break;
				
				case 2: result = a-b;
				break;
				
				case 3: result= a/b;
				break;
				
				case 4: result = a*b;
				break;
				}
				System.out.println(result);
				textField.setText(Double.toString(result));
//				textField.setText(""+result);
				
				
			}
				
			
			
			
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal.setLayout(null);
		cal.setSize(500,500);
		cal.setVisible(true);

	}

}
