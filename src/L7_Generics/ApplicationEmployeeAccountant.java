package L7_Generics;

import java.util.ArrayList;
import java.util.List;

public class ApplicationEmployeeAccountant {
    public static void main(String[] args) {
        Object myObject = new Object();
        String myVar = "heloo";
        myObject = myVar;

        Employee emp = new Employee();
        Accountant acc = new Accountant();
        emp = acc;

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        ArrayList<Accountant> accountants = new ArrayList<>();
        accountants.add(new Accountant());
//        employees = accountants;

        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList<String> accountants2 = new ArrayList<>();
        employees2 = accountants2;

        // upper bound
        ArrayList<? extends Employee> employees3 = new ArrayList<>();
        ArrayList<Employee> accountants3 = new ArrayList<>();
        employees3 = accountants3;

        // lower bound
        ArrayList<? super Employee> employees4 = new ArrayList<>();
        ArrayList<Object> accountants4 = new ArrayList<>();
        employees4 = accountants4;

        makeEmployeeWork(employees);
        makeEmployeeWork(accountants);

    }
    public static void makeEmployeeWork(List<? extends Employee> employees){
        for (Employee emp: employees){
            emp.work();
        }
    }
}
