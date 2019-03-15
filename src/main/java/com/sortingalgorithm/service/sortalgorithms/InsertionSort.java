package com.sortingalgorithm.service.sortalgorithms;

import org.springframework.stereotype.Component;

@Component
public class InsertionSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    private T[] insertionSort(T[] localArray) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < localArray.length; firstUnsortedIndex++) {
            T newElement = localArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && localArray[i - 1].compareTo(newElement) > 0; i--) {
                //shifting to right
                localArray[i] = localArray[i - 1];
            }
            localArray[i] = newElement;
        }
        return localArray;

    }

    @Override
    public T[] sort(T[] inputArray) {
        return insertionSort(inputArray);
    }
}