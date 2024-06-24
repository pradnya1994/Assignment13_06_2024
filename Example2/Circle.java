package Example2;

import java.util.Scanner;

public class Circle implements Shape
{
	public void getArea()
	{
		float circleArea;
		float pie = 3.14F;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the redius of circle : ");
		float redius = scanner.nextFloat();
		scanner.close();
		
		circleArea = (float) (pie*Math.pow(redius, 2));
		
		System.out.println("Area of circle is : " +circleArea);
		
		
	}
}
