package ch15.lecture.p3stack;

import java.util.Stack;

public class C01Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("java");
        stack.push("react");
        stack.push("spring");
        stack.push("css");

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        String item1 = stack.pop();

        System.out.println(item1);
    }
}
