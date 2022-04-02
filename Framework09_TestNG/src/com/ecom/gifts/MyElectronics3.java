package com.ecom.gifts;

import org.testng.Assert;
import org.testng.annotations.*;

public class MyElectronics3 {

    @BeforeClass
    public void CommonBeforeClass(){
        System.out.println("===CommonBeforeClass MyElectronics==");
    }

    @AfterClass
    public void CommonAfterClass(){
        System.out.println("===CommonAfterClass MyElectronics==");
    }

    @BeforeMethod
    public void CommonBeforeMethod(){
        System.out.println("====CommonBeforeMethod MyElectronics==");
    }

    @AfterMethod
    public void CommonAfterMethod(){
        System.out.println("====CommonAfterMethod MyElectronics==");
    }


    @Test
    public void Test31(){
        System.out.println("     Actual method 11");
    }

    @Test
    public void Test32(){
        System.out.println("     Actual method 12");
        Assert.fail("Failed on purpose here");
    }

}
