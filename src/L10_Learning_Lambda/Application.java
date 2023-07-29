package L10_Learning_Lambda;

public class Application {
    public static void main(String[] args) {
        Human tom = new Human();
        walker(tom);

        Robot wale = new Robot();
        walker(wale);

        walker(() -> System.out.println("Custom object walking..."));

        Walkable aBlockOfCode = () -> {
            System.out.println("Custom object walking...");
            System.out.println("the object tripped...");
        };
        walker(aBlockOfCode);

        ALambdaInterface helloVar = () -> System.out.println("hello animals");
        Calculate sumVar = (a, b) -> a + b;
        helloVar.someMethod();
        System.out.println(sumVar.compute(4, 6));

        Calculate nonZeroDivide = (a, b) -> {
            if (a == 0) {
                return 0;
            }
            return a / b;
        };
        System.out.println(nonZeroDivide.compute(10, 5));

        MyGennericInterface<String> reverser = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };
        System.out.println(reverser.work("Vehicle"));

        MyGennericInterface<Integer> computerNumber = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(computerNumber.work(10));
    }

    public void sayHello() {
        System.out.println("hello animals");
    }

    public int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public int nonZeroDivide(int arg1, int arg2) {
        if (arg1 == 0) {
            return 0;
        }
        return arg1 / arg2;
    }

    public String reeverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

//    public int factorial(int num) {
//
//    }

    public static void walker(Walkable walkableEntitiy) {
        walkableEntitiy.walk();
    }
}

interface Calculate {
    public int compute(int a, int b);
}

interface MyGennericInterface<T> {
    public T work(T t);
}

interface NumberWorker {
    public int compute(int a);
}