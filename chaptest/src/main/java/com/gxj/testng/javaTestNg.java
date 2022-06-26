package src.main.java.com.gxj.testng;

import org.testng.Reporter;
import org.testng.annotations.*;

public class javaTestNg {

    @Test
    public void testCase01(){
        System.out.println("执行TestCase01");
    }
    @Test(enabled = false)
    public void testCase02(){
        System.out.println("执行TestCase02");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的了");
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我自己写的运行异常 日志");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的了");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass这是在测试方法之前运行的了");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass这是在测试方法之前运行的了");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite这是在测试方法之前运行的了");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite这是在测试方法之前运行的了");
    }



}
