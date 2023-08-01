package hw;

import java.util.ArrayList;

public class HWDemo {

	public static void main(String[] args) {
		System.out.println("HW");
	}

	public static void firstMethod() {
		System.out.println("Hello Team, have a good week");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
		System.out.println("zainab");

	}

	public void div(int a, int b) {
		System.out.println(a / b);
		System.out.println("zainab alqazzaz");

	}

	public static void getName() {
		System.out.println("My Name:Shahad Aldoori");
	}

	public static void PersonalInfo() {

		String Name = "Sami";
		String Address = "USA";
		int ZipCode = 200000000;
		System.out.println("Name: " + Name);
		System.out.println("Home Address: " + Address);
		System.out.println("Home ZipCode: " + ZipCode);
	}

	public static void staffDatabase() {
		String name = "Sami";
		String position = "Regional Director";
		double salary = 25000;
		int id = 5697;
		System.out.println("Staff Name: " + name);
		System.out.println("Staff Position: " + position);
		System.out.println("Staff Salary: " + salary);
		System.out.println("Staff ID: " + id);

	}

	public void getStudents() {

		String student1 = "John";
		String student2 = "Sebastian";
		String student3 = "Antonio";

	}

	public void languages() {

		String course1 = "English";
		String course2 = "Spanish";
		String course3 = "Italian";
		String course4 = "Chinese";

	}

	/**
	 * 
	 * @param studentList
	 * @param name
	 * @return true if name is in the studentList, otherwise return false
	 */
	public boolean isStudentListed(ArrayList<String> studentList, String name) {

		for (String student : studentList) {
			if (student.equals(name)) {
				return true;
			}
		}
		return false;
	}
	public int countStudent( String studentName) {
		
			int result=0;	
		if(studentName.charAt(0)=='A') {
			
	result++;
		}
	return result;
	}

	}

