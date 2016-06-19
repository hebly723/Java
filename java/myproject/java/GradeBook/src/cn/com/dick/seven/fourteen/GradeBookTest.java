//Fig. 7.15: GradeBookTest.java
//Creates GradeBook object using an array of grades.
package cn.com.dick.seven.fourteen;

public class GradeBookTest {

	public static void main(String[] args) {
		//array of student grades
		int gradesArray[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		
		GradeBook myGradeBook = new GradeBook(
				"CS101 Introdution to Java Programming", gradesArray);
		myGradeBook.displayMessage();
		myGradeBook.processGrades();

	}//end main

}//end class GradeBookTest
