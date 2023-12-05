package Les1;

public class ArrayIndexOutOfBoundsExceptionsExample {
    public static void main(String[] args) {
        String[] maanden={"Januari","Februarie","Mart","April"};

            try {
                for (int i=02;i<5;i++){
                    System.out.println(maanden[i]+ " ");
            }
        }catch (ArrayIndexOutOfBoundsException exceptions){
                System.out.println(exceptions.getMessage());
                System.out.println("exceptions"+exceptions);
            }finally {
                System.out.println("code werkt");
            }
    }
}
//runtTimeExeption
