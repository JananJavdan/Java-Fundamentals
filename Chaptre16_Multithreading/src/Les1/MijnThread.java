package Les1;

public class MijnThread extends Thread{
    private String sign;
    private Integer number;

    public MijnThread(String sign, Integer number) {
        this.sign = sign;
        this.number = number;
    }

    public MijnThread(String sign) {
        this.sign = sign;
    }

    public MijnThread() {
    }

    @Override
    public void run() {
       for (int i = 0; i<10; i++){//deze betekent dat sign 10 keer herhalen
           System.out.println(sign+" "+number);
       }
    }
}
