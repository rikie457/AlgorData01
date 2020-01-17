package nl.semtych;

public class Opdracht3 {

    private int amountofnumbers;
    private Utility util;

    public Opdracht3(int amountofnumbers) {
        this.amountofnumbers = amountofnumbers;
        this.util = new Utility();

    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            int[] arr = util.createRandomNumberArray(amountofnumbers);
            this.util.startTimer();
            int[] result = recMinMax(arr);
            this.util.stopTimer();
            System.out.println("03: " + this.amountofnumbers + " NUMBERS ARE SORTED IN " + util.displayTime() + " MIN " + result[0] + " MAX " + result[1]);
        }
    }

    public int[] recMinMax(int[] arr) {
        int tempmin;
        int tempmax;

        if (arr.length > 2) {
            int[][] splittedarr = util.splitArray(arr);
            int[] left = splittedarr[0];
            int[] right = splittedarr[1];

            int[] resultLeft = recMinMax(left);
            int[] resultRight = recMinMax(right);

            if (resultLeft[0] > resultRight[0]) {
                tempmin = resultRight[0];
            } else {
                tempmin = resultLeft[0];
            }

            if (resultLeft[1] < resultRight[1]) {
                tempmax = resultRight[1];
            } else {
                tempmax = resultLeft[1];
            }

            return new int[]{tempmin, tempmax};

        } else {
            if (arr.length == 1) {
                return new int[]{arr[0], arr[0]};
            } else {
                if (arr[0] > arr[1]) {
                    return new int[]{arr[1], arr[0]};
                } else {
                    return new int[]{arr[0], arr[1]};
                }
            }
        }
    }
}
