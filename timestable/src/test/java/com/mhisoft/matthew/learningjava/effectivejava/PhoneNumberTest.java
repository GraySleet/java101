package com.mhisoft.matthew.learningjava.effectivejava;

import org.junit.Assert;
import org.junit.Test;
import pattern.Singleton;

public class PhoneNumberTest {

    PhoneNumber x = new PhoneNumber(703, 636, 062);

    PhoneNumber y = new PhoneNumber(703, 636, 062);

    PhoneNumber z = new PhoneNumber(255, 636, 062);


    @Test
    public void testObjectEquals() {


        Assert.assertTrue("it should be true", (x.equals(y)));
        Assert.assertFalse("it should be false", x == y);
        Assert.assertTrue("x-y hashcode should be true", x.hashCode()==y.hashCode());
        Assert.assertFalse("x-z hashcode should be false", x.hashCode()==z.hashCode());
        Assert.assertFalse("It should be falase", (y.equals(z)));

    }


    @Test
    public void testInstanceOf() {


          Assert.assertTrue("should be true" , x instanceof PhoneNumber);
          Assert.assertTrue("should be true" , y instanceof PhoneNumber);

    }


}
