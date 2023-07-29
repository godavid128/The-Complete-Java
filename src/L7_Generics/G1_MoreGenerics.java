package L7_Generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class G1_MoreGenerics {
    public static void main(String[] args) {
        G1_Container container = new G1_Container(12, "hello");
        Object myvar = container.getItem1();
        int val1 = (int) container.getItem1();
        String val2 = (String) container.getItem2();

        G1_Container container2 = new G1_Container(12.00, 300);

        Set<String> mySet1 = new HashSet<String>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("whatever");

        Set<String> mySet2 = new HashSet<String>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("computer");

        Set resultSet = union(mySet1, mySet2);

        Iterator itr = resultSet.iterator();
        while (itr.hasNext()){
            String var = (String) itr.next();
        }

    }
    public static Set union(Set set1, Set set2){
        Set result = new HashSet(set1);
        result.addAll(set2);
        return result;
    }

}
