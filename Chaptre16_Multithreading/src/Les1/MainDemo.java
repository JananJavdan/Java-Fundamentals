package Les1;

public class MainDemo {
    public static void main(String[] args) {
        int n = 8; //number of thread
        for (int i = 0; i<n; i++){
            Demo object = new Demo();
            object.start();
        }
    }
}
