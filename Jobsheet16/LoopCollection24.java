package Jobsheet16;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class LoopCollection24 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }

        fruits.set(fruits.size() - 1, "Strawberry");
        System.out.printf("%s " + fruits);

        fruits.add("Mango");
        fruits.add("guava");
        fruits.add("avocado");
        int sort = fruits.size();
        for (int i = 0; i < sort - 1; i++) {
            for (int j = 0; j < sort - i - 1; j++) {
                if (fruits.get(j).compareTo(fruits.get(j + 1)) > 0) {
                    String temp = fruits.get(j);
                    fruits.set(j, fruits.get(j + 1));
                    fruits.set(j + 1, temp);
                }
            }
        }
    }
}
