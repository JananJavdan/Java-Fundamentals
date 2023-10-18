package be.intecbrussel.Les3;

public class MathExample2 {
    public static void main(String[] args) {
        //methode max
        int result01 = Math.max(10,9);
        double result02 = Math.max(10.3, 9.6);
        long result03 = Math.max(17L,8L);
        float result04 = Math.max(8F,30.5F);

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);

        System.out.println(Math.max(3L,6.5f));

        System.out.println(Math.max(10L,11.5D));
//methode min
        int result05 = Math.min(7, 9);
        double result06 = Math.min(1.3, 0.6);
        long result07 = Math.min(12L, 18L);
        float result08 = Math.min(71.5F, 30.5F);

        System.out.println(result05);
        System.out.println(result06);
        System.out.println(result07);
        System.out.println(result08);

        System.out.println(Math.min(30L, 12.5F));
        System.out.println(Math.min(100L, 101.9D));
    }
}
