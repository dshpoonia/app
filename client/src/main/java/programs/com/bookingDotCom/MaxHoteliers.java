package programs.com.bookingDotCom;

import java.util.Arrays;

/**
 * Created by deepak.poonia on 21-04-2017.
 */
public class MaxHoteliers {

    public static void main(String[] args) {
        int[] a = {1, 2, 10, 5, 5, 11, 14, 12, 13, 2};
        int[] d = {29, 25, 12, 9, 12, 19, 17, 23, 30, 30};

        Arrays.sort(a); // 1,2,5,5,10
        Arrays.sort(d); // 4,5,9,12,12


        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(d));

        int max = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int day = a[0];

        /*
        [1, 1, 1, 1, 2, 2, 3, 5, 5, 10]
        [3, 3, 4, 4, 5, 7, 9, 9, 12, 12]*/

        while (i < a.length && j < a.length) {

            if (a[i] <= d[j]) {
                count++;

                if (count > max) {
                    max = count;
                    day = a[i];

                }
                i++;
            } else {
                count--;
                j++;
            }
        }

        System.out.println(day);
    }
}
