package cn.com.dick.seven.one;
import javax.swing.JFrame;
public class DrawLineTest {

	public static void main(String[] args) {
		DrawLine panel = new DrawLine();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);

	}

}
