
import java.util.Scanner;

    public class Rekenmachine3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Voer een wiskundige expressie in of typ 'exit' om te stoppen: ");
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
                }
            }
            scanner.close();
        }

        private static double evaluate(String expressie) {
            return new Object() {//Dit creëert een anoniem object in Java, een instantie van een anonieme inner class, die binnen de evaluate-methode wordt aangemaakt
                int positie = -1, karakter;// variabelen positie en karakter gedefinieerd. (positie wordt geïnitialiseerd op -1 en karakter wordt nog niet geïnitialiseerd.)

                void volgendeKarakter() {//Dit is een methode binnen het anonieme object die verantwoordelijk is voor het verplaatsen naar het volgende karakter in de invoerexpressie.
                    karakter = (++positie < expressie.length()) ? expressie.charAt(positie) : -1;
                }//deze logica verhoogt eerst de positie met 1 en controleert vervolgens of deze nieuwe positie binnen de lengte van de expressie valt

                void overslaanLeegtes() {//dit is een methode die geen waarde retourneert ,
                    while (Character.isWhitespace(karakter)) {//de methode controleert of het
                        volgendeKarakter();
                    }
                }

                double parseUitdrukking() {//parse gebruik voor het analizeren en evalueren van de wiskunde
                    volgendeKarakter();
                    double resultaat = parseToevoegingEnAftrek();//Dit is een methode binnen de parser die verantwoordelijk is voor het analyseren en evalueren van de gehele wiskundige expressie.
                    if (positie < expressie.length()) {
                        throw new RuntimeException("Ongeldige expressie.");
                    }
                    return resultaat;//Als er geen ongeldige expressie is aangetroffen, wordt het berekende resultaat van de expressie geretourneerd als een double
                }

                double parseToevoegingEnAftrek() {
                    double resultaat = parseVermenigvuldigingEnDelen();
                    while (true) {
                        overslaanLeegtes();
                        if (karakter == '+') {
                            volgendeKarakter();
                            resultaat += parseVermenigvuldigingEnDelen();
                        } else if (karakter == '-') {
                            volgendeKarakter();
                            resultaat -= parseVermenigvuldigingEnDelen();
                        } else {
                            return resultaat;
                        }
                    }
                }

                double parseVermenigvuldigingEnDelen() {
                    double resultaat = parseModulo();
                    while (true) {
                        overslaanLeegtes();
                        if (karakter == '*') {
                            volgendeKarakter();
                            resultaat *= parseModulo();
                        } else if (karakter == '/') {
                            volgendeKarakter();
                            resultaat /= parseModulo();
                        } else {
                            return resultaat;
                        }
                    }
                }

                double parseModulo() {
                    double resultaat = parseWaarde();
                    while (true) {
                        overslaanLeegtes();
                        if (karakter == '%') {
                            volgendeKarakter();
                            resultaat %= parseWaarde();
                        } else {
                            return resultaat;
                        }
                    }
                }

                double parseWaarde() {
                    overslaanLeegtes();
                    if (karakter == '(') {
                        volgendeKarakter();
                        double resultaat = parseToevoegingEnAftrek();
                        if (karakter != ')') {
                            throw new RuntimeException("Ontbrekende haakjes.");
                        }
                        volgendeKarakter();
                        return resultaat;
                    }
                    if (Character.isDigit(karakter) || karakter == '.') {
                        StringBuilder nummer = new StringBuilder();
                        while (Character.isDigit(karakter) || karakter == '.') {
                            nummer.append((char) karakter);
                            volgendeKarakter();
                        }
                        return Double.parseDouble(nummer.toString());
                    }
                    throw new RuntimeException("Ongeldige expressie.");
                }
            }.parseUitdrukking();
        }
    }


