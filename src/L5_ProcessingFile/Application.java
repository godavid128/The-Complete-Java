package L5_ProcessingFile;

import java.io.FileNotFoundException;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        // Acest for ne ajuta sa rulam n(i<=3 == 4ori) ori input-urile ns
//        for (int i=0; i <=0; i++) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter some text: ");
//            String enteredText = input.nextLine();
//            System.out.println(enteredText);
//        }
//        // apelam myfile.txt
//        File file = new File("myfile.txt");
//        Scanner input = new Scanner(file);
//        while (input.hasNextLine()){
//            String line = input.nextLine();
//            System.out.println(line);
//        }
//        input.close();

        MyFileUtils myUtil = new MyFileUtils();
        try {
            System.out.println(myUtil.subtract10FromLorgerNumber(13));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
