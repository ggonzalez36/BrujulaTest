package dto;

public class Professor extends Person {
	
	private Department department;
	
	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	


	public Professor(String name,String surname,int yearofBirth,Department d) {
		super(name,surname,yearofBirth);
		department=d;

	}

	@Override
	public String toString() {
		return "Professor{" +
				"department=" + department +
				"} " + super.toString();
	}
}
