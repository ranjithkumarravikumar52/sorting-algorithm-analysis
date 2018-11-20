/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomdatarange;

import util.SwapElements;
import util.metric.TimeMetric;

public class SelectionSort extends RandomDataRangeSortAlgorithm  {


    private int[] selectionSort(int[] inputArray) {
        int[] localArray = new int[inputArray.length];
        System.arraycopy(inputArray, 0, localArray, 0, localArray.length);
        for (int lastUnsortedIndex = localArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int maxIndex = 0;
            for (int arrayIndex = 1; arrayIndex <= lastUnsortedIndex; arrayIndex++) {
                if (localArray[arrayIndex] > localArray[maxIndex]) {
                    maxIndex = arrayIndex;
                }
            }
            SwapElements.swap(localArray, lastUnsortedIndex, maxIndex);
        }
        return localArray;
    }

    @Override
    public int[] sort(int[] inputArray) {
        this.setInputArray(inputArray);
        TimeMetric timeMetric = new TimeMetric();
        timeMetric.startTime();
        int[] outputArray = selectionSort(inputArray);
        timeMetric.endTime();
        this.setTotalTime(timeMetric.getTotalMetric());
        this.setSortAlgorithmName(this.getClass().getSimpleName());
        return outputArray;
    }
}
