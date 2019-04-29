package dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

import exception.BrujulaException;

public class Department {

	private String departmentName;
	
	private ArrayList<Professor> listProfessors;
	
	

	public ArrayList<Professor> getListProfessors() {
		return listProfessors;
	}

	public void setListProfessors(ArrayList<Professor> listProfessors) {
		this.listProfessors = listProfessors;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public List<Professor>  list(ArrayList<Professor> listProfessors) {
		
		listProfessors.sort(Comparator.comparing(Professor-> Professor.getSurname()));
		return listProfessors;
	}
	

	public List<Professor> addProfessor(ArrayList<Professor> listProfessors, Professor professor ) throws BrujulaException  {

		for(Professor p:listProfessors){
			if(p.getCompleteName().equals(professor.getCompleteName())) {
				throw new BrujulaException("The professor:  "+ professor.getCompleteName()+ " is already in the list");

			}
		}

		if( departmentName.equals(professor.getDepartment().getDepartmentName())) {
			
			listProfessors.add(professor);
		}
		else {
			 throw new BrujulaException("department"+professor.getDepartment().getDepartmentName() +"is different than department name: "+departmentName);
			
		}
		
		
		
		return listProfessors;
		
		
	
		
	}
	
	
}
