package L6_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ApplicationArrayList1 {
    // O lista ce accepta date de tip String si int
    public static void main(String[] args) {
        ArrayList words = new ArrayList();
        words.add("Hello ");
        words.add("there");
        words.add(10);
        words.add(9);
        words.add(12.00);
        words.add("H");
        String item1 = (String) words.get(0);
        int item2 = (int) words.get(2);
        int item3 = (int) words.get(3);
        System.out.println(item1);
        System.out.println(item2 + item3);

        // O lista ce accepta date de tip doar String
        ArrayList<String> word = new ArrayList<String>();
        word.add("Hello ");
        word.add("there");
        word.add("10");
        String item11 = word.get(0);
        System.out.println(item11);

        // o lista dinamica
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(34);
        numbers.add(200);
        numbers.add(45);
        numbers.add(100);
        numbers.remove();// suprima elementul din index 0
        System.out.println(numbers);
        for (int number: numbers){
            System.out.println(number);
        }

    }
}
