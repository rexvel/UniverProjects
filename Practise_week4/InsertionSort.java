package Practise_week4;

public class InsertionSort {
    public static void main (String args[]){


        long res;


        int [] arr = new int []{2,53,53,52,4,5,5};

       InSort(arr);
       for(int i=0;i<arr.length;i++) {
           System.out.println(arr[i]);
       }



    }


    public static void InSort(int [] arr){

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}


