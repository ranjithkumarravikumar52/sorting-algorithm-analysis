package com.sortingalgorithm.util.randomization;

import java.util.Random;

public class LongDefaultRandomization implements DefaultRandomization<Long> {
	@Override
	public Long getRandomElement() {
		return new Random().nextLong();
	}
}
