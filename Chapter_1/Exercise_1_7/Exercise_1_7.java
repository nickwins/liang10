/*
* Exercise 1.7 from Liang v10
* Author: Nick W.
* Date: 04 Mar 2016
*/

public class Exercise_1_7 {
	public static void main(String[] args) {
		// output calculation using parens
		// to ensure proper order of operations
		// also, per assignment instructions,
		// use 1.0 instead of 1 to avoid int division
		System.out.println(4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		System.out.println(4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13)));
	}
}
