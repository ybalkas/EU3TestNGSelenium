package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAfterMethod {
  @BeforeClass
  public void SetupClass(){
      System.out.println("Setup Class");



  }
  @Test
    public void AmazonTest(){
      System.out.println("First Test Case");

    }

    @Test
    public void FaceBookTest(){
        System.out.println("Second Test Case");

    }
    @Test
    public void CyberTekTest(){
        System.out.println("Third Test Case");

    }
  @BeforeMethod
    public void setUp(){
      System.out.println("WebDriver,Opening Browser");
  }
    @AfterMethod
    public void tearDownUp(){
        System.out.println("Closing Browser,Quit");
    }
    // runs once before each Testcase
    // runs once after each TestCase
    @AfterClass
    public void tearUpClass(){
        System.out.println("Some reports detailed code reporting");

    }
}
