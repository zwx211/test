package codeTest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class MoneyTest {
      public static ArrayList<Integer> divide(int totalMoney,int totalCount){
          Random rd = new Random();
          ArrayList<Integer> list = new ArrayList<>();
          int money = totalMoney;
          int count = totalCount;
          for(int i= 0; i<totalCount-1; i++){
              int hongbao = rd.nextInt(money/count*2);
              money = money -hongbao;
              count = count-1;
              list.add(hongbao);


          }
          list.add(money);
          return list;

      }

    public static void main(String[] args) {
        System.out.println(divide(100,10));
    }
    }





