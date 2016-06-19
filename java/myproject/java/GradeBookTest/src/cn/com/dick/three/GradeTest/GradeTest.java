package cn.com.dick.three.GradeTest;
import java.util.Scanner;;
//Fig.3.8:GradeTest.java
//Create and manipulate a Grade object
/**
 * @author 张钊晋
 * 
 * 2016年1月23日上午10:38:35
 */
public class GradeTest {
//main method begins program execution 
	public static void main(String[] args) {
		// create scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		//create a Grade object and assign it to MyGradeBook
		Grade myGradeBook = new Grade("Java programming", "郭勇");
		
		//display initial value of courseName
		System.out.printf("Initial course name is %s\n, prensented by %s \n ", 
				myGradeBook.getCourseName(), myGradeBook.getTeacherName());
		
		//prompt for and read course name
		System.out.println("Please enter the course name:");
		String theName = input.nextLine();//read a line of text
		myGradeBook.setCourseName(theName);//set the course name
		System.out.println();//outputs a blank line
		
		//prompt for and read teacher name
		System.out.println("Please enter the teacher name:");
		String theTeacher = input.nextLine();//read a line of text
		myGradeBook.setTeacherName(theTeacher);//set the teacher name
		System.out.println();//outputs a blank line
		
		//display welcome message after specifying course name 
		//and specifying teacher name 
		myGradeBook.displayMessage();

	}//end main

}//end class GradeTest
