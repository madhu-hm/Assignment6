
package assignment6;

public class EmployeeDTO {
	private int employeeID;
	private String employeeName;
	private String emailID;
	private String phoneNumber;
	private double salary;
	private static String companyName;
	
	public EmployeeDTO(int employeeID,String employeeName,String emailID,String phoneNumber,double salary) {
		this.setEmployeeID(employeeID);
		this.setEmployeeName(employeeName);
		this.setEmailID(emailID);
		this.setPhoneNumber(phoneNumber);
		this.setSalary(salary);
	}
	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		EmployeeDTO.companyName = companyName;
	}

	public static void main(String[] args) {
		EmployeeDTO obj=new EmployeeDTO(24,"Madhu","madhu@gmail.com","9876543210",30.700);
		companyName="XYZ";
		System.out.println(obj.getEmployeeName());
		System.out.println(obj.getEmployeeID());
		System.out.println(companyName);
		System.out.println(obj.getEmailID());
		System.out.println(obj.getPhoneNumber());
	}

}
