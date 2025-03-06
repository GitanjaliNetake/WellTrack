package EclipseGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class MainDashboard extends JFrame {
	
	private Image img=new ImageIcon(MainDashboard.class.getResource("/i.jpg")).getImage().getScaledInstance(780,550,Image.SCALE_SMOOTH);
	private Image img1=new ImageIcon(MainDashboard.class.getResource("/co1.jpg")).getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH);


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDashboard frame = new MainDashboard();
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
	public MainDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(106, 90, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to DashBoard... !");
		lblNewLabel_2.setFont(new Font("Microsoft Himalaya", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(413, 30, 341, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(26, 30, 186, 70);
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LogOut");
		btnNewButton.setBackground(new Color(102, 204, 255));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		btnNewButton.setBounds(26, 203, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				HomePage hp=new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setForeground(new Color(0, 0, 139));
		
		JButton btnNewButton_2 = new JButton("Book Appoinment");
		btnNewButton_2.setBackground(new Color(102, 204, 255));
		btnNewButton_2.setBounds(26, 135, 168, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DashBoard db=new DashBoard();
				db.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnNewButton_1 = new JButton("View Appoinment\r\n");
		btnNewButton_1.setBackground(new Color(102, 204, 255));
		btnNewButton_1.setBounds(26, 169, 168, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ViewAppoinment va=new ViewAppoinment();
				va.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 764, 511);
		lblNewLabel.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel);
	}
}
