package Les2;

public class JoinExample {
    public static void main(String[] args) {
        String[] strArrayToString= {"intec","brussel","is","the","best"};
// de arrayomzetten naar string met een spatie tussen de worden
        String itIsNowAString = String.join("",strArrayToString);

        String itIsNowAStringWithHyphen = String.join("-",strArrayToString);

        System.out.println(itIsNowAString);
        System.out.println(itIsNowAStringWithHyphen);
    }
}
