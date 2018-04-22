package TicTacToes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Welcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	
	public Welcome() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ijaju\\Desktop\\Tic-Tac-Toe-Cartoon-200.png"));
		setTitle("Tic Tac Toe");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 385);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToTic = new JLabel("Welcome To Tic Tac Toe Game");
		lblWelcomeToTic.setForeground(Color.WHITE);
		lblWelcomeToTic.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblWelcomeToTic.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToTic.setBounds(80, 36, 479, 41);
		contentPane.add(lblWelcomeToTic);
		
		JLabel lblNewLabel = new JLabel("<html>Tic-tac-toe is a paper-and-pencil game for two players,X and O, who take turns marking the spaces in a 3 grid.</br>The player who succeeds in placing three of their marks in a horizontal,vertical, or diagonal row wins the game.</html>");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(24, 126, 586, 113);
		contentPane.add(lblNewLabel);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Player player=new Player();
				player.setVisible(true);
				dispose();
			}
		});
		btnNext.setBackground(new Color(255, 255, 255));
		btnNext.setForeground(new Color(0, 128, 128));
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNext.setBounds(246, 261, 139, 34);
		contentPane.add(btnNext);
	}
}
