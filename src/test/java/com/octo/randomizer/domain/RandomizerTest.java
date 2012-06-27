package com.octo.randomizer.domain;

import junit.framework.Assert;

import org.junit.Test;

import com.octo.randomizer.domain.Randomizer;

public class RandomizerTest {

@Test public void shouldGiveDifferentRandom() {
		Randomizer randomizer = new Randomizer(3,10);
		Integer token = randomizer.generate();
		Assert.assertNotNull(token);
		
		Integer[] datas = randomizer.work();
		Assert.assertNotNull(datas);
		Assert.assertEquals(3,datas.length);
		Assert.assertTrue(datas[0]!=datas[1]);
		Assert.assertTrue(datas[0]!=datas[2]);
		Assert.assertTrue(datas[1]!=datas[2]);


	}
	
}
