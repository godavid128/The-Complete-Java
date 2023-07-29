package L6_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application4 {
    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        list1.add(12);
//        list1.add(43);
//        list1.add(15);
//        list1.add(67);
//        list1.add(43);
//        list1.add(10);
//
//        ArrayList<Integer> newList = new ArrayList<Integer>();
//        newList.add(10);
//        newList.add(67);
//
//        list1.addAll(newList);
//        // suprima toate elem din newlist si cele ce au dubluri in list1
//        list1.removeAll(newList);
//
//        System.out.println(list1);
        HashSet<Employee4> hashSet = new HashSet<Employee4>();
        hashSet.add(new Employee4("Mike", 3500, "Accounting"));
        hashSet.add(new Employee4("Paul", 3000, "Admin"));
        hashSet.add(new Employee4("Peter", 4000, "IT"));
        hashSet.add(new Employee4("Angel", 2000, "Maint"));


        ArrayList<Employee4> mylist = new ArrayList<Employee4>(hashSet);
        Collections.sort(mylist);
        System.out.println(mylist);
    }
}
