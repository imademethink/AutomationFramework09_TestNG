package com.ecom.gifts;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programmatically {

    public static void main(String[] args) {

        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setVerbose(2);

        XmlTest xmlTest   = new XmlTest(xmlSuite);
        xmlTest.setName("Test_Programmatically");
//        xmlTest.setParallel(XmlSuite.ParallelMode.METHODS);
//        xmlTest.setParallel(XmlSuite.ParallelMode.CLASSES);
        List<XmlClass> listXmlClasses = new ArrayList<>();
        listXmlClasses.add(new XmlClass("com.ecom.gifts.MyElectronics3"));
        listXmlClasses.add(new XmlClass("com.ecom.gifts.MyElectronics4"));
        listXmlClasses.add(new XmlClass("com.ecom.gifts.MyElectronics5"));
        xmlTest.setClasses(listXmlClasses);

        List<XmlSuite> listXmlSuite  = new ArrayList<>();
        listXmlSuite.add(xmlSuite);

        TestListenerAdapter tla      = new TestListenerAdapter();
        TestNG tng                   = new TestNG();
        tng.setXmlSuites(listXmlSuite);
        tng.addListener(tla);
        tng.run();
    }


}
