import java.util.Scanner;
/*

public class Rekenmachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = 10;

        while (true) {
            System.out.print("Voer een wiskundige expressie in (bijv. 10 - 5 + 6 + 8) of typ 'exit' om te stoppen: ");
            String expressie = scanner.nextLine();

            if (expressie.equalsIgnoreCase("exit")) {
                System.out.println("Programma beëindigd.");
                break;
            }

            try {
                double resultaat = evaluate(expressie);
                System.out.println("Resultaat: " + resultaat);
            } catch (Exception e) {
                System.out.println("Foutieve invoer, probeer opnieuw.");
                score--;
            }
        }
        System.out.println("Eindscore: " + score + "/10");
        scanner.close();
    }

    private static double evaluate(String expressie) {
        return new Object() {
            int positie = -1, karakter;

            void volgendeKarakter() {
                karakter = (++positie < expressie.length()) ? expressie.charAt(positie) : -1;
            }
            boolean isLeeg(int teControlerenKarakter){
                return
                        Character.isWhitespace(teControlerenKarakter);}
            boolean isOperator(int teControlerenKarakter){
                return
                        teControlerenKarakter == '+';
                teControlerenKarakter == '-' ||
                teControlerenKarakter == '*' ||
                        teControlerenKarakter == '/' ||
                        teControlerenKarakter == '%';
            }
            double


        }
    }

}


*/