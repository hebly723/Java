//exercise 6. 2:RollGraph.java
//random shapes(20)
package cn.com.dick.six.sixteen;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 * @author 张钊晋
 * random shape
 * 2016年2月2日下午2:57:31
 */
public class RollGraph extends JPanel {
	//
	private final static int OVAL = 1,//dice to draw oval
							 RECT = 2,//dice to draw rectangle
							 BOUND = 20;//times of die
	
	public int width = getWidth(),
			   height = getHeight();
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int shapeHeight,//the height of the shape
			shapeWidth,//the width of the shape
			shapeLeft,//x axis
			shapeUnder;//y axis
		
		for (int i = 0; i < BOUND; i++) {
			//random color
			g.setColor(setColors());
			
			//random shape
			shapeWidth = rollWidth();
			shapeHeight = rollHeight();
			shapeLeft = rollLeft(shapeWidth);
			shapeUnder = rollUnder(shapeHeight);
			switch (rollShape()) {
			case OVAL:
				g.fillOval(shapeLeft, shapeUnder, shapeWidth, shapeHeight);
//				g.fillOval(100, 100, 100, 100);
				break;
			case RECT:
				g.fillRect(shapeLeft, shapeUnder, shapeWidth, shapeHeight);
//				g.fillRect(100, 100, 100, 100);
				break;
			default:
				break;
			}
			
		}
		
	}
	
	//set random colors
	public Color setColors(){
		//set colors
		Color colors = new Color(rollDice(256),rollDice(256), rollDice(256));

		return colors;
	}
	
	//roll dice to decide what shape
	public int rollShape(){
		return (1 + rollDice(2));
	}
	
	//roll width
	public int rollWidth(){
		return rollDice(getWidth()/2);
	}
	
	//roll height
	public int rollHeight(){
		return rollDice(getHeight()/2);		
	}
	
	//roll left
	public int rollLeft(int shapeWidth){
		return rollDice(getWidth()-shapeWidth);
	}
	
	//roll under
	public int rollUnder(int shapeHeight){
		return rollDice(getHeight()-shapeHeight);
	}
	
	//product random numbers
	public static int rollDice(int bound){
		int diceValue;//dice number
		
		//create random numbers
		Random randomNumbers = new Random();
	
		//die
		diceValue = randomNumbers.nextInt(bound);
		
		return diceValue;
	}

}