package Example6;

import java.util.Scanner;

public class Circle extends Shape
{
	
	Scanner scanner = new Scanner(System.in);
	double radius = scanner.nextDouble();
	

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return (Math.PI*Math.pow(radius, 2));
    }

}
