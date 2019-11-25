package nl.semtych;

public class Assignment0102 {

    private Utility util = new Utility();
    private int amountofnumbers;

    public Assignment0102(int amountofnumbers) {
        this.amountofnumbers = amountofnumbers;
    }


    public void sortedMinMax() {
        int arr[] = util.createRandomNumberArray(this.amountofnumbers);
        util.sort(arr, 0, arr.length - 1);
        util.printArray(arr);
    }

    public void seqMinMax() {
        int tempmin = this.amountofnumbers;
        int tempmax = 1;
        int arr[] = util.createRandomNumberArray(this.amountofnumbers);
        for(int i = 0; i < arr.length; i++){

            if(arr[i] < tempmin){
                tempmin = arr[i];
            }

            if(arr[i] > tempmax){
                tempmax = arr[i];
            }
        }
        System.out.println("Min " + tempmin);
        System.out.println("Max " + tempmax);
        }

    public void recMinMax() {

    }

}
