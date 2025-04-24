package codechallenges;

import javax.swing.*;
import java.awt.*;

public class Heart {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("\u2764");
		label.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 100));
		label.setForeground(Color.RED);
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);
	}

}
