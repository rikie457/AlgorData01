package nl.semtych;

public class Opdracht2 {

    private int amountofnumbers;
    private Utility util;

    public Opdracht2(int amountofnumbers) {
        this.amountofnumbers = amountofnumbers;
        this.util = new Utility();
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            int[] arr = util.createRandomNumberArray(this.amountofnumbers);
            seqMinMax(arr);
        }
    }

    public int[] seqMinMax(int[] arr) {
        int tempmin = amountofnumbers;
        int tempmax = 1;

        util.startTimer();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < tempmin) {
                tempmin = arr[i];
            }

            if (arr[i] > tempmax) {
                tempmax = arr[i];
            }
        }
        util.stopTimer();
        System.out.println("02: " + this.amountofnumbers + " NUMBERS ARE SORTED IN " + util.displayTime() + " MIN " + tempmin + " MAX " + tempmax);
        return new int[]{tempmin, tempmax};
    }
}
