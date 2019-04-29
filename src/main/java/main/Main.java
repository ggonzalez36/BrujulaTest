package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.joda.time.LocalTime;
import dto.Professor;
import exception.BrujulaException;
import dto.ActingProfessor;
import dto.AssociateProfessor;
import dto.Department;
import dto.Person;

public class Main {
	
	public static void main(String[] args) throws ParseException, BrujulaException {
		
		
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Department dp1=new Department();
		dp1.setDepartmentName("ingenieria");
		Professor p1= new AssociateProfessor("Andres", "Gonzalez", 1980, dp1, format.parse ( "2009-12-31" ) );	
		Professor p2= new AssociateProfessor("Andres", "Espinosa", 1980, dp1, format.parse ( "2009-12-31" ) );
		Professor p3= new AssociateProfessor("Carlos", "Arjona", 1980, dp1, format.parse ( "2009-12-31" ) );

		System.out.println(p1.getCompleteName());
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
		ArrayList<Professor> lprofessors= new ArrayList<Professor>();
		dp1.setListProfessors(lprofessors);
		dp1.addProfessor(lprofessors, p1);
		dp1.addProfessor(lprofessors, p2);
		dp1.addProfessor(lprofessors, p3);
		
		
		lprofessors.forEach(System.out::println);

		dp1.list(lprofessors);

		lprofessors.forEach(System.out::println);


		Professor p5= new ActingProfessor("Andres", "Gonzalez", 1980, dp1, format.parse ( "2020-12-31" ) );








	
		
		
		
	}
}
