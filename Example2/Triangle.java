package Example2;

import java.util.Scanner;

public class Triangle implements Shape
{
	public void getArea()
	{
		float triangleArea,base,height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of base of triangle : -");
		base = sc.nextFloat();
		
		System.out.println("Enter the value of height of triangle : -");
		height = sc.nextFloat();
		
		triangleArea = 1/2*(base*height);
		System.out.println("Triangle area is - " +triangleArea);
		
		
	}

}
