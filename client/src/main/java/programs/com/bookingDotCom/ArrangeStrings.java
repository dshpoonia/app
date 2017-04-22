package programs.com.bookingDotCom;

import com.google.common.collect.Lists;
import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    private static Set<String> reArrange(List<String> input) {

        Map<Character, String> f = new HashMap<>();
        Map<Character, String> l = new HashMap<>();

        for(String s: input){
            //s = s.toLowerCase();
            f.put(s.charAt(0), s);
            char key = Character.toUpperCase(s.charAt(s.length() - 1));
            l.put(key, s);

            if(!f.containsKey(key)){
                f.put(key, null);
            }

        }

        Character ending = getEndingChar(f);

        for(String s : input){
            String x = l.get(ending);
            System.out.println(x);
            ending = x.charAt(0);
        }

        //System.out.println(f);
        //System.out.println(l);
                return null;
    }

    private static Character getEndingChar(Map<Character, String> f) {
        for (Character character : f.keySet()) {
            if(f.get(character) == null){
                return character;
            }
        }

        return null;
    }
}
