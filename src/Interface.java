import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class Interface {

	static JFrame mainFrame;
	static int frameWidth = 600;
	static int frameHeight = 400;

	public static void createInterface() {
		mainFrame = new JFrame();
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setPreferredSize(new Dimension(frameWidth, frameHeight));
        mainFrame.setLocation((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - frameWidth / 2), (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2 - frameHeight / 2));

        mainFrame.pack();
        mainFrame.setVisible(true);
	}

}
