package APITest;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 3000)
    public void timeOutTest ()throws InterruptedException{
        Thread.sleep(2000);

    }
    @Test(timeOut = 2000)
    public void timeOutTest1() throws InterruptedException{
        Thread.sleep(3000);
    }
}
