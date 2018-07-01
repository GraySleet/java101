

package com.mhisoft.matthew.scoping;

/**
 * @version 1.0
 * @author Matthew Xue
 * @since 6/23/18
 */
    import java.util.*;

public class Second {
	/** Sold entry point to class and application
	 *
	 * @param args array of string arguments
	 * @return no return value
	 * @exception no exceptions thrown
	 */
	public static void main(String[] args) {
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.println("---Memory Usage:");
				Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory = "
				              + rt.totalMemory()
		+ " Free Memory = "
		+rt.freeMemory());

	}
}
