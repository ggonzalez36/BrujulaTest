package dto;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import exception.BrujulaException;

public class ActingProfessor extends Professor{
	
	

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();
	Date today=Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	
	private Date endDate;

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) throws BrujulaException {
		 if(endDate.compareTo(today) > 0) {
			 throw new BrujulaException("endDate: "+endDate.toString()+ "is higher than today: "+ today.toString());
		 }else {
			 this.endDate = endDate; 
		 }
		
	}
	
	public ActingProfessor(String name, String surname, int yearofBirth, Department d, Date endD )  throws BrujulaException{

		super(name, surname, yearofBirth, d);
		endDate=endD;
		if(endD.compareTo(today) > 0) {
			throw new BrujulaException("endDate: "+endDate.toString()+ "is higher than today: "+ today.toString());
		}else {
			endDate=endD;
		}

	}
	
	

}
