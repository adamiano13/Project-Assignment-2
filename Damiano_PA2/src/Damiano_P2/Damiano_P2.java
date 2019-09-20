package Damiano_P2;

import java.util.Scanner;

public class Damiano_P2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		//BMI
		
		int units ;
		float weight, height; 
		double bmi=0;
		System.out.println("Please enter weight: ");
		weight = scnr.nextFloat();
		System.out.println("Please enter height: ");
		height = scnr.nextFloat();
		
		//options
		System.out.println("Please enter 1 for Lbs and inches or 2 for KG and meters: ");
		units = scnr.nextInt();
		switch (units)
		{
			case 1:
				bmi = (703*weight)/Math.pow(height, 2);
				break;
		
			case 2:
				bmi = (weight)/Math.pow(height, 2);
				break;
		}
		
		
		System.out.printf("Body mass index is: %.1f\n\n",bmi);
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");	
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
			

	}

}
