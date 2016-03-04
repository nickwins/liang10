/*
* Exercise 1.13 from Liang v10
* Author: Nick W.
* Date: 04 Mar 2016
*
* Program Description:
* Solve the given system of 2x2 linear equations using Cramer's rule.
*/

public class Exercise_1_13 {
	public static void main(String[] args) {
		// output x value calculation
		System.out.print("x = ");
		System.out.println(((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1)));
		
		// output y value calculation
		System.out.print("y = ");
		System.out.println(((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1)));
	}
}
