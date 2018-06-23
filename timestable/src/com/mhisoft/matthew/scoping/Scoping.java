
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
			System.out.println("oops to see x+q=" + (x+q));

		}
	}


}
