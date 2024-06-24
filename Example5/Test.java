package Example5;

public class Test {

	public static void main(String[] args)
	{
		AddOverload ao = new AddOverload();
		
		int add1 = ao.add(10, 20);
		int add2 = ao.add(10,20,30);
		int add3 = ao.add(10, 20, 30, 40);
		
		System.out.println(add1);
		System.out.println(add2);
		System.out.println(add3);
		

	}

}
