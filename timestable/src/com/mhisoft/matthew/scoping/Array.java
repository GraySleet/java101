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
 * @since 8/9/18
 */


public class Array {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int [] a2;
		a2 = a1;
		for (int i = 0; i < a2.length; i++)
			a2[i]++;
			for (int i = 0; i < a1.length; i++)  {
				System.out.print("al[" + i + "]=" + a1[i]);
				System.out.println(", a2[" + i + "]=" + a2[i]);
			}
		}
		static void prt(String s) {
			System.out.println(s);







	}
}
