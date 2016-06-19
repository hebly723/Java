//exam: 3.15
//show date
package cn.com.dick.threepointfifteen.Date;

import javax.swing.JOptionPane;

/**
 * @author 张钊晋
 * 
 * 2016年1月24日下午10:59:15
 */
public class DateTest {
	//method begins execution of Java application
	public static void main(String args[])
	{
		//prompt user to enter date
		int date = 
				Integer.
				parseInt(JOptionPane.showInputDialog("日期"));
		int month = 
				Integer.
				parseInt(JOptionPane.showInputDialog("月份"));
		int year = 
				Integer.
				parseInt(JOptionPane.showInputDialog("年份"));
			
		//create Date object
		Date myDate = new Date(year, month, date);
		
		//display message
		myDate.displayDate();
		
	}

}
