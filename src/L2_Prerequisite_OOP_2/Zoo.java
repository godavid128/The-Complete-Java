package L2_Prerequisite_OOP_2;

public class Zoo {
    // metode main est la metode principale
    public static void main(String[] args) {
        // Cand ajunge codul aici, el va creea, mai I, o variabila de tip 'animal'
        // Cod va aloca spatiu in memorie pt aceasta variab particulara,
        // Apoi, in memorie, va crea obiectul real
//        Animals animal1 = new Animals("Girafe", 2000, 14, "marro clair et fonce",
//                "cou long de 5,50 m.");
//        Animals animal2 = new Animals("Lion", 225, 15, "blanc dore",
//                "Roi des animaux");
//        Animals animal3 = new Animals("Elephant", 6000, 70, "marro",
//                "j'ai une trompe ");
//
//        animal1.presentation();
//        animal1.animauxHerbivores();
//        animal1.dormir();
//        animal2.presentation();
//        animal2.animauxCarnivores();
//        animal2.dormir();
//        animal3.presentation();
//        animal3.animauxHerbivores();
//        animal3.dormir();
//
//        Bird bird1 = new Bird("Fazan", 3, 2, "bleu", "Grand");
//        bird1.animauxHerbivores();
//
//        Fish fish1 = new Fish("Somon", 2, 1, "rouge", "populaire");
//        fish1.swim();
//        fish1.dormir();
//
//        Chicken chick1 = new Chicken("Viola", 1, 2, "noir", "scormoneste");
//        Animals sparrow1 = new Sparrow("Bi", 01, 1, "blanc", "bi, bi");
////        sparrow1.move();
//
//        Animals fish1 = new Fish("el", 1, 2, "rouge", "Premier");
////        fish1.move();
//
//        moveAnimals(fish1);
//        moveAnimals(sparrow1);
//
//    }
//    public static void moveAnimals(Animals animals){
//        animals.move();
        Flyable flyingBird = new Sparrow("lie", 1, 2, "Vert", "min");
        flyingBird.fly();
//        Flyable flyingBird2 = new Bird("an", 1, 3, "gri", "lin");
//        flyingBird2.fly();
    }

}
