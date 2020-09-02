package APITest;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    //@Test(groups = { "fast" })
        @Test( groups = "server")
        public void test1(){
            System.out.println("这是服务端测试111");

        }
        @Test(groups = "server")
        public void test2(){
            System.out.println("这是服务端测试222");
        }
        @Test(groups = "client")
            public void test3(){
            System.out.println("这是客户端测试111");

        }
        @Test(groups = "client")
        public void test4(){
            System.out.println("这是客户端测试222");
        }
        @BeforeGroups("server")
    public void beforgroup(){
            System.out.println("这是服务端测试之前的方法");
        }
        @AfterGroups("server")
    public void aftergroup(){
            System.out.println("这是服务端测试之后执行的方法");
        }
        @BeforeGroups("client")
    public void beforegroup1(){
            System.out.println("这是客户端测试之前的方法");
        }
        @AfterGroups("client")
    public void aftergroup1(){
            System.out.println("这是客户端测试之后执行的方法");
        }

    }

