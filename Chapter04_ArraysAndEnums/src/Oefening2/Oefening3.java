package Oefening2;

public class Oefening3 {
    public static void main(String[] args) {

        int [] nummer = {20,30,25,35,-16,60,-100};
        double gemiddelde = 0.0;
        int sum =0;

        for (int num : nummer ) {
            sum += num;
        }
        gemiddelde = sum / nummer.length;
        System.out.println("gemidelde van nummer is: " +gemiddelde);
    }
}
