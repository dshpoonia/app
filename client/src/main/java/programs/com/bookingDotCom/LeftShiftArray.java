package programs.com.bookingDotCom;

import java.util.Arrays;

/**
 * Created by deepak.poonia on 23-04-2017.
 */
public class LeftShiftArray {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int ls = 2;

        int[] r = new int[a.length];

        for(int i =ls , j = 0; i < a.length; i ++,j ++){
            r[j] = a[i];
        }
        for(int i =a.length-ls , j = 0; i < a.length; i ++,j ++){
            r[i] = a[j];
        }

        System.out.println(Arrays.toString(r));

    }
}
