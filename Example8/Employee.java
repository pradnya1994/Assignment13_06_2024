package Example8;
/*Write a Java program that creates a class hierarchy for employees of a company. 
  The base class should be Employee, with subclasses Manager, Developer, and Programmer. 
  Each subclass should have properties such as name, address, salary, and job title.
  Implement methods for calculating bonuses, generating performance reports, and managing projects.*/
public class Employee
{
	/*
	 * private double Salary;
	 * 
	 * 
	 * 
	 * public double getSalary() { return Salary; }
	 * 
	 * public void setSalary(double salary) { Salary = salary; }
	 */
	
	protected String Name;
	protected String rAddress;
	protected double Salary;
	protected String JobTitle;
	
	
	

	public Employee(String name, String rAddress, double salary, String jobTitle) {
		super();
		Name = name;
		this.rAddress = rAddress;
		Salary = salary;
		JobTitle = jobTitle;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getrAddress() {
		return rAddress;
	}

	public void setrAddress(String rAddress) {
		this.rAddress = rAddress;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

	
	public double calculateBonus() {
       
		double bonus = Salary+1000;
        return bonus;
    }

    public String generatePerformanceReport() 
    {
        return "performance report is good.";
    }
	
}
