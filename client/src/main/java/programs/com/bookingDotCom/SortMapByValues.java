package programs.com.bookingDotCom;

import java.util.*;

/**
 * Created by deepak.poonia on 22-04-2017.
 */
public class SortMapByValues {

    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(1, 1);
        m.put(3, 3);
        m.put(9, 9);
        m.put(8, 8);
        m.put(2, 2);
        m.put(5, 5);
        m.put(4, 4);

        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(m.entrySet());

        Collections.sort(l, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        Map<Integer, Integer> n = new HashMap<>();

        for(Map.Entry<Integer, Integer> e  : l){
            n.put(e.getKey(), e.getValue());
            System.out.println(e.getKey());
        }

    }
}
