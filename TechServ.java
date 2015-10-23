/*
 * Name : Harsh Bimal Desai
 * Net Id: hbd140030
 * Date : 2/17/2015 
 * Purpose :  	Class Assignment for CS 6301.001
 * Description : This module is the Technical Services layer. It will be called by the Interface layer for actions to be performed when the UI controls are used. 
 * 
 * 
 */





import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.util.Random;

public class TechServ implements ActionListener{
	
	static int time=1000;
	
	static Timer timer;
	static int movementFlag;
	public static JFrame imageFrame = new ImgFrame();
	public static int zoomlevel=1;
	static Timer timer3;
	static int flagToTime =0 ;
	static int flagtotest=0;
	static ActionEvent ae;
	static int rot=0;
	static int stopFlag=1;
	TechServ()
	{
		allControls();
		imageFrame.setVisible(true);
		
	}
	
	
	// This method will perform rotations and translate when the robot is moving according to the rotation degree given on the rotation slider.
	public static void performTranslations(int flag)
	{
		if(flag==1)
		{
			if(rot<=45)
			{
			Hardware.y=Hardware.y-10;
			Hardware.x=Hardware.x+(int)rot/5;
			
			}
			if((45<rot)&&(rot<=90))
			{
				int turn=0;
				
				if(45<rot&&rot<=50)turn=8;if(50<rot&&rot<=55)turn=7;if(55<rot&&rot<=60)turn=6;if(60<rot&&rot<=65)turn=5;if(65<rot&&rot<=70)turn=4;if(70<rot&&rot<=75)turn=3;if(75<rot&&rot<=80)turn=2;if(80<rot&&rot<=85)turn=1;if(85<rot&&rot<=90)turn=0;
				
				Hardware.x=Hardware.x+10;
				Hardware.y = Hardware.y - turn;
				
				
			}
			if((90<rot)&&(rot<=135))
			{
				int turn=0;
				
				if(90<rot&&rot<=95)turn=1;if(95<rot&&rot<=100)turn=2;if(100<rot&&rot<=105)turn=3;if(105<rot&&rot<=110)turn=4;if(110<rot&&rot<=115)turn=5;if(115<rot&&rot<=120)turn=6;if(120<rot&&rot<=125)turn=7;if(125<rot&&rot<=130)turn=8;if(130<rot&&rot<=135)turn=9;
				
				Hardware.x=Hardware.x+10;
				Hardware.y = Hardware.y + turn;
				
				
			}
			if((135<rot)&&(rot<=180))
			{
				int turn=0;
				
				if(135<rot&&rot<=140)turn=8;if(140<rot&&rot<=145)turn=7;if(145<rot&&rot<=150)turn=6;if(150<rot&&rot<=155)turn=5;if(155<rot&&rot<=160)turn=4;if(160<rot&&rot<=165)turn=3;if(165<rot&&rot<=170)turn=2;if(170<rot&&rot<=175)turn=1;if(175<rot&&rot<=180)turn=0;
				
				Hardware.x=Hardware.x-turn;
				Hardware.y = Hardware.y + 10;
				
				
			}
			if((180<rot)&&(rot<=225))
			{
				int turn=0;
				
				if(180<rot&&rot<=185)turn=1;if(185<rot&&rot<=190)turn=2;if(190<rot&&rot<=195)turn=3;if(195<rot&&rot<=200)turn=4;if(200<rot&&rot<=205)turn=5;if(205<rot&&rot<=210)turn=6;if(210<rot&&rot<=215)turn=7;if(215<rot&&rot<=220)turn=8;if(220<rot&&rot<=225)turn=9;
				
				Hardware.x=Hardware.x-turn;
				Hardware.y = Hardware.y + 10;
				
				
			}
			if((225<rot)&&(rot<=270))
			{
				int turn=0;
				
				if(225<rot&&rot<=230)turn=8;if(230<rot&&rot<=235)turn=7;if(235<rot&&rot<=240)turn=6;if(240<rot&&rot<=245)turn=5;if(245<rot&&rot<=250)turn=4;if(250<rot&&rot<=255)turn=3;if(255<rot&&rot<=260)turn=2;if(260<rot&&rot<=265)turn=1;if(265<rot&&rot<=270)turn=0;
				
				Hardware.x=Hardware.x-10;
				Hardware.y = Hardware.y + turn;
				
				
			}
			if((270<rot)&&(rot<=315))
			{
				int turn=0;
				
				if(270<rot&&rot<=275)turn=1;if(275<rot&&rot<=280)turn=2;if(280<rot&&rot<=285)turn=3;if(285<rot&&rot<=290)turn=4;if(290<rot&&rot<=295)turn=5;if(295<rot&&rot<=300)turn=6;if(300<rot&&rot<=305)turn=7;if(305<rot&&rot<=310)turn=8;if(310<rot&&rot<=315)turn=9;
				
				Hardware.x=Hardware.x-10;
				Hardware.y = Hardware.y - turn;
				
				
			}
			if((315<rot)&&(rot<=360))
			{
				int turn=0;
				
				if(315<rot&&rot<=320)turn=8;if(320<rot&&rot<=325)turn=7;if(325<rot&&rot<=330)turn=6;if(330<rot&&rot<=335)turn=5;if(335<rot&&rot<=340)turn=4;if(340<rot&&rot<=345)turn=3;if(345<rot&&rot<=350)turn=2;if(350<rot&&rot<=355)turn=1;if(355<rot&&rot<=360)turn=0;

				Hardware.x=Hardware.x-turn;
				Hardware.y = Hardware.y - 10;
				
				
			}
			if(Hardware.y<(-300)||Hardware.x<(-150)||Hardware.x>50)
			{
				Hardware.y=Hardware.y+10;
				timer3.stop();

				
			}
	        Interface.panel2.repaint();
			
		}
		else 
		{
			
			if(rot<=45)
			{
			Hardware.y=Hardware.y+10;
			Hardware.x=Hardware.x-(int)rot/5;
			}
			if((45<rot)&&(rot<=90))
			{
				int turn=0;
				
				if(45<rot&&rot<=50)turn=8;if(50<rot&&rot<=55)turn=7;if(55<rot&&rot<=60)turn=6;if(60<rot&&rot<=65)turn=5;if(65<rot&&rot<=70)turn=4;if(70<rot&&rot<=75)turn=3;if(75<rot&&rot<=80)turn=2;if(80<rot&&rot<=85)turn=1;if(85<rot&&rot<=90)turn=0;
				
				Hardware.x=Hardware.x-10;
				Hardware.y = Hardware.y + turn;
				
				
			}
			if((90<rot)&&(rot<=135))
			{
				int turn=0;
				
				if(90<rot&&rot<=95)turn=1;if(95<rot&&rot<=100)turn=2;if(100<rot&&rot<=105)turn=3;if(105<rot&&rot<=110)turn=4;if(110<rot&&rot<=115)turn=5;if(115<rot&&rot<=120)turn=6;if(120<rot&&rot<=125)turn=7;if(125<rot&&rot<=130)turn=8;if(130<rot&&rot<=135)turn=9;
				
				Hardware.x=Hardware.x-10;
				Hardware.y = Hardware.y - turn;
				
				
			}
			if((135<rot)&&(rot<=180))
			{
				int turn=0;
				
				if(135<rot&&rot<=140)turn=8;if(140<rot&&rot<=145)turn=7;if(145<rot&&rot<=150)turn=6;if(150<rot&&rot<=155)turn=5;if(155<rot&&rot<=160)turn=4;if(160<rot&&rot<=165)turn=3;if(165<rot&&rot<=170)turn=2;if(170<rot&&rot<=175)turn=1;if(175<rot&&rot<=180)turn=0;
				
				Hardware.x=Hardware.x+turn;
				Hardware.y = Hardware.y - 10;
				
				
			}
			if((180<rot)&&(rot<=225))
			{
				int turn=0;
				
				if(180<rot&&rot<=185)turn=1;if(185<rot&&rot<=190)turn=2;if(190<rot&&rot<=195)turn=3;if(195<rot&&rot<=200)turn=4;if(200<rot&&rot<=205)turn=5;if(205<rot&&rot<=210)turn=6;if(210<rot&&rot<=215)turn=7;if(215<rot&&rot<=220)turn=8;if(220<rot&&rot<=225)turn=9;
				
				Hardware.x=Hardware.x+turn;
				Hardware.y = Hardware.y - 10;
				
				
			}
			if((225<rot)&&(rot<=270))
			{
				int turn=0;
				
				if(225<rot&&rot<=230)turn=8;if(230<rot&&rot<=235)turn=7;if(235<rot&&rot<=240)turn=6;if(240<rot&&rot<=245)turn=5;if(245<rot&&rot<=250)turn=4;if(250<rot&&rot<=255)turn=3;if(255<rot&&rot<=260)turn=2;if(260<rot&&rot<=265)turn=1;if(265<rot&&rot<=270)turn=0;
				
				Hardware.x=Hardware.x+10;
				Hardware.y = Hardware.y - turn;
				
				
			}
			if((270<rot)&&(rot<=315))
			{
				int turn=0;
				
				if(270<rot&&rot<=275)turn=1;if(275<rot&&rot<=280)turn=2;if(280<rot&&rot<=285)turn=3;if(285<rot&&rot<=290)turn=4;if(290<rot&&rot<=295)turn=5;if(295<rot&&rot<=300)turn=6;if(300<rot&&rot<=305)turn=7;if(305<rot&&rot<=310)turn=8;if(310<rot&&rot<=315)turn=9;
				
				Hardware.x=Hardware.x+10;
				Hardware.y = Hardware.y + turn;
				
				
			}
			if((315<rot)&&(rot<=360))
			{
				int turn=0;
				
				if(315<rot&&rot<=320)turn=8;if(320<rot&&rot<=325)turn=7;if(325<rot&&rot<=330)turn=6;if(330<rot&&rot<=335)turn=5;if(335<rot&&rot<=340)turn=4;if(340<rot&&rot<=345)turn=3;if(345<rot&&rot<=350)turn=2;if(350<rot&&rot<=355)turn=1;if(355<rot&&rot<=360)turn=0;

				Hardware.x=Hardware.x+turn;
				Hardware.y = Hardware.y + 10;
				
				
			}
			//Hardware.y=Hardware.y+10;
			if(Hardware.y>(Hardware.height-100)||Hardware.x>50||Hardware.x<(-150)||Hardware.x>50)
			{
				Hardware.y= Hardware.y-10;		timer3.stop();

				
			}
	        Interface.panel2.repaint();
			
		}
		
	}
	
