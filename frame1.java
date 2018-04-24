package test;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		getContentPane().setBackground( Color.red );
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("DAY 1");
		chckbxNewCheckBox.setVerticalAlignment(SwingConstants.TOP);
		chckbxNewCheckBox.setBounds(6, 7, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("DAY 2");
		chckbxNewCheckBox_1.setBounds(6, 95, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("DAY 3");
		chckbxNewCheckBox_2.setVerticalAlignment(SwingConstants.BOTTOM);
		chckbxNewCheckBox_2.setBounds(6, 179, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		

		
		//label 1
		JLabel lblNewLabel = new JLabel();
		Image img1 = new ImageIcon(this.getClass().getResource("/adele.jpg")).getImage();
		lblNewLabel.setBounds(109, 11, 84, 66);
		//mini(lblNewLabel,img1);
		lblNewLabel.setIcon(new ImageIcon(img1));
		
		Image newImage1 = img1.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(newImage1));
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
		//label 2
		JLabel label2 = new JLabel();
		label2.setBounds(214, 11, 78, 66);
		Image img2 = new ImageIcon(this.getClass().getResource("/bts.jpg")).getImage();
		//mini(label2,img2);
		
		label2.setIcon(new ImageIcon(img2));
		
		Image newImage2 = img2.getScaledInstance(label2.getWidth(), label2.getHeight(), Image.SCALE_SMOOTH);
		label2.setIcon(new ImageIcon(newImage2));
		frame.getContentPane().add(label2);
		
		//label 3
		JLabel label3 = new JLabel("");
		label3.setBounds(331, 11, 78, 66);
		Image img3 = new ImageIcon(this.getClass().getResource("/taylor.jpg")).getImage();
		//mini(label3,img3);
		label3.setIcon(new ImageIcon(img3));
		
		Image newImage3 = img3.getScaledInstance(label3.getWidth(), label3.getHeight(), Image.SCALE_SMOOTH);
		label3.setIcon(new ImageIcon(newImage3));
		frame.getContentPane().add(label3);
        
		
		//label 4   
		JLabel label4 = new JLabel("");
		label4.setBounds(109, 99, 84, 66);
		Image img4 = new ImageIcon(this.getClass().getResource("/ariana.jpg")).getImage();
		//mini(label4,img4);
		label4.setIcon(new ImageIcon(img4));
		
		Image newImage4 = img4.getScaledInstance(label4.getWidth(), label4.getHeight(), Image.SCALE_SMOOTH);
		label4.setIcon(new ImageIcon(newImage4));
		frame.getContentPane().add(label4);
		
		
		//label 5
		JLabel label5 = new JLabel("");
		label5.setBounds(214, 95, 78, 70);
		Image img5 = new ImageIcon(this.getClass().getResource("/selena.jpg")).getImage();
		//mini(label5,img5);
		label5.setIcon(new ImageIcon(img5));
		
		Image newImage5 = img5.getScaledInstance(label5.getWidth(), label5.getHeight(), Image.SCALE_SMOOTH);
		label5.setIcon(new ImageIcon(newImage5));
		frame.getContentPane().add(label5);
		
		
		//label 6
		JLabel label6 = new JLabel("");
		label6.setBounds(331, 88, 78, 77);
		Image img6 = new ImageIcon(this.getClass().getResource("/ed sheeran.jpg")).getImage();
		//mini(label6,img6);
		label6.setIcon(new ImageIcon(img6));
		
		Image newImage6 = img6.getScaledInstance(label6.getWidth(), label6.getHeight(), Image.SCALE_SMOOTH);
		label6.setIcon(new ImageIcon(newImage6));
		frame.getContentPane().add(label6);
		
		
		//label 7
		JLabel label7 = new JLabel("");
		label7.setBounds(109, 179, 78, 66);
		Image img7 = new ImageIcon(this.getClass().getResource("/passenfer.jpg")).getImage();
		//mini(label7,img7);
		label7.setIcon(new ImageIcon(img7));
		
		Image newImage7 = img7.getScaledInstance(label7.getWidth(), label7.getHeight(), Image.SCALE_SMOOTH);
		label7.setIcon(new ImageIcon(newImage7));
		frame.getContentPane().add(label7);
		
		
		//label 8
		JLabel label8 = new JLabel("");
		label8.setBounds(214, 179, 78, 66);
		Image img8 = new ImageIcon(this.getClass().getResource("/nuclea.jpg")).getImage();
		//mini(label8,img8);
		label8.setIcon(new ImageIcon(img8));
		
		Image newImage8 = img8.getScaledInstance(label8.getWidth(), label8.getHeight(), Image.SCALE_SMOOTH);
		label8.setIcon(new ImageIcon(newImage8));
		frame.getContentPane().add(label8);
		
		//label 9
		JLabel label9 = new JLabel("");
		label9.setBounds(341, 179, 83, 66);
		Image img9 = new ImageIcon(this.getClass().getResource("/lost frequencies.jpg")).getImage();
		//mini(label9,img9);
		label9.setIcon(new ImageIcon(img9));
		
		Image newImage9 = img9.getScaledInstance(label9.getWidth(), label9.getHeight(), Image.SCALE_SMOOTH);
		label9.setIcon(new ImageIcon(newImage9));
		frame.getContentPane().add(label9);
		
	
		
		
		}

//	public int mini(JLabel l, Image i) {
		//Image img = new ImageIcon(this.getClass().getResource("/adele.jpg")).getImage();
//		l.setIcon(new ImageIcon(i));
//		
//		Image newImage1 = i.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
//		l.setIcon(new ImageIcon(newImage1));
		//frame.getContentPane().add(l); 
//		return 1;
//	}
}
