package com.sortingalgorithm.util.randomization;

import java.util.Random;

public class ByteDefaultRandomization implements DefaultRandomization<Byte> {
	@Override
	public Byte getRandomElement() {
		return (byte)new Random().nextInt();
	}
}
