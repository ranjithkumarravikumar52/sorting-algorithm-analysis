package com.sortingalgorithm.servicelayer.helperutil.randomization;

import java.util.Random;

public class ShortDefaultRandomization implements DefaultRandomization<Short> {
	@Override
	public Short getRandomElement() {
		return (short) new Random().nextInt();
	}
}
