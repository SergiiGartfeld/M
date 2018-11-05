import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CheckWordsTest {

    public boolean cheWord(String s1, String s2) {
        String ps1 = s1.toLowerCase();
        String ps2 = s2.toLowerCase();

        char[] p1 = ps1.toCharArray();
        char[] p2 = ps2.toCharArray();

        Arrays.sort(p1);
        Arrays.sort(p2);

        String f1 = new String(p1);
        String f2 = new String(p2);


        return f1.equals(f2);
    }

@Test
    public void testCopare(){
    String str1 = "Qwer";
    String str2 = "rewq";
    boolean result = cheWord(str1,str2);
    Assert.assertTrue(result);




}

}