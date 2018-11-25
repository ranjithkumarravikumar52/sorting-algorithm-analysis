package sortalgorithms;

import util.metric.TimeMetric;

public class InsertionSort extends SortAlgorithm {

    private int[] insertionSort(int[] inputArray) {

        int[] localArray = new int[inputArray.length];
        System.arraycopy(inputArray, 0, localArray, 0, localArray.length);

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < localArray.length; firstUnsortedIndex++) {
            int newElement = localArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && localArray[i - 1] > newElement; i--) {
                //shifting to right
                localArray[i] = localArray[i - 1];
            }
            localArray[i] = newElement;
        }
        setOutputArray(localArray);
        return localArray;

    }

    @Override
    public int[] sort(int[] inputArray) {
        this.setInputArray(inputArray);
        TimeMetric timeMetric = new TimeMetric();
        timeMetric.startTime();
        int[] resultArray = insertionSort(inputArray);
        timeMetric.endTime();
        this.setTotalTime(timeMetric.getTotalMetric());
        this.setSortAlgorithmName(this.getClass().getSimpleName());
        return resultArray;
    }
}