/*
 * Name : Harsh Bimal Desai
 * Net Id: hbd140030
 * Date : 2/17/2015 
 * Purpose :  	Class Assignment for CS 6301.001
 * Description : This module is the User Interface layer. It will display the GUI. 
 * 
 * 
 */




import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;


public class Interface
{
	
	static JButton button1 = new JButton("Move Forward");					// Forward Button
	static JPanel panel2 = new Hardware();									//Panel for the Robot hardware
	static JRadioButton slowSpeed = new JRadioButton("Slow");				// Slow button
	static JRadioButton mediumSpeed = new JRadioButton("Medium");			//Medium button
	static JRadioButton fastSpeed = new JRadioButton("Fast");				// Fast Button
	static ButtonGroup speed = new ButtonGroup();
	static JButton button2 = new JButton("Move Backward");					// Back Button
	static JButton stop = new JButton("Stop");								// Stop button
	static JRadioButton camera = new JRadioButton("Camera ON");				// Camera button
	static JRadioButton cameraoff = new JRadioButton("Camera OFF");			//Camera off
	static ButtonGroup cameras = new ButtonGroup();
	static JButton temperature = new JButton("Send Temperature");			// Temperature button
	static JSlider armMovement = new JSlider(JSlider.HORIZONTAL,0,90,0); 	// Arm slider
	static JButton open = new JButton("Open");	static JButton close = new JButton("Close");
	static ButtonGroup claw = new ButtonGroup();
	static JSlider rotation = new JSlider(JSlider.HORIZONTAL,0,360,0); 		// Rotation slider
	
	
	public Interface()
	{
		createInterface();
		TechServ t =new TechServ();
	}
	
	public static void main(String[] args)
	{
		Interface i = new Interface();
		
		
	}
	
	// Creates the GUI
	public void createInterface()
	{
		JFrame mainFrame = new JFrame("Robot");
		mainFrame.setSize(600,600);
		JPanel mainPanel = new JPanel();
		JPanel panel1 = new JPanel();
		
		panel2.setBackground(Color.WHITE);
		mainFrame.setMinimumSize(new Dimension(600,600));
		// All the Controls
			
		
		rotation.setMajorTickSpacing(45);
		rotation.setPaintTicks(true);
		rotation.setMinorTickSpacing(1);
		armMovement.setMajorTickSpacing(30);
		armMovement.setMinorTickSpacing(5);
		armMovement.setPaintLabels(true);
		rotation.setPaintLabels(true);
		armMovement.setPaintTicks(true);
		slowSpeed.setActionCommand("slow");
		slowSpeed.setSelected(true);
		mediumSpeed.setActionCommand("medium");
		fastSpeed.setActionCommand("fast");
		speed.add(slowSpeed);	speed.add(fastSpeed); speed.add(mediumSpeed);
		cameras.add(camera);	cameras.add(cameraoff);
		camera.setActionCommand("CamOn");
		cameraoff.setActionCommand("CamOn");
		camera.setSelected(true);
		
		
		claw.add(open);   claw.add(close);
		
		// Group Layout is used for the layout of the panels and the various controls on the panels. 
		GroupLayout layout = new GroupLayout(panel1);
		layout.setAutoCreateGaps(true);
		
		// Horizontal Layout
		
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(button2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(stop, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)		
				.addComponent(rotation, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup()
						.addComponent(slowSpeed, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(mediumSpeed, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(fastSpeed, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
						.addComponent(camera, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(cameraoff, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(temperature, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(armMovement, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))		
				.addGroup(layout.createSequentialGroup()
						.addComponent(open, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(close, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		
		
		//Vertical layout
		
		layout.setVerticalGroup(layout.createSequentialGroup()
				
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						
						.addComponent(button2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						
						.addComponent(stop, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))		
				.addComponent(rotation, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(slowSpeed, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(mediumSpeed, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(fastSpeed, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(camera, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(cameraoff, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(temperature, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						
						.addComponent(armMovement, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))		
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(open, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(close, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				
				);
		
		panel1.setLayout(layout);
		mainPanel.setLayout(new GridLayout(1,2));
		 mainPanel.add(panel2);
	     mainPanel.add(panel1);
		panel1.setVisible(true);
		panel2.setVisible(true);
		
		
		mainFrame.getContentPane().add(mainPanel);
	
		mainFrame.setVisible(true);
		
		
		
	}

	
	
	
	
	
	
}
