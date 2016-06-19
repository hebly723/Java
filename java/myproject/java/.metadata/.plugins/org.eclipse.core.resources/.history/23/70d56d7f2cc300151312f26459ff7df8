//Fig. 4.20: DrawPanelTest.java
//Application to display a DrawPanel
package cn.com.dick.four;
import javax.swing.JFrame;
/**
 * @author 张钊晋
 * 
 * 2016年1月25日下午12:56:13
 */
public class DrawPanelTest {

	public static void main(String[] args) {
		
		int number = 
				Integer.
				parseInt(javax.swing.JOptionPane.
						showInputDialog("  "));
		// create a panel that contains our drawing
		DrawPanel panel = new DrawPanel(number);
		
		//create a new frame to  hold the panel
		JFrame application = new JFrame();
		
		//set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);//add the panel to the frame
		application.setSize(500, 500);//set the size of the frame
		application.setVisible(true);//make the frame visible

	}//end main

}//end class DrawPanelTest
