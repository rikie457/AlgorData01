package nl.semtych;

public class Opdracht1 {

    private int amountofnumbers;
    private Utility util;

    public Opdracht1(int amountofnumbers) {
        this.amountofnumbers = amountofnumbers;
        this.util = new Utility();

    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            int[] arr = util.createRandomNumberArray(this.amountofnumbers);
            sortedMinMax(arr);
        }
    }

    public int[] sortedMinMax(int[] arr) {
        util.startTimer();
        util.sort(arr, 0, arr.length - 1);
        util.stopTimer();
        System.out.println("01: " + this.amountofnumbers + " NUMBERS ARE SORTED IN " + util.displayTime() + " MIN " + arr[0] + " MAX " + arr[arr.length - 1]);

        return new int[]{arr[0], arr[arr.length - 1]};
    }
}
