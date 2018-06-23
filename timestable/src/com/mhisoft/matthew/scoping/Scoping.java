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
 * @since 6/21/18
 */


public class Scoping {

	public static void main(String[] args) {
		{
			int x = 12;
			int q;
			{
			 q = 96;

				int sum = x+q;
				System.out.println("x="+ x );
				System.out.println("happy to see x+q=" +sum );
			}
			//can you print out x+q here?
			// if not how to fix the above to be able to ?
			System.out.println("oops to see x+q=" + x+q);

		}
	}


}
