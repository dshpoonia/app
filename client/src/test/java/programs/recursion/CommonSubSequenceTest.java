package programs.recursion;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dpooni on 3/16/2017.
 */
public class CommonSubSequenceTest {
    @Test
   public void subSequenceCount() {

        CommonSubSequence testClass = new CommonSubSequence();
        int result = testClass.subSequenceCount("ABCDGH", "AEDFHR");

        assertEquals(3, result);
    }

}