	// Resets the timer
	public static void resetTimer()
	{
		timer3.stop();
		
	}
	// Sets the timer to the general timer. 
	public static void setAction(ActionEvent e,Timer t)
	{
		ae=e;
		timer3 = t;
	}
	
	public static void allControls()
	{
		
		// When this button is pressed the robot will move in the forward direction according to the degrees given by the rotation slider
		Interface.button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				movementFlag=1;
				zoomlevel= zoomlevel+1;
		    	imageFrame.repaint();
				if(flagtotest==1)
				{
				resetTimer();
				}
				Timer timer1= new Timer(time, new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	
				        performTranslations(movementFlag);
				        setAction(e,(Timer)e.getSource());
				    }
				});
				timer1.setRepeats(true);
				timer1.setCoalesce(true);
				timer1.start();
				
				timer=timer1;
				stopFlag=0;
				
			}
		});
		
		
		// When this button is pressed the robot will move in the backward direction according to the rotation degrees given by the slider. 
		Interface.button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//timer.stop();
				

				movementFlag=0;
				
				if(flagtotest==1)
				resetTimer();
				
				 zoomlevel=zoomlevel-1;
			    	imageFrame.repaint();
				Timer timer1= new Timer(time, new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				      
				        setAction(e,(Timer)e.getSource());

				        performTranslations(movementFlag);
				    }
				});
				timer1.setRepeats(true);
				timer1.setCoalesce(true);
				timer1.start();
				
				timer=timer1;
				stopFlag=0;

			}
		});
		// When the stop button is pressed the timer is stopped and hence the robot is stopped
		Interface.stop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				stopFlag=1;
				resetTimer();
			}
			
		});
		// When the temperature button is pressed, a random number according to the room temperature is returned and displayed on the panel2
		Interface.temperature.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				Random randomGenerator = new Random();
				Hardware.temp = randomGenerator.nextInt(10);
				Interface.panel2.repaint();
				
			}
			
			
			
			
		});
		
		
		// When the slow radio button is checked, the speed is set to 1000 ms
			Interface.slowSpeed.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					if(Interface.slowSpeed.getActionCommand()=="slow")
					{
						if(stopFlag==1)
							time=1000;
						else
						{
						resetTimer();
						time=1000;
						Timer timer1= new Timer(time, new ActionListener() {
						    @Override
						    public void actionPerformed(ActionEvent e) {
						        setAction(e,(Timer)e.getSource());

						    	performTranslations(movementFlag);
						    }
						});
						timer1.setRepeats(true);
						timer1.setCoalesce(true);
						timer1.start();
						
						timer=timer1;
						}
					}
					
				}
				
				
			});
			// When the medium radio button is checked, the speed is set to 100 ms

			Interface.mediumSpeed.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					if(Interface.mediumSpeed.getActionCommand()=="medium")
					{
						if(stopFlag==1)
							time=100;
						else
						{
						resetTimer();

						time=100;
						Timer timer1= new Timer(time, new ActionListener() {
						    @Override
						    public void actionPerformed(ActionEvent e) {
						        setAction(e,(Timer)e.getSource());

						    	performTranslations(movementFlag);
						    }
						});
						timer1.setRepeats(true);
						timer1.setCoalesce(true);
						timer1.start();
						
						timer=timer1;
						}
					}
					
				}
				
				
			});
			
			// When the fast radio button is checked, the speed is set to 10 ms

			Interface.fastSpeed.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					if(Interface.fastSpeed.getActionCommand()=="fast")
					{
						if(stopFlag==1)
							time=10;
						else
						{
						resetTimer();

						time=10;
						Timer timer1= new Timer(time, new ActionListener() {
						    @Override
						    public void actionPerformed(ActionEvent e) {
						        setAction(e,(Timer)e.getSource());

						    	performTranslations(movementFlag);
						    }
						});
						timer1.setRepeats(true);
						timer1.setCoalesce(true);
						timer1.start();
						
						timer=timer1;
						}
						
					}
					
				}
				
				
			});
			
			// When the cameraon button is pressed, the ImgFrame class is called an image is displayed. 
		Interface.camera.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(Interface.camera.getActionCommand()=="CamOn")
				{
					imageFrame.setVisible(true);
					Hardware.on="On"; 
					Interface.panel2.repaint();
					
				}
				
			}
			
			
			
		});
		
		// Window for the camera image is closed when this button is pressed
		Interface.cameraoff.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(Interface.cameraoff.getActionCommand()=="CamOn")
				{
					imageFrame.setVisible(false);
					Hardware.on="Off";
					Interface.panel2.repaint();

				}
				
			}
			
			
			
		});
		// When the rotation is performed, the robot changes it's direction and the robot moves according to the given direction. Also, the arm orientation changes if the robot rotates to more than 180 degrees. 
		Interface.rotation.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e)
			{
				JSlider source = (JSlider)e.getSource();
				if (!source.getValueIsAdjusting()) {
			        int fps = (int)source.getValue();
			        Hardware.rotationdegrees =fps; Interface.panel2.repaint();
			        System.out.println(fps);
			        //Hardware.factorToRotateArm = fps;
					//Interface.panel2.repaint();
			        rot=fps;
			        if(rot<=180)
			        { Hardware.factorToRotateRoboty=rot%181;Hardware.factorToRotateRobotya=0;Hardware.leftRight=40;Hardware.leftRightArm=50;Hardware.factorToRotateArm=Hardware.factorToRotateArm;}
			        else 
			        {int mnm=rot%181;
			        	Hardware.factorToRotateRobotya=-(mnm);Hardware.leftRight=-40;Hardware.leftRightArm=-50;Hardware.factorToRotateArm=-Hardware.factorToRotateArm;
			        }
			        
			        if((rot<=90))
			        	{Hardware.factorToRotateRobotx=rot%91;Hardware.factorToRotateRobotxa=0;}
			        else if((rot<=180)&&(rot>90))
			        {
			        	Hardware.factorToRotateRobotx=90;
			        	int mnm=180-rot;
			        	Hardware.factorToRotateRobotxa=-mnm%90;
			        }
			        else if(((rot<=270)&&(rot>180)))
			        {
			        	Hardware.factorToRotateRobotxa=0;
			        	Hardware.factorToRotateRobotx =- (rot%180);
			        }
			        else if(rot>270&&rot<360)
			        {
			        	int mnm = 361-rot;Hardware.factorToRotateRobotx=-90;
			        	Hardware.factorToRotateRobotxa=mnm%91;
			        	
			        	
			        }
			        else if(rot==360)
			        {
			        	Hardware.factorToRotateRobotx=0;
			        	Hardware.factorToRotateRobotxa=0;
			        	Hardware.factorToRotateRobotya=0;
			        	Hardware.factorToRotateRoboty=0;
			        	
			        }
			        Interface.panel2.repaint();
			        //System.out.println(Hardware.factorToRotateRobotx);
			        //System.out.println(Hardware.factorToRotateRoboty);

				}
				
				
			}
		});
		
		
		// This actionlistener changes the movement of the arm of the robot. 
		Interface.armMovement.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e)
			{
				JSlider source = (JSlider)e.getSource();
				if (!source.getValueIsAdjusting()) {
			        int fps = (int)source.getValue();
			        System.out.println(fps);
			        Hardware.factorToRotateArm = fps;
			        if(rot>180)
			        Hardware.factorToRotateArmx=-fps;
			        else 
			        	Hardware.factorToRotateArmx=fps;
					Interface.panel2.repaint();

				}
				
				
			}
		});

		// This radio button opens the claws of the robot. 
		Interface.open.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				if(Hardware.openClose>0)
				{
					Timer timer1= new Timer(100, new ActionListener() {
					    @Override
					    public void actionPerformed(ActionEvent e) {
					
					    	Hardware.openClose--;
					    	if(Hardware.openClose==0)
					    	{
					    		
					    		 ((Timer) e.getSource()).stop();
					    		flagToTime = 1;
					    		
					    	}
							Interface.panel2.repaint();

					    }
					});
					timer1.setRepeats(true);
					timer1.setCoalesce(true);
					timer1.start();
					
					
				}
				
				
			}
		});
		// This radio button closes the claws of the robot.
		Interface.close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				if(Hardware.openClose<10)
				{
					
					 Timer timer1= new Timer(100, new ActionListener() {
					    @Override
					    public void actionPerformed(ActionEvent e) {
					       
					    	Hardware.openClose++;
					    	if(Hardware.openClose==10)
					    	{
					    		((Timer) e.getSource()).stop();
					    	
					    		
					    	}
							Interface.panel2.repaint();

					    }
					});
					timer1.setRepeats(true);
					timer1.setCoalesce(true);
					timer1.start();
					
					
					
					
				}
				
			}
		});
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
