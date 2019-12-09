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
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < tempmin) {
                tempmin = arr[i];
            }

            if (arr[i] > tempmax) {
                tempmax = arr[i];
            }
        }
        System.out.println("Min " + tempmin);
        System.out.println("Max " + tempmax);
    }

    public void recMinMax(int arr[], int l, int r){
        if (l < r)
        {
            int m = (l+r)/2;
            System.out.println("LENGTEEEEEEE: " + m);
            if (m > 1) {
                recMinMax(arr, l, m);
                recMinMax(arr, m + 1, r);
            }

            merge(arr, l, m, r);
        }
    }

    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        int i = 0, j = 0;

        int k = l;

        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
