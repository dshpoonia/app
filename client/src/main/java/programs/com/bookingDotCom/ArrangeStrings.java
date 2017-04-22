package programs.com.bookingDotCom;

import com.google.common.collect.Lists;

import java.util.*;

/**
 * Created by deepak.poonia on 12-04-2017.
 *
 * Problem:

 The input is a list of names in random order. We need a function that chains elements of the list in such a way that the last character of an name is the same as the first one of the next name. For instance:

 Input: ["Raymond", "Nora", "Daniel", "Louie", "Peter", "Esteban"]

 Output: ["Peter", "Raymond", "Daniel", "Louie", "Esteban", "Nora"]

 Hint: There should be only one solution, so the first element is unique.

 */
public class ArrangeStrings {

    public static void main(String[] args) {
        List<String> input = Lists.newArrayList("Raymond", "Nora", "Daniel", "Louie", "Peter", "Esteban");

        System.out.println(reArrange(input));
    }

    private static List<String> reArrange(List<String> input) {

        Map<Character, String> o = new HashMap<>();
        Map<Character, String> r = new HashMap<>();

        for(String s : input){
            o.put(s.charAt(0), s);

           char key = Character.toUpperCase(s.charAt(s.length() - 1));

           if(!o.containsKey(key)){
               o.put(key, null);
           }

            r.put(key, s);
        }

        char c = getCharForLastString(o);

        List<String> out = new ArrayList<>(input.size());

        for(int i = 0; i < input.size(); i++){
            String e = r.get(c);
            out.add(e);
            c = Character.toUpperCase(e.charAt(0));

        }

       out = Lists.reverse(out);
        return out;

    }

    private static char getCharForLastString(Map<Character, String> o) {
        for(Character c : o.keySet()){
            if(o.get(c) == null){
                return c;
            }
        }

        throw new RuntimeException("check input");
    }

}
