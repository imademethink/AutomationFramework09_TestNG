package com.ecom.electronics;

import org.testng.Assert;
import org.testng.annotations.*;

public class MyElectronics2 {

    @BeforeClass
    public void CommonBeforeClass(){
        System.out.println("===CommonBeforeClass MyElectronics2==");
    }

    @AfterClass
    public void CommonAfterClass(){
        System.out.println("===CommonAfterClass MyElectronics2==");
    }

    @BeforeMethod
    public void CommonBeforeMethod(){
        System.out.println("====CommonBeforeMethod MyElectronics2==");
    }

    @AfterMethod
    public void CommonAfterMethod(){
        System.out.println("====CommonAfterMethod MyElectronics2==");
    }


    @Test
    public void Test21(){
        System.out.println("     Actual method 21");
    }

    @Test
    public void Test22(){
        System.out.println("     Actual method 22");
        Assert.fail("Failed on purpose here");
    }

}
