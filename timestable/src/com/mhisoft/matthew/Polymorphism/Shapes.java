/* -----------------------------------------------------------------------------
 * Copyright (c) 2010 Plateau Systems, Ltd.
 *
 * This software and documentation is the confidential and proprietary
 * information of Plateau Systems.  Plateau Systems
 * makes no representation or warranties about the suitability of the
 * software, either expressed or implied.  It is subject to change
 * without notice.
 *
 * U.S. and international copyright laws protect this material.  No part
 * of this material may be reproduced, published, disclosed, or
 * transmitted in any form or by any means, in whole or in part, without
 * the prior written permission of Plateau Systems.
 * -----------------------------------------------------------------------------
 */

package com.mhisoft.matthew.polymorphism;

/**
 * @auther Tony Xue
 * @since TMS 6.4.1
 */
public class Shapes {
	public static Shape randShape() {
		switch ((int) (Math.random() * 3)) {
			default:
			case 0:
				return new Circle();
			case 1:
				return new Square();
			case 2:
				return new Triangle();
		}
	}


public 	static void main(String[] args) {
		Shape[] s = new Shape[9];
		for (int i = 0; i < s.length; i++)
			s[i] = randShape();
		for (int i = 0; i < s.length; i++) {
			s[i].draw(i+1);
		}
	}

}
