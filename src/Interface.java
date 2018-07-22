import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;

public class Interface {

	static JFrame mainFrame;
	static JPanel controlPanel;
	static int frameWidth = 600;
	static int frameHeight = 400;
	static String returnStatement = "";

	public static String createInterface() {
		mainFrame = new JFrame();

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setPreferredSize(new Dimension(frameWidth, frameHeight));
		mainFrame.setResizable(false);
		mainFrame.setLocation((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - frameWidth / 2),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2 - frameHeight / 2));

		controlPanel = new JPanel();
		mainFrame.add(controlPanel, BorderLayout.CENTER);
		JButton startGame = new JButton("Start");
		startGame.setBorder(BorderFactory.createEmptyBorder());
		startGame.setPreferredSize(new Dimension(frameWidth, frameHeight / 3 - 16));
		startGame.setLocation(0, 0);
		startGame.setBackground(new java.awt.Color(226, 226, 226));
		startGame.setFont(new Font("Arial", Font.PLAIN, 30));
		startGame.setFocusPainted(false);
		startGame.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				startGame.setBackground(new java.awt.Color(220, 220, 220));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				startGame.setBackground(new java.awt.Color(226, 226, 226));
			}
		});
		startGame.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				startGamePanel();
			}
		});
		controlPanel.add(startGame);
		JButton settings = new JButton("Settings");
		settings.setBorder(BorderFactory.createEmptyBorder());
		settings.setPreferredSize(new Dimension(frameWidth, frameHeight / 3 - 16));
		settings.setLocation(frameHeight / 3, 0);
		settings.setBackground(new java.awt.Color(226, 226, 226));
		settings.setFont(new Font("Arial", Font.PLAIN, 30));
		settings.setFocusPainted(false);
		settings.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				settings.setBackground(new java.awt.Color(220, 220, 220));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				settings.setBackground(new java.awt.Color(226, 226, 226));
			}
		});
		settings.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				settingsPanel();
			}
		});
		controlPanel.add(settings);
		JButton exitGame = new JButton("Exit");
		exitGame.setBorder(BorderFactory.createEmptyBorder());
		exitGame.setPreferredSize(new Dimension(frameWidth, frameHeight / 3 - 16));
		exitGame.setLocation(frameHeight / 3 * 2, 0);
		exitGame.setBackground(new java.awt.Color(226, 226, 226));
		exitGame.setFont(new Font("Arial", Font.PLAIN, 30));
		exitGame.setFocusPainted(false);
		exitGame.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				exitGame.setBackground(new java.awt.Color(220, 220, 220));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				exitGame.setBackground(new java.awt.Color(226, 226, 226));
			}
		});
		exitGame.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				System.exit(0);
			}
		});
		controlPanel.add(exitGame);

		mainFrame.pack();
		mainFrame.setVisible(true);
		return returnStatement;

	}
	
	public static void settingsPanel() {
		JPanel settingsPanel = new JPanel();
		mainFrame.add(settingsPanel, BorderLayout.CENTER);
		mainFrame.getContentPane().remove(controlPanel);
		
		JLabel playerOne = new JLabel("Player 1");
		playerOne.setFont(new Font("Arial", Font.PLAIN, 15));
		playerOne.setPreferredSize(new Dimension(frameWidth, frameHeight / 10 ));
		playerOne.setHorizontalAlignment(SwingConstants.CENTER);
		settingsPanel.add(playerOne);
		JButton cross = new JButton("Cross");
		settingsPanel.add(cross);
		JButton circle = new JButton("Circle");
		settingsPanel.add(circle);
		ButtonGroup playerStyle = new ButtonGroup();
		JRadioButton singlePlayer = new JRadioButton("Singleplayer", true);
		singlePlayer.setPreferredSize(new Dimension(frameWidth, frameHeight / 10 ));
		singlePlayer.setHorizontalAlignment(SwingConstants.CENTER);
		playerStyle.add(singlePlayer);
		settingsPanel.add(singlePlayer);
		JRadioButton multiPlayer = new JRadioButton("Multiplayer");
		multiPlayer.setPreferredSize(new Dimension(frameWidth, frameHeight / 10 ));
		multiPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		playerStyle.add(multiPlayer);
		settingsPanel.add(multiPlayer);
		
		if(singlePlayer.isSelected() == true)
		
		mainFrame.repaint();
		mainFrame.validate();
		mainFrame.pack();
		
	}
	
	public static void startGamePanel() {
		
	};

}
