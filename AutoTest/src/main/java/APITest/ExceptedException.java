package APITest;

import org.testng.annotations.Test;

public class ExceptedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptiom(){
        System.out.println("这是异常测试");
        throw  new RuntimeException();
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException1(){
        System.out.println("这是失败的异常测试");
    }
}
