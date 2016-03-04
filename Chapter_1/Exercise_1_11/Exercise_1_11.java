/*
* Exercise 1.11 from Liang v10
* Author: Nick W.
* Date: 04 Mar 2016
*
* Program Description:
* Using census data provided, display the US population
* for each of the next 5 years.
*
* NOTES:
* This exercise would be made VERY much easier
* with the use of variables and loops, but
* that's kinda the point, I'd guess.
*
* In order to make the code simpler and more readable,
* preliminary calculation was made to find
* 31536000 = number of seconds in 1 year.
*/

public class Exercise_1_11 {
	public static void main(String[] args) {
		// output calculation for year 1
		System.out.print("Year 1: ");
		System.out.println(312032486 + (31536000 / 7) - (31536000 / 13) + (31536000 / 45));
		
		// output calculation for year 2
		System.out.print("Year 2: ");
		System.out.println(312032486 + (2 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45))));
		
		// output calculation for year 3
		System.out.print("Year 3: ");
		System.out.println(312032486 + (3 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45))));
		
		// output calculation for year 4
		System.out.print("Year 4: ");
		System.out.println(312032486 + (4 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45))));
		
		// output calculation for year 5
		System.out.print("Year 5: ");
		System.out.println(312032486 + (5 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45))));
	}
}
