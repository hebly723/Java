package cn.com.dick.square;
import javax.swing.JOptionPane;
public class Square {
	//private double radio;
	
	public void determineVolume()
	{
		double radius  =  Double.parseDouble(
				JOptionPane.showInputDialog("输入半径"));
		
		JOptionPane.showMessageDialog(null, "面积为" + sphereVolume(radius));
	}
	
	public double sphereVolume(double radio)
	{
		//calculate the volume
		double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radio, 3 ) ;
		
		return volume;
	}

}
