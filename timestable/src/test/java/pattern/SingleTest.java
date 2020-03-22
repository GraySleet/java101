package pattern;


import org.junit.Assert;
import org.junit.Test;

public class SingleTest {

  //  Write a test method (annotated with @Test) that asserts expected results on the object under test:

    @Test
    public void testStringWith_prefixWhiteSpaces() {
        String testString="     OneTwoThree.";
        String result =  Singleton.getInstance().stripString(testString);
        Assert.assertEquals("OneTwoThree.", result  );
        System.out.println("result:" + result);
    }

    @Test
    public void testStringWith_WhiteSpacesInBetween() {
        String testString="     OneTwo   Three.";
        String result =  Singleton.getInstance().stripString(testString);
        Assert.assertEquals("OneTwoThree.", result  );
        System.out.println("result:" + result);
    }
    @Test
    public void testStringWith_WhiteSpacesAfter() {
        String testString="1                                          ";
        String result =  Singleton.getInstance().stripString(testString);
        Assert.assertEquals("1", result  );
        System.out.println("result:" + result);
    }
    @Test
    public void testStringWith_WhiteSpacesEverywhere() {
        String testString="          1               1           ";
        String result =  Singleton.getInstance().stripString(testString);
        Assert.assertEquals("11", result  );
        System.out.println("result:" + result);
    }
    @Test
    public void testNull() {
        String testString=null;
        String result =  Singleton.getInstance().stripString(testString);
        Assert.assertEquals("error", result  );
        System.out.println("result:" + result);
    }
}

