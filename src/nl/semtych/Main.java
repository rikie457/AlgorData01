package nl.semtych;

public class Main {

    public static void main(String[] args) {
	 Assignment0102 ass = new Assignment0102(100);
    ass.seqMinMax();
        Utility util = new Utility();
        int [] arr1 = util.createRandomNumberArray(100);
        util.printArray(arr1);
        ass.recMinMax(arr1, 0, arr1.length-1);
        util.printArray(arr1);

    }
}
