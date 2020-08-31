package codeTest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class MoneyTest {
      public static ArrayList<Integer> divide(int totalMoney,int totalCount){
          Random rd = new Random();
          ArrayList<Integer> list = new ArrayList<>();
          int leftMoney = totalMoney;
          int leftCount = totalCount;

          for(int i = 0; i<totalCount-1;i++){
              int money = rd.nextInt(leftMoney/leftCount*2);
              leftMoney = leftMoney - money;
              list.add(money);
              leftCount= leftCount-1;

          }
          list.add(leftMoney);
          return list;
      }

    public static void main(String[] args) {
        System.out.println(divide(100,10));
    }
    }





