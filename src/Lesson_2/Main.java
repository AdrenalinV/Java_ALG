package Lesson_2;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        final int SIZE_ARR = 100000;
        Random r = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(SIZE_ARR);
        for (int i = 0; i < SIZE_ARR; i++) {
            mal.add(r.nextInt(SIZE_ARR));
        }
        long start = System.currentTimeMillis();
//        mal.selectionSort();      // 10978 мс.
//        mal.insertionSort();      // 12963 мс.
        mal.bubbleSort();         // 42182 мс.
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения сортировки равно: " + (finish - start) + " мс.");
    }
}
