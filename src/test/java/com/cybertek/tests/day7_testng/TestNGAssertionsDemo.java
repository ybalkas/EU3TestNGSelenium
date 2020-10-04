package com.cybertek.tests.day7_testng;
  import org.testng.Assert;
  import org.testng.annotations.AfterMethod;
  import org.testng.annotations.BeforeMethod;
  import org.testng.annotations.Test;
public class TestNGAssertionsDemo {



    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("open browser");
    }
    @Test
    public void Test1(){
        Assert.assertEquals("ahmet","ahmet");
        System.out.println("First assertion");
        Assert.assertEquals("url","url");
        System.out.println("Second assertion");
    }

    @Test
    public void Test2(){
        Assert.assertEquals("ahmet","ahmet");
        System.out.println("First assertion");
        Assert.assertEquals("url","url1");
        System.out.println("Second assertion");

    }
    @Test
    public void Test3(){
        Assert.assertTrue(true,"verify email");
        Assert.assertFalse(0>1,"verify that zero less than ");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("close browser");
    }
}
