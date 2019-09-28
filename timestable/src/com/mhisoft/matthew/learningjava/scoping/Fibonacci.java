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

import java.util.Date;

/**
 * @author Matthew Xue
 * @since 8/6/18
 */


class Fibonacci{
	public static void main(String args[])
	{
		int n1=0,n2=1,n3,i,count=25;

		System.out.println("Matthew run this @"+ new Date());

		System.out.print(n1+" "+n2);

		for(i=2;i<count;++i)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}}