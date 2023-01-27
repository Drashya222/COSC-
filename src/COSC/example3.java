package COSC;

import java.util.*;

public class example3 {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fahrenheit;
		double celsius;
		
		System.out.println("Enter Fahrenheit temperature");
		fahrenheit = input.nextDouble();
		
		celsius = (fahrenheit - 32) * 5/9;
		
		System.out.println(Double.toString(fahrenheit) + " fahrenheit is " + celsius + " Celsius ");
		
	}

}

// Thanks Drashya
