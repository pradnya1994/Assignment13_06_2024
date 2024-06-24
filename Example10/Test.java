package Example10;

public class Test {

	public static void main(String[] args) 
	{
		Person p = new Athlete();
		p.eat();
		p.exercise();
		
		System.out.println( "-------------------");
		
		
		Person p2 = new LazyPerson();
		p2.eat();
		p2.exercise();
		
		

	}

}
