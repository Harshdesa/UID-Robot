/*
 * Name : Harsh Bimal Desai
 * Net Id: hbd140030
 * Date : 2/17/2015 
 * Purpose :  	Class Assignment for CS 6301.001
 * Description : This module is the Hardware layer. It will display the Robot. 
 * 
 * 
 */




import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;



public class Hardware extends JPanel
{
	static int height,width;
	Hardware()
	{
		height = this.getHeight()+300;
		width = this.getWidth();

		
	}
	// All the variables are flags to how much the arm, robot body and the claws are rotated. 
	static int y=0;
	static int x=0;
	static int tempx = 20;
	static int temp=0;
	static int radius = 40;
	static int factorToRotateArm=0;
	static int factorToRotateArmx=0;
	static int factorToRotateRobotx=0;
	static int factorToRotateRoboty=0;
	static int factorToRotateRobotxa=0;
	static int factorToRotateRobotya=0;
	static int openClose=0;
	static int leftRight=40;
	static int leftRightArm=50;
	static String on="On";
	static int rotationdegrees=0;
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//System.out.println(this.getWidth());
		//System.out.println(this.getHeight());
		
		//int xPointsArm[]={this.getWidth()/2+10,this.getWidth()/2+rectX,          };
		
		Color color = new Color(204, 102, 102);
		g.setColor(color);
		//g.fill3DRect(this.getWidth()/2+x, this.getHeight()/2+y, 20, 40, true);
		//g.fill3DRect(this.getWidth()/2+10,this.getHeight()/2+10+y,40,20,true);
	//	g.drawLine(this.getWidth()/2+10, this.getHeight()/2+10+y, this.getWidth()/2+10+40, this.getHeight()/2+10+y);
		int n=this.getHeight()/2+10+y;
		int m = this.getWidth()/2+10+x;
		float degree = n-150;
		//float d = (radius)^2 - (m)^2 - (n)^2 + 2*n*degree - (degree)^2;
		//float c=(-d);
		int b = (-2)*m;
		float a=1;
		degree = this.getHeight()/2+10+y;
		float t = (b)^2 ;
		//int xOFCircle = (int) ((-b) + Math.sqrt(t-4*a*c))/2;
		degree = (float) (this.getHeight()/2+10+y - factorToRotateArm*0.45);

		//degree = n-200;
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        g2.draw(new Line2D.Float((float) (this.getWidth()/2+x),(float)(this.getHeight()/2+y),(float) (this.getWidth()/2+x),(float)(this.getHeight()/2+y+40)));		// This is the Robot body 
        g2.draw(new Line2D.Float((float) (m),(float) (n+10), (float) (this.getWidth()/2+10+x+leftRight-factorToRotateArmx*0.45),(float) (degree+10)));				// The is the robot arm 
        g2.draw(new Line2D.Float((float) (this.getWidth()/2+10+x+leftRight-factorToRotateArmx*0.45), degree+openClose, (float) (this.getWidth()/2+10+x+leftRightArm+leftRight-factorToRotateArmx*0.45),degree+openClose));		// This is the robot lower claw
        g2.draw(new Line2D.Float((float) (this.getWidth()/2+10+x+leftRight-factorToRotateArmx*0.45), degree+20-openClose, (float) (this.getWidth()/2+10+x+leftRightArm+leftRight-factorToRotateArmx*0.45),degree+20-openClose));	// This is the robot upper claw
		//g.drawLine(m, n, this.getWidth()/2+10+10	, degree);
       // g2.draw(new Line2D.Float(this.getWidth()/2+10, this.getHeight()/2+10+10+y, this.getWidth()/2+10+40, this.getHeight()/2+10+10+y));

		//g.drawPolygon(xPoints,yPoints,3);
		//g.drawPolygon(xPoints,yPoints2,3);
		//g.drawString("Hello", this.getWidth()/2,this.getHeight()/2);
		g.drawString("Temperature : " + (tempx+temp) + " Degree Celsius", 10, 10);			// This is the temperature displayed in text on the screen
		g.drawString("The Robot is rotated : " + rotationdegrees + " Degrees", 10, 25);		// This is the rotation degrees displayed in text on the screen. 
		g.drawString("The camera is"+ on, 10,40);
			
	}
	
	
	
	
	
	
}
