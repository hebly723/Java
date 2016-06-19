package cn.com.dick.seven.twentytwo;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawRainbow extends JPanel {
	//define indigo and violet
	final Color VIOLET = new Color(128, 0, 128);
	final Color INDIGO = new Color( 75, 0, 130);
	
	//colors to use in the rainbow, starting from the innermost
	//the two white entries result in the empty arc in the center
	private Color colors[] = 
		{ Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
		  Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };
	
	//constructor
	public DrawRainbow()
	{
		setBackground(Color.WHITE);//set the background to white
	}//end draw rainbow constructor
	
	//draws a rainbow using concentric circles
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int radius = 20;//radius of an arch
		
		//draws the rainbow near the bottom-center
		int centerX = getWidth()/2;
		int centerY = getHeight() - 10;
		
		//draws filled arcs starting with the outer most
		for (int counter = colors.length; counter > 0; counter--) 
		{
			//set the color for the current arc
			g.setColor(colors[counter-1]);
			
			//fill the arc from 0 to 180 degrees
			g.fillArc(centerX - counter * radius, centerY - counter * radius,
					counter * radius *2, counter * radius *2, 0, 180);
			
		}//end for
	}//end method paintComponent

}//end class DrawRainbow
