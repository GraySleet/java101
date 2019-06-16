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

import java.util.Random;

/**
 * @author Matthew Xue
 * @since 8/13/18
 */


class BubbleArray {
	//
	void bubbleArraySort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int z = 0; z < n - i - 1; z++)
				if (arr[z] > arr[z + 1]) {

					int temp = arr[z];
					arr[z] = arr[z + 1];
					arr[z + 1] = temp;
				}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		BubbleArray ob = new BubbleArray();
		int arr[] = new int[100];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			int randomNum = rand.nextInt((100 - 1) + 1) + 1; //generate a random number
			arr[i] =randomNum; //assign random number
		}


		System.out.println("Array before sort");
		ob.printArray(arr);
		ob.bubbleArraySort(arr);
		System.out.println("Array after sort");
		ob.printArray(arr);



	}

}
