package EclipseGui;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class HomePage extends JFrame {
	private Image img=new ImageIcon(HomePage.class.getResource("/WHO11.jpg")).getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
	private Image img1=new ImageIcon(HomePage.class.getResource("/cv.jpg")).getImage().getScaledInstance(900,500,Image.SCALE_SMOOTH);
	private Image img2=new ImageIcon(HomePage.class.getResource("/home1.jpg")).getImage().getScaledInstance(70,50,Image.SCALE_SMOOTH);


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(24, 209, 115, 37);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForm lg=new LoginForm();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("Precautions");
		btnNewButton_1_1.setBounds(24, 314, 138, 37);
		btnNewButton_1_1.setBackground(new Color(204, 204, 255));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Precautions p=new Precautions();
				p.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(33, 23, 70, 50);
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		contentPane.add(lblNewLabel_2);
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1.setBorderPainted(false);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("----------------------------------------------------------------------------------------");
		lblNewLabel_1.setBounds(217, 47, 369, 14);
		lblNewLabel_1.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Welcome to Covid-19 Vaccination Drive ");
		lblNewLabel.setBounds(181, 23, 434, 29);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign In");
		btnNewButton_1.setBounds(24, 257, 115, 37);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				RegisterationForm rg=new RegisterationForm();
				rg.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBackground(new Color(204, 204, 255));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(btnNewButton_1);
		
		JLabel backgrd = new JLabel("");
		backgrd.setBounds(0, 0, 762, 485);
		backgrd.setBackground(new Color(135, 206, 235));
		backgrd.setIcon(new ImageIcon(img1));
		
		contentPane.add(backgrd);
	}
}
