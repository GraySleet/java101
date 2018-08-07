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

package com.mhisoft.matthew.scoping;

/**
 * @author Matthew Xue
 * @since 7/22/18
 */


public class Alphabet {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			double r = Math.random();
			char c = (char) ( r*26 + 'a');
			System.out.print(c + ": ");
			switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println("vowel");
					break;
				case 'y':
				case 'w':
					System.out.println("sometimes a vowel");
					break;
				default:
					System.out.println("consonant");
			}
		}
	}
}