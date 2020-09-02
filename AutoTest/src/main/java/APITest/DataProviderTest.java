package APITest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void dataProvider(String name,int age){
        System.out.println(name+""+age);


    }
    @DataProvider(name="data")
    public Object[][] provider(){
        Object[][] o = new Object[][]{
            {"zhangsan",13},
            {"lisi",11},
            {"yangyi",33}

        };
        return o;

    }
    @Test(dataProvider = "methodPara")
    public void test1(String name,int age){
        System.out.println("test1"+name+age);

    }
    @Test(dataProvider = "methodPara")
    public void test2(String name,int age){
        System.out.println("test2"+name+age);

    }
    @DataProvider(name="methodPara")
    public Object[][] methodParaTest(Method method){
        Object[][] ob = null;
        if(method.getName().equals("test1")) {
            ob = new Object[][]{
                    {"zhanghong", 77},
            };
        }
            else {
            ob = new Object[][]{
                    {"xiaoli", 32},
                    {"xiaomei", 22}

            };
        }
        return ob;

    }
}
