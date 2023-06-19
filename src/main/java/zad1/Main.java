package zad1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите значение");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = createList(n);
        System.out.println("linkedlist = "+ linkedList);
        System.out.println("revers = "+ revers(linkedList));

    }
    
    private static LinkedList<Integer> createList(int n){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(9));
        }
        return linkedList;
    }

    private static LinkedList<Integer> revers(LinkedList<Integer> linkedList){
        LinkedList<Integer> revers = new LinkedList<>();
        for (int i =  linkedList.size()-1;i>=0; i--) {
            revers.add(linkedList.get(i));
        }
        return revers;
    }
}
