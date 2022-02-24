package assignmentOnString;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Part 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of cities you want to enter.");
		int i = sc.nextInt();
		String[] cityName = new String[i];
		for (i = 0; i < cityName.length; i++) {
			System.out.println("Please enter the name of city " + (i + 1) + ": ");
			cityName[i] = sc.next();
		}
		// Part 2
		System.out.println("Please enter the city that you want to find.");
		String cityToBeFound = sc.next();
		int count = 0;
		boolean isCityFound = false;
		for (i = 0; i < cityName.length; i++) {
			if (cityName[i].equalsIgnoreCase(cityToBeFound)) {
				count++;
				isCityFound = true;
			}
		}
		String cityFound = isCityFound ? "City is found " + count + " times in the list."
				: "City not found in the list";
		System.out.println(cityFound);
		
		//Part 3

		System.out.println("Replacing the city names starting with T to Mississauga");
		for (i=0;i<cityName.length;i++) {
			if(cityName[i].startsWith("T")) {
				cityName[i] = "Mississauga";
			}
		}
		
		for (i=0;i<cityName.length;i++) {
			System.out.println("City "+(i+1)+": "+cityName[i]);
		}
		sc.close();
	
	}

}
