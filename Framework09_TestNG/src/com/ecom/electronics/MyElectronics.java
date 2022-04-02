package com.ecom.electronics;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyElectronics {

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
    public void Test11(){
        System.out.println("     Actual method 11");
    }

    @Test
    public void Test12(){
        System.out.println("     Actual method 12");
        Assert.fail("Failed on purpose here");
    }

}

//  Add your multiple sample class with proper package structure in xml file
//  Checkout the default reporting in index.html, email-able-report.html, when run using command line
//  Annotations - hierarchy is - Suite, Test, Class, Method
//      - BeforeClass/AfterClass, BeforeMethod/AfterMethod  should be in the same class where @Test is used
//      - BeforeSuite/AfterSuite, BeforeTest/AfterTest, BeforeMethod/AfterMethod declaration could be in other class
//  Failed test execution
//      - Using test-output\testng-failed.xml
//                  This was need to run testng.xml file N number of time again
//      - Using org.testng.IRetryAnalyzer and AnnotationTransformer  -
//                  Transform method is called for every test during test run.
//  Running TestNG programmatically