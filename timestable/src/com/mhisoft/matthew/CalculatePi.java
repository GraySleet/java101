

package com.mhisoft.matthew;

/**
 * @author Matthew Xue
 * @since 10/1/14
 */
   //1/4 pi = 1/3-1/5+1/7-1/9...

public class CalculatePi {

	public static void main(String[] args) {
		double pi = 0;
		 double Numerator = 1;
		int Numbers = 1000000000;
		for (int i = 1; i < Numbers; i = i+2) {
			pi += Numerator/i;
			Numerator = -Numerator;
			
		}
		System.out.println("Pi =" + pi*4);
	}


}


