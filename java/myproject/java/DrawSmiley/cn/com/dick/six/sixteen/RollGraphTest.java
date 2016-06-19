package cn.com.dick.six.sixteen;
import javax.swing.JFrame;
public class RollGraphTest {

	public static void main(String[] args) {
		RollGraph panel = new RollGraph();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(RollGraph.rollDice(600),300);
		application.setVisible(true);

	}

}
