package APITest;

import org.testng.annotations.Test;

public class DependTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException1() {
        System.out.println("这是失败的异常测试");
    }
    @Test(dependsOnMethods = "runTimeException1" )
    public void test1(){
        System.out.println("test1 run");
    }
}
