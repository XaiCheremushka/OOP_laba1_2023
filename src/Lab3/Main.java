package Lab3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        Stack<Integer> stackVr = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 чисел для 1 стека: ");
        for (int i = 0; i<5; i++){
            stack1.push(scanner.nextInt());
        }
        System.out.println("Введите 5 чисел для 2 стека: ");
        for (int i = 0; i<5; i++){
            stack2.push(scanner.nextInt());
        }
        System.out.println("Первый стек: " + stack1 + "\nВторой стек: " + stack2);
        System.out.println("Меняем информацию местами...");

        while (!stack1.isEmpty()) {
            stackVr.push(stack1.pop());
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        while (!stackVr.isEmpty()) {
            stack2.push(stackVr.pop());
        }

        System.out.println("Первый стек: " + stack1 + "\nВторой стек: " + stack2);

    }
}
