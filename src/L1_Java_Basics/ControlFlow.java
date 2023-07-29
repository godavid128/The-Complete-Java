package L1_Java_Basics;
// Control Flow - ideea de baza este ca putem sa ramificam condul in mai multe directii
// Daca bloc din () lui if e True, bloc se va executa, sinon el va sari la bloc din else

public class ControlFlow {
    public static void main(String[] args) {
        boolean hungry = true;
        // ! face afirmatia negativa
        if (!hungry) {
            System.out.println("I'm starving...");
        } else {
            System.out.println("I'm not hungry");
        }

        int hungerRating = 5;
        if (!(hungerRating < 6)) {
            System.out.println("Not Hungry");
        } else
            System.out.println("I'm starving...");

        int favoriteTemp = 75;
        int currentTemp = 100;
        String opinion = null;
        if (favoriteTemp == currentTemp) {
            if (currentTemp < favoriteTemp - 30) {
                opinion = "It's Pretty Dorn Cold..."; // este chiar frig
            } else if (currentTemp < favoriteTemp - 20) {
                opinion = "I'ts kinda cold out..."; // il fait un peu froid
            } else if (currentTemp > favoriteTemp + 10) {
                opinion = "It's hot out"; // Il fait trop chaud
            } else {
                opinion = "It's a beautifull day...";
            }
        } else {
            opinion = "InvalidTemp";
        }
        System.out.println(opinion);

        // Instructiunea 'switch' - ne permite sa controlam flux de cod
        // daca avem mai multe if-uri, ar fi o idee sa trecem la instructiunea 'switch'
        int month = 4;
        String monthString;
        switch (month) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            default: monthString = "Unknown Month";
                break;
        }
        System.out.println(monthString);
    }

}

