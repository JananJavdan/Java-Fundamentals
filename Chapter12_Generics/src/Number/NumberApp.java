package Number;

public class NumberApp {
    public static void main(String[] args) {
        NumberDuo<Integer> numberDuo1 = new NumberDuo<>(2,5);
        NumberDuo<Double> numberDuo2 = new NumberDuo<>(2.5, 5.7);
        //NumberDuo<Number> numberDuo3 = new NumberDuo<>(2, 5);


        System.out.println(numberDuo1.sum());
        System.out.println(numberDuo2.sum());
      //  System.out.println(numberDuo3.sum());

    }
}
