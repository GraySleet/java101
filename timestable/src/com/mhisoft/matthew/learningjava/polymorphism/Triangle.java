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

package com.mhisoft.matthew.learningjava.polymorphism;

/**
 * @auther Tony Xue
 * @since TMS 6.4.1
 */


public class Triangle extends Shape {
	void draw(int i) {
		System.out.println( i+ ":  Triangle.draw()");
	}

	void erase(int i) {
		System.out.println( i+ ":  Triangle.erase()");
	}
}
