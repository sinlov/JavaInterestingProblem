package org;

import java.math.BigDecimal;

/*
 * Change -the change time
 * When java calculation the amount of certain use Int or Long, avid using Float and Double types.
 */
public class Change {

	public static void main(String[] args) {
		// System.out.println(2.00-1.10);
		// this output is 0.8999999999999999
		// System.out.printf("%.2f%n",2.00-1.10);
		// This is precision printing Settings while the output of 0.90, but there isn't no guarantee that the output.
		// System.out.println((200-110)+"cents");
		// Recommend the use of type Int to compute, and of course this isn't the best.
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal(
				"1.10")));
		//
		/* This is precisely the decimal calculation, at the same time pay attention to, must use BigDecimal(String) constructor, don't use BigDecimal(double), otherwise there will be a "precision value" lead to the output error.
		 * Warning, Java does not provide a linguistic BigDecimal, but you can reference it.
		 */
	}

}
