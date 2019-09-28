/* -----------------------------------------------------------------------------
* Copyright (c) 2013 SuccessFactors, all rights reserved.
*
* This software and documentation is the confidential and proprietary
* information of SuccessFactors.  SuccessFactors makes no representation 
 * or warranties about the suitability of the software, either expressed or 
 * implied.  It is subject to change without notice.
*
* U.S. and international copyright laws protect this material.  No part
* of this material may be reproduced, published, disclosed, or
* transmitted in any form or by any means, in whole or in part, without
* the prior written permission of SuccessFactors.
* -----------------------------------------------------------------------------
*/

package com.mhisoft.matthew.learningjava.scoping;

/**
 * @author Matthew Xue
 * @since 7/22/18
 */


public class PrintPrime {
	public static void main(String[] args) {
		for (int i = 2; i <= 10000; i++) {
			if (isPrime(i))
				System.out.print(i + " ");

		}
	}

	static boolean isPrime(int num) {
		for (int i = 2; i <= num - 1; i++) {
			double x = num / i;
			int y = (int) x;
			if (y * i == num) {
				//evenly divisible need to continyue test next i.
				return false;
			}
		}

		return true;


	}
}
