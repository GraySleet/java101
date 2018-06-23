

package com.mhisoft.matthew;

/**
 * @author Matthew Xue
 * @since 9/29/14
 */


public class FactorialCalculations {

	public static final int N = 1000;

	public static void main(String[] args) {

		double product = 1;


		for (double i = 1; i <= N; i++) {
			System.out.println("i=" + i);
			product = product * i;

		}
		System.out.println("product="+ product ) ;





	}
}








