/*William Schiesswohl
 * Mr. Kiedes Period 2
 * AP Computer Science
 * Graphics Lab 05
 */

// Lab05vst.java
// Student version of the Lab05 assignment.

import java.awt.*;
import java.applet.*;

public class GraphicsLab05 extends Applet
{
	public void init()
	{
		setSize(1000,700);
	}
	public void paint(Graphics g)
	{
		//Draws the intial box
		int width = 980;
		int height = 630;
		g.drawRect(10,10,width,height);
		
		// Draw bottom-left corner
			//first point
				int XBL = 990;
				int YBL = 640;
				int XXBL = 10;
			//second point
				int YYBL = 640;
				//drawing multiple lines
				for(int k = 0; k < 51; k++)
				{
					g.drawLine(XBL,YBL,XXBL,YYBL);
					YYBL -= 11;
					XBL -= 19;
				}
		
		// Draw bottom-right corner
			//first point
				int XBR = 10;
				int YBR = 640;
			//second point
				int XXBR = 990;
				int YYBR = 630;
			//drawing multiple lines
				for(int k = 0; k < 51; k++)
				{
					g.drawLine(XBR, YBR, XXBR, YYBR);
					XBR += 19;
					YYBR -= 11;
				}
		// Draw top-right corner
				int XTR = 10;
				int YTR = 10;
				int XXTR = 990;
				int YYTR = 10;
				for(int k = 0; k < 51; k++)
				{
					g.drawLine(XTR, YTR, XXTR, YYTR);
					XTR += 19;
					YYTR += 11;
				}
		// Draw top-left corner
				int XTL = 990;
				int YTL = 10;
				int XXTL = 10;
				int YYTL = 10;
				for(int k = 0; k < 51; k++)
				{
					g.drawLine(XTL, YTL, XXTL, YYTL);
					XTL -= 19;
					YYTL += 11;
	}
} 
}