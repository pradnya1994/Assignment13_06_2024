package Example2;

import java.util.Scanner;

public class Rectangle implements Shape
{
	
	
	public void getArea()
	{
		float rectangleArea,length,width;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of length of rectangle : -");
		length = sc.nextFloat();
		
		System.out.println("Enter the value of width of rectangle : -");
		width = sc.nextFloat();
		
		rectangleArea = (length*width);
		System.out.println("Rectangle area is - " +rectangleArea);
		
		
	}

}
