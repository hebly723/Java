//exam: 3.15
//object show date
package cn.com.dick.threepointfifteen.Date;

/**
 * @author 张钊晋
 * 
 * 2016年1月24日下午10:38:21
 */
public class Date {
	private int year;//instance variable that stores year data
	private int month;//instance variable that stores month data
	private int date;//instance variable that stores date data
	
	//constructor initialize the instance variables
	public Date(int year, int month, int date)
	{
		this.year = year;//initialize the year
		this.month = month;//initialize the month
		this.date = date;//initialize the date
	}
	
	//method gets or sets variables
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	public void displayDate()
	{
		//create message
		String message =
				String.
				format("%d/%d/%d", getYear(), getMonth(), getDate());
		
		//display message
		javax.swing.JOptionPane.showMessageDialog(null, message);
	}

}
