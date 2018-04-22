package TicTacToes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class Player extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Player frame = new Player();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Player() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ijaju\\Desktop\\Tic-Tac-Toe-Cartoon-200.png"));
		setTitle("Tic Tac Toe");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 327);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhichPlayerU = new JLabel("Select symbol for first player");
		lblWhichPlayerU.setForeground(new Color(255, 255, 255));
		lblWhichPlayerU.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWhichPlayerU.setBounds(63, 48, 370, 32);
		contentPane.add(lblWhichPlayerU);
		
		JRadioButton buttonRadioButton1 = new JRadioButton("Choose X");
		buttonGroup.add(buttonRadioButton1);
		buttonRadioButton1.setBackground(new Color(0, 128, 128));
		buttonRadioButton1.setForeground(new Color(255, 255, 255));
		buttonRadioButton1.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonRadioButton1.setBounds(63, 99, 109, 32);
		contentPane.add(buttonRadioButton1);
		
		JRadioButton buttonRadioButton2 = new JRadioButton("Choose O");
		buttonGroup.add(buttonRadioButton2);
		buttonRadioButton2.setBackground(new Color(0, 128, 128));
		buttonRadioButton2.setForeground(new Color(255, 255, 255));
		buttonRadioButton2.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonRadioButton2.setBounds(63, 145, 109, 32);
		contentPane.add(buttonRadioButton2);
		
		JButton buttonStart = new JButton("Start game");
		buttonStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Enumeration<AbstractButton>bg=buttonGroup.getElements();
				while (bg.hasMoreElements()){
					JRadioButton jrb=(JRadioButton)bg.nextElement();
					
					if(jrb.isSelected()) {
						
						String check;
						check=jrb.getText();
						if(check.equals("Choose X")) {
							TicTacToe_X tictac_x=new TicTacToe_X();
							tictac_x.frmTicTacToe_x.setVisible(true);
							dispose();
						}
						
						else if(check.equals("Choose O")){
							TicTacToe_O tictac_o=new TicTacToe_O();
							tictac_o.frmTicTacToe.setVisible(true);
							dispose();
						}
						
					}
				}
			}
		});
		buttonStart.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonStart.setBackground(new Color(255, 255, 255));
		buttonStart.setForeground(new Color(0, 128, 128));
		buttonStart.setBounds(361, 233, 133, 40);
		contentPane.add(buttonStart);
	}
}
