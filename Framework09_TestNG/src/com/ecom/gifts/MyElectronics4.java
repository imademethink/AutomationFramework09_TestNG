package com.ecom.gifts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyElectronics4 {


    @Test
    public void Test41(){
        System.out.println("     Actual method 11");
    }

    @Test
    public void Test42(){
        System.out.println("     Actual method 12");
        Assert.fail("Failed on purpose here");
    }

}
