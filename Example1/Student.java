/*Write a Java program to declare a class called "Student" with a name and age attributes.
Create two instances of the "Student" class, set their attributes using the constructor, 
and print their name and age.*/

package Example1;

public class Student 
{
	private String studentName;
	private int studentAge;
	
	public Student()
	{
		studentName = "Pradnya";
		studentAge = 45;
	}
	
	public void getStudentetails()
	{
		System.out.println(studentName);
		System.out.println(studentAge);
	}

}
