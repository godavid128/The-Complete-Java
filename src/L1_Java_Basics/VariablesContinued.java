package L1_Java_Basics;
// Variabilele - sunt folosite pt a stoca temporar date si care se pot modifica valoarea care a fost stocata
// Java este un limbaj 'strongly type' = ins ca fiecare variabil care a fost definita tb sa aiba datele indicate in variabila reala.
public class VariablesContinued {
    public static void main(String[] args) {
        // Date primitive
        // O variabila indefinita accepta max 9 zerouri
        int var = 1000000000;
        // O variabila ce accepta mai multe zerouri decat '9' daca adaugam un 'L' la sfarsit
        long bigNumber = 100000000000000L;
        // O variabila ce stocheaza numrere pana la 32767
        short shortNumber = 32767; // negativ accepta pana la -32768
        // O variabila ce stocheaza numere inferior la 100, accepta num max 127 (sau negativ -128)
        byte reallySmallNumber = 127;
        // Variabila decimala
        double decimalVariable = 394.003;
        // Variabila boolean accepta valori cum True/ Fals
        boolean decision = true;
        // Variabila ce accepta caractere unice: accepta doar gilimele ''
        char letter = '%';
    }
}
