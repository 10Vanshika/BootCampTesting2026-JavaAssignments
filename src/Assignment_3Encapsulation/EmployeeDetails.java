package Assignment_3Encapsulation;
class Details {
	private int empID;
	private String name;
	private double salary;
	public void setEmpID(int id) {
			empID = id;
		}
		public void setName(String emp_name) {
			
				name= emp_name;
			}
	public void setSalary(double amount) {
		if(amount > 0) {
			salary = amount;
		}
	}
	public int  getEmpID() {
		return empID;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details emp = new Details();
		emp.setEmpID(50045823);
		emp.setName("Vanshika Gupta");
		emp.setSalary(10000);

		System.out.println(emp.getEmpID());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		

	}

}
