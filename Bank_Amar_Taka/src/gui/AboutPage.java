package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AboutPage extends JFrame{
	private Container c;
	private ImageIcon icon;
	//private JPanel singPanel, logPanel, usrPanel;
	private JButton zero, backButton;
	AboutPage(int x, int y)
	{
		/*********************** Same Everywhere**********************/
		Color backgroundColor = new Color(133,172,233);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("About this project and us");
		this.setBounds(x,y, 1000,1000);
		this.setResizable(false);
		this.c = this.getContentPane();
		this.c.setLayout(null);
		this.c.setBackground(backgroundColor);  
		this.icon = new ImageIcon(getClass().getResource("images/icon.png"));
		this.setIconImage(icon.getImage());
		
		
		zero = new JButton(); zero.setBounds(0,0,0,0); c.add(zero);
		
//........................PROJECT work Starts....................................

		JLabel project = new JLabel("Project");
		project.setBounds(50,50,700,50);
		project.setFont(new Font("Arial", Font.BOLD,25));
		c.add(project);

		JLabel projectName = new JLabel("Name: Amar Taka Banking");
		projectName.setBounds(150,100,700,50);
		projectName.setFont(new Font("Arial", Font.PLAIN,25));
		c.add(projectName); 

		JLabel courseName = new JLabel("Course-CSC1205: OOP1 - OBJECT ORIENTED PROGRAMMING 1 )");
		courseName.setBounds(150,150,800,50);
		courseName.setFont(new Font("Arial", Font.PLAIN,25));
		c.add(courseName); 

		JLabel languageName = new JLabel("Language Used: Java and GUI for Graphics");
		languageName.setBounds(150,200,700,50);
		languageName.setFont(new Font("Arial", Font.PLAIN,25));
		c.add(languageName); 
		
//.................................name of the Developers........................

		// ................fahimul................

		JLabel developers = new JLabel("Developers");
		developers.setBounds(50,275,700,50);
		developers.setFont(new Font("Arial", Font.BOLD,25));
		c.add(developers);

		JPanel fahimulPanel = new JPanel();
		fahimulPanel.setLayout(null);
		fahimulPanel.setBounds(150, 350, 700, 150);
		fahimulPanel.setBackground(new Color(150,190,250));
		c.add(fahimulPanel);

		JLabel fahimulNameLabel = new JLabel("Name: Fahimul Arefin");
		fahimulNameLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		fahimulNameLabel.setBounds(20,10,300,50);
		fahimulPanel.add(fahimulNameLabel);

		JLabel fahimulIdLabel = new JLabel("ID: 22-47778-2");
		fahimulIdLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		fahimulIdLabel.setBounds(20,50,300,50);
		fahimulPanel.add(fahimulIdLabel);

		JLabel fahimulUniLabel = new JLabel("Undergraduate student in CSE at AIUB");
		fahimulUniLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		fahimulUniLabel.setBounds(20,90,700,50);
		fahimulPanel.add(fahimulUniLabel);



		// .....................NasrinNipa...................

		JPanel NasrinNipaPanel = new JPanel();
		NasrinNipaPanel.setLayout(null);
		NasrinNipaPanel.setBounds(150, 525, 700, 150);
		NasrinNipaPanel.setBackground(new Color(150,190,250));
		c.add(NasrinNipaPanel);

		JLabel NasrinNipaNameLabel = new JLabel("Name: Nasrin Nipa");
		NasrinNipaNameLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		NasrinNipaNameLabel.setBounds(20,10,400,50);
		NasrinNipaPanel.add(NasrinNipaNameLabel);

		JLabel NasrinNipaIdLabel = new JLabel("ID: 22-49714-3");
		NasrinNipaIdLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		NasrinNipaIdLabel.setBounds(20,50,300,50);
		NasrinNipaPanel.add(NasrinNipaIdLabel);

		JLabel NasrinNipaUniLabel = new JLabel("Undergraduate student in CSE at AIUB");
		NasrinNipaUniLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		NasrinNipaUniLabel.setBounds(20,90,700,50);
		NasrinNipaPanel.add(NasrinNipaUniLabel);



		//......................tamannadilshad..................

		JPanel tamannadilshadPanel = new JPanel();
		tamannadilshadPanel.setLayout(null);
		tamannadilshadPanel.setBounds(150, 700, 700, 150);
		tamannadilshadPanel.setBackground(new Color(150,190,250));
		c.add(tamannadilshadPanel);

		JLabel tamannadilshadNameLabel = new JLabel("Name: Md. Tamanna Dilshad ");
		tamannadilshadNameLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		tamannadilshadNameLabel.setBounds(20,10,400,50);
		tamannadilshadPanel.add(tamannadilshadNameLabel);

		JLabel tamannadilshadIdLabel = new JLabel("ID: 23-53174-3");
		tamannadilshadIdLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		tamannadilshadIdLabel.setBounds(20,50,300,50);
		tamannadilshadPanel.add(tamannadilshadIdLabel);

		JLabel tamannadilshadUniLabel = new JLabel("Undergraduate student in CSE at AIUB");
		tamannadilshadUniLabel.setFont(new Font("Gotham", Font.PLAIN,20));
		tamannadilshadUniLabel.setBounds(20,90,700,50);
		tamannadilshadPanel.add(tamannadilshadUniLabel);



		//.....................................................

		backButton = new JButton("Back");
		backButton.setBackground(new Color(96,96,96));
		backButton.setFont(new Font("Gotham", Font.PLAIN,20));
		backButton.setForeground(Color.WHITE);
		backButton.setBounds(450, 875, 100,50);
		c.add(backButton);


		backButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				Point point = getLocation();
				int x = (int)point.getX(); int y = (int)point.getY();
				MainPage main = new MainPage(x,y);
				main.setVisible(true);	
				dispose();
			}
		});

		
	}
}
