package programs.com.bookingDotCom;

import java.util.Stack;

/**
 * Created by deepak.poonia on 23-04-2017.
 */
public class BalancedBrackets {

    public static void main(String[] args) {
        String input = "{{()}}";

        System.out.println(isBalanced(input));
    }

    public static boolean isBalanced(String input){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '{' || input.charAt(i) == '('){
                s.push(input.charAt(i));
            } else {
                Character c = s.pop();

                if(input.charAt(i) == '}'){
                    if (c != '{') {
                        return false;
                    }
                }else {
                    if (c != '(') {
                        return false;
                    }
                }

            }

        }

        return s.empty();
    }
}
