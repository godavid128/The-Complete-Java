package L3_Practice_Loops_2;
// while = in timp ce. Bucla while este o structura de control prin care rulam codul pana cand ceva este adevarat.
//
public class WhileLoopsPractice {
    public static void main(String[] args) {
        int count = 0;
        while (count <=100){
            System.out.println("david" +count);
            count = count + 1;
            if (count == 10){
                break;
            }
        }
        String str = "We have a large inventory of things in our warehouse falling in the " +
                "category:apperal and the slightly more in demand " +
                "category:makeup along with the category:furniture and...";
        printCategories(str);
    }
    /*
     * extract all categireas from the string argument
     * substring(String start, String end)
     * indexOf(String s, int i)
     * while (true){}
     */
    public static void printCategories(String string){
        int i = 0;
        while (true){
            int found = string.indexOf("category:", i);
            if (found == -1) break;
            int start = found +9; // start of the actual category
            int end = string.indexOf(" ", start);
            System.out.println(string.substring(start, end));
            i = end + 1;


        }
    }
}
