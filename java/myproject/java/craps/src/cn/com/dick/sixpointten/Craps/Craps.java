//exercise6.10: craps.java
//a craps game
package cn.com.dick.sixpointten.Craps;
import java.util.Scanner;
import java.util.Random;
/**
 * @author 张钊晋
 * craps game exercise
 * 2016年1月31日下午10:43:23
 */
public class Craps {
	//create random number generator for use in method rollDice
	private Random randomNumbers = new Random();
	
	//enumeration with constants that represent he game status
	private enum Status{ CONTINUE, WON, LOST};
	
	//constants that represent the common rolls of the dice
	private final static int SNAKE_EYES = 2,
			 TREY = 3,
			 SEVEN = 7,
			 YO_LEVEN = 11,
			 BOX_CARS = 12;
	
	//plays one game of craps
	public void play(){
		int myPoint = 0;//point if no wins or lose on first roll
		Status gameStatus;//can contain CONTINUE, WON or LOST
		
		int sumOfDice = rollDice();//first roll of the dice
		
		//determined game status and point based on first roll
		switch(sumOfDice)
		{
			case SEVEN://win with seven on first roll
			case YO_LEVEN://win with eleven on first roll
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES://lose with 2 on first roll
			case TREY://lose with 3 on first roll
			case BOX_CARS://lose with 12 on first roll
				gameStatus = Status.LOST;
				break;
			default://did not win or lose, so remember point
				gameStatus = Status.CONTINUE;//game is not over
				myPoint = sumOfDice;//remember the point
				System.out.printf("Point is %d\n", myPoint);
				break;//optional at end of switch
		
		}//end switch
		
		//while game is not completed
		while (gameStatus == Status.CONTINUE){//not WON or LOST
			sumOfDice = rollDice();//roll dice again
			
			//determined game status
			if (sumOfDice==myPoint)//win by making point
			{
				gameStatus = Status.WON;
			}
			else
				if (sumOfDice == SEVEN){//lost by rolling seven before point
					gameStatus = Status.LOST;
				}
			
		}//end while
		if (gameStatus==Status.WON)
			System.out.println("Player wins");
		else
			System.out.println("Player loses");
		
	}//end method play
	
	//roll dice, calculate sum and display results
	public int rollDice()
	{
		//pick random die values
		int die1 = 1 + randomNumbers.nextInt(6);//first die roll
		int die2 = 1 + randomNumbers.nextInt(6);//second die roll
		
		int sum = die1 + die2;//sum of die values
		
		//display results of this roll
		System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
		
		return sum;//return sum of dice
		
	}//end method rollDice

	//main method
//	public static void main(String args[])
//	{
//		int point1 = 0,//the first point
//			point2 = 0,//the second point
//			pointSum = 0,//sum of two point
//			counter = 0,//counter of rolling
//			samePoint = 0,
//			flag = 1;//flag to attention to stop input
//		
//		Random randomNumber = new Random();//random number generator
//		
//		while (flag == 1)
//		{
//			counter++;//increment the counter
//			
//			point1 = randomNumber.nextInt(6)+1;//first number
//			point2 = randomNumber.nextInt(6)+1;//second number
//			pointSum = point1 + point2;//sum of two number
//			
//			System.out.printf("Player rolled %d + %d = %d\n", point1, point2,
//					pointSum);
//			
//			//judge the situation when counter equal to 1
//			if (counter==1)
//			{
//				if (pointSum==7||pointSum==11)
//				{
//					flag = 0;//end while
//					
//					System.out.println("Player wins");//display win message
//					
//				}
//				else if (pointSum==2||pointSum==3||pointSum==12)
//				{
//					flag = 0;//end while
//					
//					System.out.println("Player loses");//display lose message
//					
//				}
//				else if (pointSum==4||pointSum==5||pointSum==6||pointSum==8||
//						pointSum==9||pointSum==10)
//				{
//					flag = 1;//continue while
//					
//					//display point
//					System.out.printf("point is %d\n", pointSum);
//					
//					samePoint = pointSum;//memory the point
//					
//				}
//				else
//				{
//					//display error message
//					System.out.printf("Error %d", pointSum);
//					
//					System.exit(0);
//					
//				}
//				
//			}
//			else if (counter>1)
//			{
//				if (pointSum != samePoint&&pointSum != 7)
//				{
//					flag = 1;//continue while
//					
//				}
//				else if (pointSum == 7)
//				{
//					flag = 0;//end while
//					
//					System.out.println("Player loses");//display lose message
//					
//				}
//				else if (pointSum == samePoint)
//				{
//					flag = 0;//end while
//					
//					System.out.println("Player wins");//display win message
//					
//				}
//				
//			}
//			else
//			{
//				//display error message
//				System.out.printf("Error %d counter", counter);
//				
//				System.exit(0);
//			}
//			
//		}
//		
//	}
//
}
