package Lesson_3;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("Привет друг!"));
        System.out.println();
        MyDeQueue<String> mdq = new MyDeQueue<>(5);

        System.out.println("размер: " + mdq.size());
        mdq.addRight("1");
        mdq.addLeft("2");
        System.out.println(mdq);
        System.out.println(mdq.popLeft());
        mdq.addRight("3");
        mdq.addRight("4");
        mdq.addRight("5");
        mdq.addRight("6");
        mdq.addRight("7");
        mdq.addRight("8");
        mdq.addRight("9");
        mdq.addRight("10");
        System.out.println("размер: " + mdq.size());
        System.out.println(mdq);
        System.out.println(mdq.peekLeft());
        System.out.println(mdq.peekRight());
        System.out.println("размер: " + mdq.size());
        System.out.println(mdq.popLeft());
        System.out.println(mdq.popRight());
        System.out.println("размер: " + mdq.size());


    }

    public static String reverseString(String str) {
        if (str == null) {
            throw new NullPointerException("Передано пустое значение!");
        }
        StringBuilder out = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.empty()) {
            out.append(stack.pop());
        }
        return out.toString();

    }
}
