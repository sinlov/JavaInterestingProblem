package org;

/*
 * LongDivision 
 * Long divisible
 * This is numerical divisible problem involve long, dividend is the number of milliseconds in a day
 */
public class LongDivision {
	public static void main(String[] args) {
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
		System.exit(0);
		/*
		 * In this program, milliseconds and microseconds only a factor of
		 * 1000.But the output is "5" The problem is the constant MICROS_PER_DAY
		 * calculation "really" overflow. Although calculation results fit into
		 * the Long, and its space has enough, but the results do not fit in the
		 * Int. The calculation is completely Int operation carried out. The
		 * results is push to Long when the calculation after Int calculate.It
		 * was too late, that calculation has overflow.It's return a value of
		 * 200 times smaller.
		 */
	}
}
