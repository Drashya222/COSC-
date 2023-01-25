package COSC;

import java.util.*;

public class Playingwithjava {
	private static Scanner input = new Scanner(System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String your_name;
		 int student_id;
		 int year;
		 int no_of_courses;
		 
		 System.out.println("Please enter your Yourname");
		 your_name = input.nextLine();
		 
		 System.out.println("Please enter the Student Id");
		 student_id= input.nextInt();
		 
		 System.out.println("Please enter the Year");
		 year = input.nextInt();
		 
		 System.out.println("Please enter the number of courses you are enrolled in ");
		 no_of_courses = input.nextInt();
		 
		 System.out.println(your_name);
		 System.out.println(student_id);
		 System.out.println(year);
		 System.out.println(no_of_courses);
		 
		 
		 	
	}

}
