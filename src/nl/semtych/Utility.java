package nl.semtych;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Utility {

    private Instant start, end;


    /**
     * Generate random integers and fill a array with them
     *
     * @param length the length of the array
     * @param min    the minimum number
     * @param max    the maximum number
     * @return the int [ ] with all the random numbers
     */
    public int[] randomArray(int length, int min, int max) {
        int[] randomIntArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomIntArray[i] = (int) (min + (Math.random() * (max - min)));
        }
        return randomIntArray;
    }

    /**
     * Print the array.
     *
     * @param arr the array to print
     */
    public void printArray(int[] arr) {
        System.out.print("(");
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
            if (i != length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(")");
        System.out.println();
    }

    /**
     * Create random number array int [].
     *
     * @param lengthOfArray = amount of random numbers that need to be created.
     * @return int[lengthOfArray] int []
     */
    public int[] createRandomNumberArray(int lengthOfArray) {
        return this.randomArray(lengthOfArray, 1, lengthOfArray);
    }

    /**
     * Split the array in 2 int[].
     *
     * @param array the array to split
     * @return the int [][] with 2 splitted sub arrays
     */
    public int[][] splitArray(int[] array) {
        int[][] splittedArray = new int[2][];
        int length = array.length;
        splittedArray[0] = new int[((length + 1) / 2)];
        splittedArray[1] = new int[length - splittedArray[0].length];

        for (int i = 0; i < length; i++) {
            if (i < splittedArray[0].length) {
                splittedArray[0][i] = array[i];
            } else {
                splittedArray[1][i - splittedArray[0].length] = array[i];
            }
        }

        return splittedArray;
    }

    /**
     * Merge int [].
     *
     * @param arr1 array 1 to merge
     * @param arr2 array 2 to merge
     * @return the merged int[]
     */
    public int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, index = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j])
                mergedArray[index++] = arr1[i++];
            else
                mergedArray[index++] = arr2[j++];
        }

        while (i < arr1.length)
            mergedArray[index++] = arr1[i++];

        while (j < arr2.length) {
            mergedArray[index++] = arr2[j++];
        }
        return mergedArray;
    }

    private int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    public void sort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    public Duration getDuration() throws timerException {
        if (this.start != null && this.end != null) {
            return Duration.between(this.start, this.end);
        }
        if (this.start != null) {
            throw new timerException("Timer is still running.");
        }
        throw new timerException("Timer is not started.");
    }

    public String displayTime() {
        try {
            Long milliseconds = this.getDuration().toMillis();
            return String.format("%5d",
                    TimeUnit.MILLISECONDS.toMillis(milliseconds)
            );

        } catch (timerException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Start timer.
     */
    public void startTimer() {
        this.start = Instant.now();
    }

    /**
     * Stop timer.
     */
    public void stopTimer() {
        this.end = Instant.now();
    }

}
