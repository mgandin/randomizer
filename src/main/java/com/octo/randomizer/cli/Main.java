package com.octo.randomizer.cli;

import com.octo.randomizer.domain.Randomizer;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Randomizer randomizer = new Randomizer(3,10);
		System.out.println(randomizer.work());
	}

}
