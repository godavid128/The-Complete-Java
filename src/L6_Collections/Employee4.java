package L6_Collections;

public class Employee4 implements Comparable<Employee4> {
    String name;
    int salary;
    String department;

    @Override
    public String toString() {
        return "Employee4{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public Employee4(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public int compareTo(Employee4 o) {
        if (this.salary < o.salary){
            return -1;
        } else if (this.salary > o.salary){
            return 1;
        }
        return 0;
    }
}
