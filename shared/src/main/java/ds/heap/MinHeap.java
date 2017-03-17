package ds.heap;

public class MinHeap {

    private int[] h;
    private int capacity;
    private int size;

    public MinHeap(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.h = new int[capacity];
    }
    private int getLeft(int i){
        return 2*i+1;
    }

    private int getRight(int i){
        return 2*i+2;
    }

    private int getParent(int i){
        return (i-1)/2;
    }

    public void display(){
        int i = 0;
        while(i < size){
            System.out.print(h[i] + ", ");
            i++;
        }
    }

    private int getMin(){
        return h[0];
    }

    public void insert(int key) {
        size++;
        int i = size - 1;
        h[i] = key;

        while (h[getParent(i)] > h[i] && i != 0) {
            swap(i, getParent(i));
            i = getParent(i);
        }

    }

    public void removeMin(){
        h[0] = h[size - 1];
        size--;
        heapify(0);

    }

    private void heapify(int i) {
        int l = getLeft(i);
        int r = getRight(i);

        int smallest = i;

        if(l < size- 1 &&( h[l] < h [i])){
            smallest = l;
        }

        if(r < size- 1 &&( h[r] < h [smallest])){
            smallest = r;
        }

        if(smallest != i){
            swap(i, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int i2) {
        int p = h[i2];
        int k = h[i];
        h[i] =p;
        h[i2]= k;
    }
}
