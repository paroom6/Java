package exam;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonClickTest extends JFrame {
	
	public ButtonClickTest() {
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("클릭");
		btn1.setBackground(Color.YELLOW);
		btn1.setPreferredSize(new Dimension(150,150));
		add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭함");
			}
		});
		
		setVisible(true);
		setSize(640, 480);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ButtonClickTest();
	}
}
