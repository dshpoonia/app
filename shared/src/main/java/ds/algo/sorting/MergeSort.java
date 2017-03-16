package ds.algo.sorting;
// Author D Poonia : Created on 3/16/2017.

public class MergeSort {

    //TODO: complete this and add juints
    public int[] applySort(int[] input){

        int[] a = new int[input.length];
        mergeSort(a, 0, a.length-1);
        return a;
    }

    private void mergeSort(int[] a, int lower, int upper) {

        if(lower == upper){
            return;
        }

        int mid = (lower+upper)/2;

        mergeSort(a, lower, mid);
        mergeSort(a, mid+1, upper);

        merge(a, lower, upper);
    }

    private void merge(int[] a, int lower, int upper) {

    }
}
