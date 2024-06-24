package Example8;

public class Programmer extends Employee
{

	public Programmer(String name, String rAddress, double salary, String jobTitle) {
		super(name, rAddress, salary, jobTitle);
		// TODO Auto-generated constructor stub
	}
	/*
	 * private String programmerName; private String programmerAddress; private
	 * double programmerSalary; private String programmerJobTitle;
	 
	
	
	public Programmer(String programmerName, String programmerAddress, double programmerSalary, String programmerJobTitle) {
		
		this.programmerName = programmerName;
		this.programmerAddress = programmerAddress;
		this.programmerSalary = programmerSalary;
		this.programmerJobTitle = programmerJobTitle;
	}
	public String getProgrammerName() {
		return programmerName;
	}
	public void setProgrammerName(String programmerName) {
		this.programmerName = programmerName;
	}
	public String getProgrammerAddress() {
		return programmerAddress;
	}
	public void setProgrammerAddress(String programmerAddress) {
		this.programmerAddress = programmerAddress;
	}
	public double getProgrammerSalary() {
		return programmerSalary;
	}
	public void setProgrammerSalary(double programmerSalary) {
		this.programmerSalary = programmerSalary;
	}
	public String getProgrammerJobTitle() {
		return programmerJobTitle;
	}
	public void setProgrammerJobTitle(String programmerJobTitle) {
		this.programmerJobTitle = programmerJobTitle;
	} }*/
	
	public double calculateBonus() {
      
		double bonus = Salary+1000;
        return bonus;
    }

    public String generatePerformanceReport() {
        
    	return "performance report is good.";
   
	
    }

}
