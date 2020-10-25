package FinalTest;

public class Employee extends Person  {
	//The introduction is represented in Introduction Activity class
	
	private String jobTitle;
	private String company;
	
	public Employee() {
		this.company = "Unknown";
		this.jobTitle= "Unknown";  
	}
	protected void Employee(String jobTitle, String company) {
		this.jobTitle = jobTitle;
		this.company = company;
			}
	
	public String getjobTitle() {
		return jobTitle;
	}
	
	public void setjobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
}