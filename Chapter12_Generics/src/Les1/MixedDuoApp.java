package Les1;

public class MixedDuoApp {
    public static void main(String[] args) {
        //volgorde is blangrijk eerst string en dan integer
        MixedDuo<String, Integer> mixedDuo = new MixedDuo<>("Dog", 20);
        System.out.println(mixedDuo.getObject1());
        System.out.println(mixedDuo.getObject2());

    }
}

