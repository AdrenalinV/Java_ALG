package Lesson_8;

import java.util.Random;

public class Main {
    static Random random;

    public static void main(String[] args) {
        random = new Random();
        System.out.println("ChainingHashMap");
        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>(7);

        chm.put(5, "one");
        chm.put(1, "one");
        for (int i = 0; i < 12; i++) {
            chm.put(random.nextInt(100), "test");
        }

        System.out.println(chm);
        System.out.println("size: " + chm.size());
        System.out.println("remove: " + chm.remove(5));
        System.out.println("remove test: " + chm.remove(1, "test"));
        System.out.println(chm);
        System.out.println("size: " + chm.size());

        System.out.println();
        System.out.println("LinearProbingHashMap");
        LinearProbingHashMap<Integer, String> lphm = new LinearProbingHashMap<>(19);
        lphm.put(1, "one");
        lphm.put(2, "two");
        lphm.put(3, "three");
        lphm.put(2, "twosdfsdf");
        System.out.println("size: " + lphm.size());
        System.out.println("get: " + lphm.get(2));
        System.out.println("remove: " + lphm.remove(3));
        System.out.println("size: " + lphm.size());


    }
}
