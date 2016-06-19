//Fig 7. 4:InitArray.java
//Calculating values to be placed into elements of an array
package cn.com.dick.seven.four;

/**
 * @author 张钊晋
 * 
 * 2016年2月4日下午9:19:24
 */
public class BarChart {

	public static void main(String[] args) {
		int array[] = { 0, 3, 0, 0, 0, 0, 1, 2, 4, 2, 1};
		
		System.out.println("Grade distribution: ");//prompt for input
		
		//for each array element, output the bar of the chart
		for (int counter = 0; counter < array.length; counter++) 
		{
			//output bar label( "00~09: ", ..., "90~99: ", "100: " )
			if (counter==10) 
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%2d-%2d: ", counter*10, counter*10 + 9);
			
			//print bar of asterisks
			for (int stars = 0; stars < array[counter]; stars++) 
			{
				System.out.print("*");
				
			}
			
			System.out.println();//start a new line of output
			
		}//end outer for

	}//end main

}//end class BarChart
