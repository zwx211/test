package APITest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaMeter {
    @Test
    @Parameters({"name","age"})
    public void stu(String name,int age){
        System.out.print("age="+age+"name="+name);

    }
    @Test(dataProvider = "data")
    public void teacher(String name,int age){
        System.out.println(age+name);

    }
    @DataProvider(name = "data")
    public Object[][] para1(){
        Object[][] o =new Object[][]{
                {"zhangsi",12},
                {"lisan",13},
                {"wangwu",19}};
        return o;
    }

}
