

package com.mhisoft.matthew.learningjava;

/**
 * @author matthew
 * @since Learning b1311
 */


public class TimeTable {



	public static void main(String[] args) {


		   //normal
		for (long row = 1 ;row <=12  ; row=row+1)
		{

			long sum=0;
			for (int column = 1; column <=row; column++) {
				//1 to 9

				System.out.print(column + "X" + row + "=" + (row * column));
				System.out.print(" ");

				sum = sum+ row;
			}

			System.out.print("\n");

		}

	}
}
