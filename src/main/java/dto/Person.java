package dto;

import java.util.Calendar;

public  abstract class  Person {
	
	private String name;
	private  String surname;
	private int yearofBirth;
	private int year = Calendar.getInstance().get(Calendar.YEAR);
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getYearofBrith() {
		return yearofBirth;
	}
	public void setYearofBrith(int yearofBrith) {
		this.yearofBirth = yearofBrith;
	}
	
	public String getCompleteName() {
		return surname+name;
	}
	
	
	public int getAge() {
		
		return  year-yearofBirth;
	}
	
	
	public Person(String name, String surname, int yearofBirth) {
		super();
		this.name = name;
		this.surname = surname;
		this.yearofBirth = yearofBirth;
	
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", yearofBirth=" + yearofBirth +
				", year=" + year +
				'}';
	}
}
