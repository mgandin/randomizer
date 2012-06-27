package com.octo.randomizer.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Randomizer {

	private static final String SEPARATOR = "\n";

	private Random random;
	
	private int howMuchRandoms;
	private int maxRange;
	
	public Randomizer(int howMuchRandoms,int maxRange) {
		this.random = new Random();
		this.howMuchRandoms = howMuchRandoms;
		this.maxRange = maxRange;
	}
	
	public Randomizer() {
		this.random = new Random();
	}

	public Integer generate() {
		return this.random.nextInt(this.maxRange);
	}
	
	public Integer[] work() {
		Map<Integer, Integer> accumul = retrievExclusiveRandomValues();
		return convertNonExclusiveValuesToArray(accumul);

	}

	private Integer[] convertNonExclusiveValuesToArray(
			Map<Integer, Integer> accumul) {
		Integer[] buffer = new Integer[accumul.values().size()];
		int i = 0;
		for (Integer token : accumul.values()) {
			buffer[i++] = token;
		}
		return buffer;
	}

	private Map<Integer, Integer> retrievExclusiveRandomValues() {
		Map<Integer,Integer> accumul = new HashMap<Integer, Integer>();
		for (int i = 0; i < howMuchRandoms; i++) {
			Integer token = this.generate();
			while(accumul.containsValue(token)) {
				token = this.generate();
			}
			accumul.put(i,token);
		}
		return accumul;
	}

}
