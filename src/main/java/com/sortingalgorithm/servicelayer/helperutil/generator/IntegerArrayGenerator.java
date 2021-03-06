package com.sortingalgorithm.servicelayer.helperutil.generator;

import com.sortingalgorithm.servicelayer.helperutil.randomization.IntegerDefaultRandomization;

public class IntegerArrayGenerator implements Generator<Integer> {

    @Override
    public Integer[] generateArray(int size) {
        Integer[] elements =  new Integer[size];
        for(int i = 0; i < size; i++){
            elements[i] = new IntegerDefaultRandomization().getRandomElement();
        }
        return elements;
    }

}
