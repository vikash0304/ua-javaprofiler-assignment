package uajavaprofilerassignment.task;

import java.util.ArrayList;
import java.util.List;

public class AssignmentApplication {

	public static void main(String[] args) {
		
		System.out.print("Demo Application for VisualVM\n---------------------------------------------\n");
		System.out.println("Start::");
		
		List<Employee> employees = new ArrayList<>();
		for(int i=0; i<=100070; i++) {
			employees.add(new Employee());
		}
		System.out.println("Ended..");
	}

}
