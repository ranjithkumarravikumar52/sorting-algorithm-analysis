package com.sortingalgorithm.servicelayer.helperutil.randomization;

import java.util.Random;

public class DoubleDefaultRandomization implements DefaultRandomization<Double> {
	@Override
	public Double getRandomElement() {
		return new Random().nextDouble();
	}
}
