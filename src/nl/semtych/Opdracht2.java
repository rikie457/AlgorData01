package nl.semtych;

public class Opdracht2 {

    private int amountofnumbers;
    private Utility util;

    public Opdracht2(int amountofnumbers) {
        this.amountofnumbers = amountofnumbers;
        this.util = new Utility();
        for (int i = 0; i < 10; i++) {
            seqMinMax();
        }
    }

    public void seqMinMax() {
        int tempmin = this.amountofnumbers;
        int tempmax = 1;
        int[] arr = util.createRandomNumberArray(this.amountofnumbers);
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
    }
}
