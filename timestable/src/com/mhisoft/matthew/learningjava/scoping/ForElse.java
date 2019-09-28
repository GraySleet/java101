

package com.mhisoft.matthew.learningjava.scoping;

/**
 * @author Matthew Xue
 * @since 7/12/18
 */


public class ForElse {
	public static void main(String[] args) {

		for (int i = 0; i <= 15; i++) {
			System.out.println("The number is " + i);
			if (i < 10)
				System.out.println("Wrong Number, too small");
			else System.out.println("Right Number, big");

		}

		System.out.println(Math.max(
				Math.pow(10, 3), Math.pow(2, 10)
		)
		);

	}

}