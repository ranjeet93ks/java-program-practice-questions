package com.top.program.questions.others;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaExpFIExample1 {

	public static void main(String[] args) {
		List<Employee> listE = new ArrayList<>();
		listE.add(new Employee(5, "Rohan", 2000));
		listE.add(new Employee(1, "Ayush", 3000));
		listE.add(new Employee(3, "Ranjeet", 1000));
		listE.add(new Employee(4, "Shubham", 7000));
		listE.add(new Employee(2, "Aryan", 9000));

		System.out.println("before sorting -->");
		System.out.println(listE);

		// Collections.sort(listE); //compile error

		System.out.println("after sorting -->");
		// Collections.sort(listE, new NameDescComparator()); //solution 1
		// System.out.println(listE);

//		Collections.sort(listE, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o2.getEmpName().compareTo(o1.getEmpName());
//			}
//		}); // solution 2
//		System.out.println(listE);

//		Collections.sort(listE, (o1, o2) -> {
//			return o2.getEmpName().compareTo(o1.getEmpName());
//		}); // solution 3
//		System.out.println(listE);

		listE = listE.stream().sorted((o1, o2) -> o2.getEmpName().compareTo(o1.getEmpName()))
				.collect(Collectors.toList());// solution 4
		// listE= listE.stream -- here mandatory
		System.out.println(listE);

		// all four solutions will give same result

	}

}

class NameDescComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getEmpName().compareTo(o1.getEmpName());
	}

}

class Employee {
	int empId;
	String empName;
	long salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Employee(int empId, String empName, long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

}
