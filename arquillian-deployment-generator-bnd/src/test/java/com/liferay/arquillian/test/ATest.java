/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.arquillian.test;

import com.liferay.arquillian.test.extras.a.A;
import com.liferay.arquillian.test.extras.b.B;

import org.osgi.framework.BundleException;

/**
 * @author Carlos Sierra Andrés
 */
public class ATest {

	public void testSomething() throws BundleException {
		A a = new A();
		B b = new B();

		if (1 == 1) {
			throw new BundleException("test");
		}
	}

}