package Example8;

public class Test 
{
	public static void main(String[] args) 
	{
		Manager manager = new Manager("Pradnya Varade", "Pune", 8000000.0, "Manager");
        Developer developer = new Developer("Mukund Varade", "Pune", 720000.0, "Developer");
        Programmer programmer = new Programmer("Raghav Varade", "Pune", 700000-.0, "Programmer");

        System.out.println("Manager's Bonus: $" + manager.calculateBonus());
        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());

        System.out.println(manager.generatePerformanceReport());
        System.out.println(developer.generatePerformanceReport());
        System.out.println(programmer.generatePerformanceReport());
		
	}

}
