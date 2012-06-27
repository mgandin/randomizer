package com.octo.randomizer.controller;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.octo.randomizer.domain.Randoom;

public class RandomControllerTest {
	private RandomController controller;
	
	@Before public void before() {
		this.controller = new RandomController();
	}
	
	@Test public void shouldReturnRandomValues() {
		Randoom random = this.controller.getRandomInJson("10","3");
		Assert.assertEquals(new Integer(3),random.getNumber());
		Assert.assertEquals(3,random.getSeries().length);
	}
}
