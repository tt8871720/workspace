package edu.fju;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee>employees = new ArrayList<>();
		employees.add(new Employee("Jack", 25000));
		

		for (int i=0; i<=employees.size(); i++){
			   employees.get(i).print();
			}
		}
	}

