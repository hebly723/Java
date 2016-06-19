//Exercise 6.1:DrawToroEyes.java
//Draw toro's eyes
package cn.com.dick.six.sixteen;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.Random;

/**
 * @author 张钊晋
 * 
 * 2016年2月2日下午2:30:33
 */
public class DrawToroEyes extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		//create random number
		Random randomNumber = new Random();
		
		for (int i = 0; i <= 5; i++) {
			//draw the eyes
			Color colors = new Color(randomNumber.nextInt(256),
					randomNumber.nextInt(256), randomNumber.nextInt(256));
			g.setColor(colors);
			g.fillOval(i*width/10, i*height/10, 
					width-2*i*width/10, height-2*i*height/10);
			
		}
		
	}
	public static void main(String args[]){
		//DrawToroEyes panel = new DrawToroEyes();
		RollGraph panel = new RollGraph();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);
	}

}
