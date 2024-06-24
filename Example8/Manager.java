package Example8;

public class Manager extends Employee
{
	/*
	 * private String managerName; private String managerAddress; private double
	 * managerSalary; private String managerJobTitle;
	 * 
	 * 
	 * 
	 * public Manager(String managerName, String managerAddress, double
	 * managerSalary, String managerJobTitle) { this.managerName = managerName;
	 * this.managerAddress = managerAddress; this.managerSalary = managerSalary;
	 * this.managerJobTitle = managerJobTitle; } public String getManagerName() {
	 * return managerName; } public void setManagerName(String managerName) {
	 * this.managerName = managerName; } public String getManagerAddress() { return
	 * managerAddress; } public void setManagerAddress(String managerAddress) {
	 * this.managerAddress = managerAddress; } public double getManagerSalary() {
	 * return managerSalary; } public void setManagerSalary(double managerSalary) {
	 * this.managerSalary = managerSalary; } public String getManagerJobTitle() {
	 * return managerJobTitle; } public void setManagerJobTitle(String
	 * managerJobTitle) { this.managerJobTitle = managerJobTitle; }
	 *  */
	
	public Manager(String name, String rAddress, double salary, String jobTitle) {
		super(name, rAddress, salary, jobTitle);
		// TODO Auto-generated constructor stub
	}

	  @Override public double calculateBonus() {
	  
	  double bonus = Salary+1000; return bonus; }
	
	
	
	@Override
    public String generatePerformanceReport() {
		return "performance report is good.";
    }
	
	
	/*
	 * public void manageProject() { // Custom method for managing projects
	 * System.out.println("Manager " + getManagerName() +
	 * " is managing a project."); }
	 */

}
