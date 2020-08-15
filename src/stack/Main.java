package stack;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        Stack<Integer> stack = new ArrayStack<>();
//        for (int i = 0; i < 5; i++) {
//            stack.push(i);
//            System.out.println(stack);
//        }
//        stack.pop();
//        System.out.println(stack);

//        Stack<Integer> stack = new LinkedListStack<>();
//        for (int i = 0; i < 5; i++) {
//            stack.push(i);
//            System.out.println(stack);
//        }
//        stack.pop();
//        System.out.println(stack);

        int opCount = 100000;

        Stack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, opCount);
        System.out.println("ArrayStack, time: " + time1 + " s");

        Stack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack, opCount);
        System.out.println("linkedListStack, time: " + time2 + " s");
    }

    private static double testStack(Stack<Integer> s, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++) s.push(random.nextInt(Integer.MAX_VALUE));
        for (int i = 0; i < opCount; i++) s.pop();

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }
}
