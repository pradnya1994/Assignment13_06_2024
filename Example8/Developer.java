package Example8;

public class Developer extends Employee
{
	/*
	 * private String developerName; private String developerAddress; private double
	 * developerSalary; private String developerJobTitle;
	 * 
	 * 
	 * public Developer(String developerName, String developerAddress, double
	 * developerSalary, String developerJobTitle) {
	 * 
	 * this.developerName = developerName; this.developerAddress = developerAddress;
	 * this.developerSalary = developerSalary; this.developerJobTitle =
	 * developerJobTitle; } public String getDeveloperName() { return developerName;
	 * } public void setDeveloperName(String developerName) { this.developerName =
	 * developerName; } public String getDeveloperAddress() { return
	 * developerAddress; } public void setDeveloperAddress(String developerAddress)
	 * { this.developerAddress = developerAddress; } public double
	 * getDeveloperSalary() { return developerSalary; } public void
	 * setDeveloperSalary(double developerSalary) { this.developerSalary =
	 * developerSalary; } public String getDeveloperJobTitle() { return
	 * developerJobTitle; } public void setDeveloperJobTitle(String
	 * developerJobTitle) { this.developerJobTitle = developerJobTitle; }
	 */
	
	
	public double calculateBonus() {
       
		double bonus = Salary+1000;
        return bonus;
    }

    public Developer(String name, String rAddress, double salary, String jobTitle) {
		super(name, rAddress, salary, jobTitle);
		// TODO Auto-generated constructor stub
	}

	public String generatePerformanceReport() {
       
    	return "performance report is good.";
    }

}
