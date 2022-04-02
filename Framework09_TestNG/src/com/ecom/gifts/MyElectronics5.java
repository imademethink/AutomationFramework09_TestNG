package com.ecom.gifts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyElectronics5 {

    @Test
    public void Test51(){
        System.out.println("     Actual method 11");
    }

    @Test
    public void Test52(){
        System.out.println("     Actual method 12");
        Assert.fail("Failed on purpose here");
    }

}
