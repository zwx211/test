package autoTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestExam {
    @BeforeTest
    public void beforeDemo(){
        System.out.println("before运行");
    }
    @AfterTest
    public void  afterDemo(){
        System.out.println("after运行");
    }

}
