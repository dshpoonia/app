package programs.recursion;

public class CommonSubSequence {

    public int subSequenceCount(String s1, String s2){

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();


        return find(c1, c2, c1.length, c2.length);
    }

    private int find(char[] c1, char[] c2, int c1Length, int c2Length) {
        if(c1Length == 0 || c2Length ==0){
            return 0;
        }
        if(c1[c1Length-1] == c2[c2Length-1]){
            return 1 + find(c1, c2, c1Length - 1, c2Length - 1);
        } else {
            return maxOf(find(c1, c2, c1Length, c2Length - 1), find(c1, c2, c1Length - 1, c2Length));
        }

    }

    private int maxOf(int i, int i1) {
        return i > i1 ? i : i1;
    }

}
