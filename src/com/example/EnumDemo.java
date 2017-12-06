package com.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

import com.example.Employee.DEPT;

/**
 * @author sid
 *
 */
public class EnumDemo {

	private Employee employee;

	public static void main(String[] args) {

		String fileName = "test.txt";

		// starting to read files
		FileUtility.startFileReading(fileName);

		while (true) {
			processWork();
		}

	}

	private static void processWork() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee name : ");
		String name = scanner.nextLine();

		if (name.isEmpty()) {
			System.out.println("Exit application");
			System.exit(0);
		}

		System.out.println("Enter Employee id : ");
		int id = Integer.parseInt(scanner.nextLine());

		System.out.println("Enter Employee department");
		String dept = scanner.nextLine();

		EnumDemo enumDemo = new EnumDemo();
		enumDemo.setEmployee(id, name, dept);

		System.out.println(" ****** EMPLOYEE ***** ");
		Employee employee = enumDemo.getEmployee();
		System.out.println(employee);

	}

	/**
	 * Set Employee {@code employee} with the id {@code id}, name {@code name}
	 * and department {@code dept}
	 * 
	 * @param id
	 *            Set the id
	 * @param name
	 *            Set the name
	 * @param dept
	 *            Set the dept name
	 */
	private void setEmployee(int id, String name, String dept) {
		employee = new Employee();

		employee.setId(id);
		employee.setName(name);

		if (dept.equalsIgnoreCase(DEPT.FINANCE.getDeptName()))
			employee.setDept(DEPT.FINANCE);
		else if (dept.equalsIgnoreCase(DEPT.IT.getDeptName()))
			employee.setDept(DEPT.IT);
		else if (dept.equalsIgnoreCase(DEPT.HR.getDeptName()))
			employee.setDept(DEPT.HR);
	}

	/**
	 * @return return the Employee
	 */
	private Employee getEmployee() {
		return employee;
	}

}
