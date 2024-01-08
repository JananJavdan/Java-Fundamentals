
import java.util.Scanner;

  /*  public class Rekenmachine2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int score = 10;

            while (true) {
                System.out.print("Voer een wiskundige expressie in (bijv. 10 - 5 + 6 + 8) of typ 'exit' om te stoppen: ");
                String expressie = scanner.nextLine();

                if (expressie.equalsIgnoreCase("exit")) {
                    System.out.println("Programma beindigd.");
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

        public static double evaluate(String expressie) {
            return new Object() {
                int pos = -1, ch;

                void volgendeChar() {
                    ch = (++pos < expressie.length()) ? expressie.charAt(pos) : -1;
                }

                boolean isLeegte(int charToCheck) {
                    return Character.isWhitespace(charToCheck);
                }

                boolean isOperator(int charToCheck) {
                    return charToCheck == '+'  charToCheck == '-'  charToCheck == '*'  charToCheck == '/'  charToCheck == '%';
                }

                double parseExpressie() {
                    volgendeChar();
                    double waarde = parseToevoegingEnAftrek();
                    if (pos < expressie.length()) {
                        throw new RuntimeException("Onverwacht einde van expressie");
                    }
                    return waarde;
                }

                double parseToevoegingEnAftrek() {
                    double waarde = parseVermenigvuldigingEnDelen();
                    while (true) {
                        if (isLeegte(ch)) {
                            volgendeChar();
                            continue;
                        }
                        char op = (char) ch;
                        if (op == '+' || op == '-') {
                            volgendeChar();
                            double volgende = parseVermenigvuldigingEnDelen();
                            if (op == '+') {
                                waarde += volgende;
                            } else {
                                waarde -= volgende;
                            }
                        } else {
                            return waarde;
                        }
                    }
                }

                double parseVermenigvuldigingEnDelen() {
                    double waarde = parseModulus();
                    while (true) {
                        if (isLeegte(ch)) {
                            volgendeChar();
                            continue;
                        }
                        char op = (char) ch;
                        if (op == '*'  op == '/'  op == '%') {
                            volgendeChar();
                            double volgende = parseModulus();
                            if (op == '*') {
                                waarde *= volgende;
                            } else if (op == '/') {
                                waarde /= volgende;
                            } else {
                                waarde %= volgende;
                            }
                        } else {
                            return waarde;
                        }
                    }
                }

                double parseModulus() {
                    double waarde = parseFactor();
                    while (true) {
                        if (isLeegte(ch)) {
                            volgendeChar();
                            continue;
                        }
                        if (ch == '%') {
                            volgendeChar();
                            double volgende = parseFactor();
                            waarde %= volgende;
                        } else {
                            return waarde;
                        }
                    }
                }
}
*/