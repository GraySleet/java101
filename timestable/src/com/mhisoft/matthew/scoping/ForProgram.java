

package com.mhisoft.matthew.scoping;


/**
 * @author Matthew Xue
 * @since 6/28/18
 */


public class ForProgram {
	public static void main(String[] args) {
		int i = 0;
		outer:
		while(true)  {
			prt("Outer while loop");
			while(true)  {
				i++;
				prt("i =" + i);
				if(i == 1) {
					prt("Continue");
					continue;
				}
				if(i ==3) {
					prt("continue outer");
					continue outer;
				}
				if(i == 5) {
					prt("break");
					break;
				}
				if (i == 7)  {
					prt("break outer");
					break outer;
				}
			}  //end of the while loop
			System.out.println("outside of the loop");
		}
	}
	static void prt(String s) {
		System.out.println(s);
	}
}     ///:~
