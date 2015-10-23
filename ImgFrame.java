/*
 * Name : Harsh Bimal Desai
 * Net Id: hbd140030
 * Date : 2/17/2015 
 * Purpose :  	Class Assignment for CS 6301.001
 * Description : This module is the Camera Layer. It will display an Image when the camera for the robot is turned on.  
 * 
 * 
 */


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;



public class ImgFrame extends JFrame implements WindowListener
{
	BufferedImage img = null;
	
	ImgFrame()
	{
		this.setTitle("Camera");
		addWindowListener(this);
		setSize(400,400);
		//setVisible(true);
		setMinimumSize(new Dimension(400,400));
	}
	public void paint(Graphics g)
	{
		try {
		    img = ImageIO.read(new File("strawberry.jpg"));
		} catch (IOException e) {
		}
		g.drawImage(img, 10, 10, (this.getWidth()/5)*TechServ.zoomlevel , (this.getHeight()/5)*TechServ.zoomlevel , null);
		
	}
	
	// The cameraoff radio button will be set on closing the window.
        public void windowClosing(WindowEvent e)
        {
            Interface.cameraoff.setSelected(true);
            e.getWindow().dispose();
        }
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
   
	
	
	
	
}
