package APITest;

import org.testng.annotations.Test;

public class MutliThreadAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void mutliThread(){
        System.out.println(1);
        System.out.printf("ThreadId=",Thread.currentThread().getId());

    }
}
