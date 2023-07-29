package L1_Java_Basics;

public class Arrays {
    public static void main(String[] args) {
        // index este ca o adresa, unde putem stoca date. Ex positia 0 = stocheaza nr 1000, iar positia 99 - stocheaza nr 93432

//        int [] values = new int[100];
//        values[0] = 1000;
//        values[99] = 93432;
//        System.out.println(values[99]);
        // O data ce a fost initializat acest tablou - el nu poate fi marit sau redus mai tarziu
        double [] values = new double[100];
        values[1] = 10.00;
        values[99] = 9876;
        System.out.println(values[99]);

        String [] words = new String[]{"My", "Name", "is", "David"};
        System.out.println(words[3]);

    }
}
