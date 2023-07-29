package L3_Practice_Loops_2;
// i++ = (i=i+1)
public class ForLoopsPractice {
    public static void main(String[] args) {

        String name = "fahfddkghjklhureek";

        // afisam fiecare caracter din string 'name' in ordine crescatoare
        // O bucla in 3 parti: 1 = initializarea; 2 = e test; 3 = actiunea
        for (int i = 0; i < name.length(); i++){
            System.out.println("char:" + name.charAt(i));
        }
        // afisam fiecare caracter din string 'name' in ordine descrescatoare
        for (int i = name.length()-1; i >= 0; i--){
            System.out.println("char1:" + name.charAt(i));
        }

        // afisam toate num care sunt intre 0 si 100
        for (int i = 0; i <= 100; i+=5){ // i +=2 == i=i+2
            System.out.println(i);
        }

        int counter = 0;
        for (int i = 0; i <= 100; i++){
            System.out.println(i);
            int temp = counter + 1;
            counter = temp;
        }

        // bucla suprapusa
        int count = 0;
        for (int idx = 0; idx < 100; idx++){
            for (int j = 0; j < 10; j++){
                System.out.println("the value of idx was " + idx + "----" + j);
                count++;
            }
        }
        System.out.println("count" + count);
    }
}
