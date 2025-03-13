package assignment6;

public class EmployeeDTO {
	private int employeeID;
	private String employeeName;
	private String emailID;
	private String phoneNumber;
	private double salary;
	private static String companyName;
	
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
		EmployeeDTO obj=new EmployeeDTO();
		companyName="XYZ";
		obj.setEmailID("madhu@gmail.com");
		obj.setEmployeeID(24);
		obj.setEmployeeName("Madhu");
		obj.setPhoneNumber("9876543210");
		System.out.println(obj.getEmployeeName());
		System.out.println(obj.getEmployeeID());
		System.out.println(companyName);
		System.out.println(obj.getEmailID());
		System.out.println(obj.getPhoneNumber());
	}

}
