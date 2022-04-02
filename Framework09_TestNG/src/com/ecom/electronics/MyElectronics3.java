package com.ecom.electronics;

import org.testng.Assert;
import org.testng.annotations.*;
import sun.security.util.PropertyExpander;

public class MyElectronics3 {

    @Test
    public void Test21(){
        System.out.println("     Actual method 21");
    }

    @Test(expectedExceptions =  Exception.class)
    public void Test22(){
        System.out.println("     Actual method 22");
        //int k = 4 / 0;
        //System.out.println(k);
        Assert.fail("Failed on purpose here");
    }

    @Test(priority = 1)
    public void Test23(){
        System.out.println("     Actual method 23");
    }


    @Test(priority = 0)
    public void Test24(){
        System.out.println("     Actual method 24");
    }
}
