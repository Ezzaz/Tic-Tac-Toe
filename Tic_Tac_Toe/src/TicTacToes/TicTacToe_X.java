package TicTacToes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class TicTacToe_X {

	public JFrame frmTicTacToe_x;
	private String startGame="X";
	private int xCount=0;
	private int oCount=0;
	
	private JLabel btn1;
	private JLabel btn2;
	private JLabel btn3;
	private JLabel btn4;
	private JLabel btn5;
	private JLabel btn6;
	private JLabel btn7;
	private JLabel btn8;
	private JLabel btn9;
	private JLabel lblPlayerX;
	private JLabel lblPlayerY;
	private JTextField txtCountX;
	private JTextField txtCountO;
	
	public JButton button1 = new JButton("");
	public JButton button2 = new JButton("");
	public JButton button3 = new JButton("");
	public JButton button4 = new JButton("");
	public JButton button5 = new JButton("");
	public JButton button6 = new JButton("");
	public JButton button7 = new JButton("");
	public JButton button8 = new JButton("");
	public JButton button9 = new JButton("");
	
	public JButton buttonReset = new JButton("Reset");
	public JButton buttonExit = new JButton("Exit");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe_X window = new TicTacToe_X();
					window.frmTicTacToe_x.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public TicTacToe_X() {
		initialize();
		JOptionPane.showMessageDialog(null, "First player turn");
		
	}
	
	private void buttonEnable() {
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);
		button5.setEnabled(true);
		button6.setEnabled(true);
		button7.setEnabled(true);
		button8.setEnabled(true);
		button9.setEnabled(true);
	}
	
	private void winningGame() {
		
		String b1=button1.getText();
		String b2=button2.getText();
		String b3=button3.getText();
		String b4=button4.getText();
		String b5=button5.getText();
		String b6=button6.getText();
		String b7=button7.getText();
		String b8=button8.getText();
		String b9=button9.getText();
		
/////////////// "Player 1" ///////////////
		
		if(b1==("X") && b2==("X") && b3==("X")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 1 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "First player turn");
			xCount++;
			gameScore();
			
				
				
					button1.setText(null);
					button2.setText(null);
					button3.setText(null);
					button4.setText(null);
					button5.setText(null);
					button6.setText(null);
					button7.setText(null);
					button8.setText(null);
					button9.setText(null);
					
					buttonEnable();
					choosePlayer();
						
		}
		
		if(b4==("X") && b5==("X") && b6==("X")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 1 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "First player turn");
			xCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
			
		}
		
		if(b7==("X") && b8==("X") && b9==("X")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 1 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "First player turn");
			xCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
			
		}
		
		if(b1==("X") && b4==("X") && b7==("X")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 1 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "First player turn");
			xCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
			
		}
		
		if(b2==("X") && b5==("X") && b8==("X")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 1 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "First player turn");
			xCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
			
		}
		
		if(b3==("X") && b6==("X") && b9==("X")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 1 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "First player turn");
			xCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
			
		}
		
		if(b1==("X") && b5==("X") && b9==("X")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 1 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "First player turn");
			xCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
			
		}
		
		if(b3==("X") && b5==("X") && b7==("X")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 1 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "First player turn");
			xCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
			
		}
		
		/////////////// "Player 2" ///////////////
		
		if(b1==("O") && b2==("O") && b3==("O")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 2 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "Second player turn");
			oCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
		}
		
		if(b4==("O") && b5==("O") && b6==("O")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 2 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "Second player turn");
			oCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
		}
		
		if(b7==("O") && b8==("O") && b9==("O")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 2 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "Second player turn");
			oCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
		}
		
		if(b1==("O") && b4==("O") && b7==("O")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 2 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "Second player turn");
			oCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
		}
		
		if(b2==("O") && b5==("O") && b8==("O")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 2 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "Second player turn");
			oCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
		}
		
		if(b3==("O") && b6==("O") && b9==("O")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 2 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "Second player turn");
			oCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
		}
		
		if(b1==("O") && b5==("O") && b9==("O")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 2 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "Second player turn");
			oCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
		}
		
		if(b3==("O") && b5==("O") && b7==("O")) {
			JOptionPane.showMessageDialog(frmTicTacToe_x, "Player 2 is win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showMessageDialog(null, "Second player turn");
			oCount++;
			gameScore();
			
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			
			buttonEnable();
			choosePlayer();
		}
	}
	
	//////////// "Score Method" /////////////
	
	private void gameScore() {
		txtCountX.setText(String.valueOf(xCount));
		txtCountO.setText(String.valueOf(oCount));
	}
	
	private void choosePlayer() {
		
		if(startGame.equalsIgnoreCase("X")) {
			startGame="O";
			//JOptionPane.showMessageDialog(null, "Second player turn");
		}
		
		else{
			startGame="X";
			//JOptionPane.showMessageDialog(null, "First player turn");
		}
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTicTacToe_x = new JFrame();
		frmTicTacToe_x.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ijaju\\Desktop\\Tic-Tac-Toe-Cartoon-200.png"));
		frmTicTacToe_x.setBackground(new Color(255, 255, 255));
		frmTicTacToe_x.setTitle("Tic Tac toe");
		frmTicTacToe_x.setResizable(false);
		frmTicTacToe_x.setBounds(100, 100, 1200, 600);
		frmTicTacToe_x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe_x.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frmTicTacToe_x.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button1.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button1.setForeground(Color.RED);
				}
				else {
					button1.setForeground(Color.BLUE);
				}
				button1.setEnabled(false);
				choosePlayer();
				winningGame();
			}
		});
		button1.setFont(new Font("Dialog", Font.BOLD, 54));
		panel_1.add(button1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button2.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button2.setForeground(Color.RED);
				}
				else {
					button2.setForeground(Color.BLUE);
				}
				
				button2.setEnabled(false);
				choosePlayer();
				winningGame();
			}
		});
		button2.setFont(new Font("Dialog", Font.BOLD, 54));
		panel_2.add(button2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button3.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button3.setForeground(Color.RED);
				}
				else {
					button3.setForeground(Color.BLUE);
				}
				
				button3.setEnabled(false);
				choosePlayer();
				winningGame();
			}
		});
		button3.setFont(new Font("Dialog", Font.BOLD, 54));
		panel_3.add(button3, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayerX = new JLabel("<html>Player 1<br>(X) :</html>");
		lblPlayerX.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerX.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_5.add(lblPlayerX, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		txtCountX = new JTextField();
		txtCountX.setHorizontalAlignment(SwingConstants.CENTER);
		txtCountX.setText("0");
		txtCountX.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_4.add(txtCountX, BorderLayout.CENTER);
		txtCountX.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button4.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button4.setForeground(Color.RED);
				}
				else {
					button4.setForeground(Color.BLUE);
				}
				
				button4.setEnabled(false);
				choosePlayer();
				winningGame();
			}
		});
		button4.setFont(new Font("Dialog", Font.BOLD, 54));
		panel_8.add(button4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button5.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button5.setForeground(Color.RED);
				}
				else {
					button5.setForeground(Color.BLUE);
				}
				
				button5.setEnabled(false);
				choosePlayer();
				winningGame();
			}
		});
		button5.setFont(new Font("Dialog", Font.BOLD, 54));
		panel_7.add(button5, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button6.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button6.setForeground(Color.RED);
				}
				else {
					button6.setForeground(Color.BLUE);
				}
				
				button6.setEnabled(false);
				choosePlayer();
				winningGame();
			}
		});
		button6.setFont(new Font("Dialog", Font.BOLD, 54));
		panel_9.add(button6, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayerO = new JLabel("<html>Player 2<br>(O) :</html>");
		lblPlayerO.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerO.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_10.add(lblPlayerO, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		txtCountO = new JTextField();
		txtCountO.setFont(new Font("Tahoma", Font.BOLD, 42));
		txtCountO.setHorizontalAlignment(SwingConstants.CENTER);
		txtCountO.setText("0");
		panel_11.add(txtCountO, BorderLayout.CENTER);
		txtCountO.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		

		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button7.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button7.setForeground(Color.RED);
				}
				else {
					button7.setForeground(Color.BLUE);
				}
				
				button7.setEnabled(false);
				choosePlayer();
				winningGame();
			}
		});
		button7.setFont(new Font("Dialog", Font.BOLD, 54));
		panel_12.add(button7, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button8.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button8.setForeground(Color.RED);
				}
				else {
					button8.setForeground(Color.BLUE);
				}
				
				button8.setEnabled(false);
				choosePlayer();
				winningGame();
			}
		});
		button8.setFont(new Font("Dialog", Font.BOLD, 54));
		panel_14.add(button8, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button9.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button9.setForeground(Color.RED);
				}
				else {
					button9.setForeground(Color.BLUE);
				}
				
				button9.setEnabled(false);
				choosePlayer();
				winningGame();
			}
		});
		button9.setFont(new Font("Dialog", Font.BOLD, 54));
		panel_15.add(button9, BorderLayout.CENTER);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		
		buttonReset.setFont(new Font("Tahoma", Font.BOLD, 36));
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				button1.setText(null);
				button1.setEnabled(true);
				button2.setText(null);
				button2.setEnabled(true);
				button3.setText(null);
				button3.setEnabled(true);
				button4.setText(null);
				button4.setEnabled(true);
				button5.setText(null);
				button5.setEnabled(true);
				button6.setText(null);
				button6.setEnabled(true);
				button7.setText(null);
				button7.setEnabled(true);
				button8.setText(null);
				button8.setEnabled(true);
				button9.setText(null);
				button9.setEnabled(true);
					
			}
		});
		panel_16.add(buttonReset, BorderLayout.CENTER);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		
		buttonExit.setFont(new Font("Tahoma", Font.BOLD, 36));
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTicTacToe_x.dispose();
				frmTicTacToe_x=new JFrame("Exit");
		
					Welcome welcome=new Welcome();
					welcome.setVisible(true);
					
			}
		});
		panel_17.add(buttonExit, BorderLayout.CENTER);
	}

}
