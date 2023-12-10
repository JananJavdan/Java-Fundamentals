package Les1;

public class PathApp {
    public static void main(String[] args) {
        MijnThread mijnThread1 = new MijnThread(" *");
        MijnThread mijnThread2 = new MijnThread("-");
        //status new
        System.out.println(mijnThread1.getState());
        mijnThread1.start();
        mijnThread2.start();
        //status running
        System.out.println(mijnThread1.getState());

    }
}
