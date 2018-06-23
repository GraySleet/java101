

package com.mhisoft.matthew.scoping;

/**
 * @author Matthew Xue
 * @since 6/23/18
 */
    import java.util.*;

public class Second {
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
