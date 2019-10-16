package Calculator_P;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operation;
   String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCalculator.setSize(260, 388);
		frmCalculator.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frmCalculator.getContentPane().setForeground(Color.CYAN);
		frmCalculator.setFont(new Font("Dialog", Font.BOLD, 18));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setType(Type.UTILITY);
		frmCalculator.setBackground(UIManager.getColor("Button.light"));
		frmCalculator.getContentPane().setBackground(SystemColor.textHighlight);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setForeground(new Color(255, 0, 0));
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBackground(new Color(204, 204, 255));
		textField.setBounds(10, 11, 223, 49);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		
        //row 1..............
		JButton TFback = new JButton("\uF0E7");
		TFback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace =null;
				
				if(textField.getText().length()>0) {
					StringBuilder sb = new StringBuilder(textField.getText());
					sb.deleteCharAt(textField.getText().length()-1);
					backspace=sb.toString();
					textField.setText(backspace);
					
				}
				
			}
		});
		
		TFback.setFont(new Font("Wingdings", Font.PLAIN, 12));
		TFback.setBounds(10, 71, 50, 50);
		frmCalculator.getContentPane().add(TFback);
		
		JButton TFclear = new JButton("C");
		TFclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		TFclear.setFont(new Font("Tahoma", Font.BOLD, 15));
		TFclear.setBounds(67, 71, 50, 50);
		frmCalculator.getContentPane().add(TFclear);
		
		
		JButton TFmod = new JButton("%");
		TFmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="%";
			}
		});
		TFmod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TFmod.setBounds(125, 71, 50, 50);
		frmCalculator.getContentPane().add(TFmod);
		
		JButton TFps = new JButton("\u00B1");
		TFps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops=Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops *(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		TFps.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TFps.setBounds(125, 290, 50, 50);
		frmCalculator.getContentPane().add(TFps);
		          //row 1..............
		JButton TF7 = new JButton("7");
		TF7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + TF7.getText();
				textField.setText(EnterNumber);
			}
		});
		TF7.setFont(new Font("Tahoma", Font.BOLD, 18));
		TF7.setBounds(10, 125, 50, 50);
		frmCalculator.getContentPane().add(TF7);
		
		JButton TF8 = new JButton("8");
		TF8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + TF8.getText();
				textField.setText(EnterNumber);
				
			}
		});
		
		
		TF8.setFont(new Font("Tahoma", Font.BOLD, 15));
		TF8.setBounds(67, 125, 50, 50);
		frmCalculator.getContentPane().add(TF8);
		
		
		JButton TF9 = new JButton("9");
		TF9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + TF9.getText();
				textField.setText(EnterNumber);
			}
		});
		
		TF9.setFont(new Font("Tahoma", Font.BOLD, 18));
		TF9.setBounds(125, 125, 50, 50);
		frmCalculator.getContentPane().add(TF9);
		
		JButton TFplus = new JButton("+");
		TFplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="+";
				
			}
		});
		TFplus.setFont(new Font("Tahoma", Font.BOLD, 15));
		TFplus.setBounds(183, 235, 50, 50);
		frmCalculator.getContentPane().add(TFplus);
		
		
		           //row 2.................
		
		JButton TF4 = new JButton("4");
		TF4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + TF4.getText();
				textField.setText(EnterNumber);
			}
		});
		TF4.setFont(new Font("Tahoma", Font.BOLD, 18));
		TF4.setBounds(10, 180, 50, 50);
		frmCalculator.getContentPane().add(TF4);
		
		JButton TF5 = new JButton("5");
		TF5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + TF5.getText();
				textField.setText(EnterNumber);
			}
		});
		TF5.setFont(new Font("Tahoma", Font.BOLD, 15));
		TF5.setBounds(67, 180, 50, 50);
		frmCalculator.getContentPane().add(TF5);
		
		
		JButton TF6 = new JButton("6");
		TF6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + TF6.getText();
				textField.setText(EnterNumber);
			}
		});
		TF6.setFont(new Font("Tahoma", Font.BOLD, 18));
		TF6.setBounds(125, 180, 50, 50);
		frmCalculator.getContentPane().add(TF6);
		
		JButton TFsub = new JButton("-");
		TFsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="-";
			}
		});
		TFsub.setFont(new Font("Tahoma", Font.BOLD, 18));
		TFsub.setBounds(183, 180, 50, 50);
		frmCalculator.getContentPane().add(TFsub);
		
		//row 3.................
		
				JButton TF1 = new JButton("1");
				TF1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + TF1.getText();
						textField.setText(EnterNumber);
					}
				});
				TF1.setFont(new Font("Tahoma", Font.BOLD, 18));
				TF1.setBounds(10, 235, 50, 50);
				frmCalculator.getContentPane().add(TF1);
				
				JButton TF2 = new JButton("2");
				TF2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + TF2.getText();
						textField.setText(EnterNumber);
					}
				});
				TF2.setFont(new Font("Tahoma", Font.BOLD, 15));
				TF2.setBounds(67, 235, 50, 50);
				frmCalculator.getContentPane().add(TF2);
				
				
				JButton TF3 = new JButton("3");
				TF3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + TF3.getText();
						textField.setText(EnterNumber);
					}
				});
				
				TF3.setFont(new Font("Tahoma", Font.BOLD, 18));
				TF3.setBounds(125, 235, 50, 50);
				frmCalculator.getContentPane().add(TF3);
				
				JButton TFmul = new JButton("*");
				TFmul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum=Double.parseDouble(textField.getText());
						textField.setText("");
						operation ="*";
					}
				});
				TFmul.setFont(new Font("Tahoma", Font.BOLD, 15));
				TFmul.setBounds(183, 125, 50, 50);
				frmCalculator.getContentPane().add(TFmul);
				
				//row 4.............
				JButton TF0 = new JButton("0");
				TF0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + TF0.getText();
						textField.setText(EnterNumber);
					}
				});
				TF0.setFont(new Font("Tahoma", Font.BOLD, 18));
				TF0.setBounds(10, 290, 50, 50);
				frmCalculator.getContentPane().add(TF0);
				
				JButton TFdot = new JButton(".");
				TFdot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + TFdot.getText();
						textField.setText(EnterNumber);
					}
				});
				TFdot.setFont(new Font("Tahoma", Font.BOLD, 15));
				TFdot.setBounds(67, 290, 50, 50);
				frmCalculator.getContentPane().add(TFdot);
				
				
				JButton TFeql = new JButton("=");
				TFeql.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String answer;
						secondnum = Double.parseDouble(textField.getText());
						if(operation == "+")
						{
							result = firstnum + secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if (operation == "-")
						{
							result = firstnum - secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if (operation == "*")
						{
							result = firstnum * secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						
						else if (operation == "/")
						{
							result = firstnum / secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if (operation == "%")
						{
							result = firstnum % secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						
						
					}
				});
				TFeql.setFont(new Font("Tahoma", Font.BOLD, 18));
				TFeql.setBounds(183, 290, 50, 50);
				frmCalculator.getContentPane().add(TFeql);
				
				JButton TFdiv = new JButton("/");
				TFdiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum=Double.parseDouble(textField.getText());
						textField.setText("");
						operation ="/";
					}
				});
				
				TFdiv.setFont(new Font("Tahoma", Font.BOLD, 18));
				TFdiv.setBounds(183, 71, 50, 50);
				frmCalculator.getContentPane().add(TFdiv);
				
	
		
	}
}
