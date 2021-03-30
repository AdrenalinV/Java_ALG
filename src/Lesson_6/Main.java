package Lesson_6;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r=new Random();
        int count;
        int balance=0;
        for (count = 0; count <200000 ; count++) {
            MyTreeMap<Integer, String> map = new MyTreeMap<>();
            int key=0;
            while (map.depth()<7){
                key=r.nextInt(201) - 100;
                map.put(key, "test"+key);
            }
            map.delele(key);
            if (map.isBalance()){
                balance++;
            }
            map=null;
        }
        System.out.println("Balance: "+ balance);
        System.out.println("percentage of balanced trees: "+(float)balance/count*100 + "%");


    }
}
