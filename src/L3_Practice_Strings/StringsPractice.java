package L3_Practice_Strings;

public class StringsPractice {
    public static void main(String[] args) {
        // Extragerea index cu 1/ sau 2 argumente.
        // Ex: str.substring(0, 2) => "AB"; (1, 3) => "BC" - ultim arg apelat nu este inclus
        String str = "ABCDEFG";
        System.out.println(str.substring(1, 7));

        String a = "hello";
        String b = "there";
        if(a == "hello"){
            // this is a trap, don't do this
            System.out.println("ok hello");
        }
        if (b.equals("there")) {
            //use this!!!
            System.out.println("ok, this");
        }
        // extragem doar un caracter dupa index folosind metoda 'charAt'
        System.out.println(a.charAt(1));

        // metoda 'indexOf' - extragem
        String str1 = "hello yogi there yogi there";
        int a1 = str1.indexOf("there", 7);
        int b1 = str1.lastIndexOf("yogi");
        System.out.println(b1);


    }
}
