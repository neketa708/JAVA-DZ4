package zad2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("ввод\"()\" = "+simpl("()"));
        System.out.println("ввод\"()[]{}\" = "+simpl("()[]{}"));
        System.out.println("ввод\"(]\" = "+simpl("(]"));

    }
    public static Boolean simpl(String path){
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : path.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
