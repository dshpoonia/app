package ds.heap;

import org.junit.Test;

public class MinHeapTest {

    @Test
    public void testMinHeap(){
        int[] a = {35, 33, 42, 10, 14, 19, 27, 44, 26, 31};
        MinHeap testClass = new MinHeap(10);
        for(int i : a){
            testClass.insert(i);
        }

        testClass.display();

        testClass.removeMin();
        System.out.println("\n");
        testClass.display();
    }
}