package dto;

import java.util.Date;

public class AssociateProfessor extends Professor {
	
	

	private Date startDate;
	
	
	

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public AssociateProfessor(String name, String surname, int yearofBirth, Department d, Date starD) {
		super(name, surname, yearofBirth, d);
		startDate=starD;
	}
	

}
