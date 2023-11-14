package ComparablExample;

public class DouApp {
    public static void main(String[] args) {
        ComparableDuo<Integer> d1 = new ComparableDuo<>(3, 5);
        ComparableDuo<Double> d2 = new ComparableDuo<>(3.5, 5.7);
        //ComparableDuo<Number> d3 = new ComparableDuo<Number>(3, 5.6);
        //cant be used, because it doesn t implement Comparable interface

        System.out.println(d1.getHighest());//5
        System.out.println(d2.getLowest());//3.5

        ComparableDuo<String> s1 = new ComparableDuo<>("Mert", "Yigit");
        System.out.println(s1.getLowest());//Mert
    }
}
