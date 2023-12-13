package Simple;

public class MainClient {
    public static void main(String[] args) {
        Stock stock = new Stock(80);
        Thread threadClient    = new Thread(new Client(stock,20));
        Thread threadGucciStore = new Thread(new Gucci(stock,100));

        threadClient.start();
        threadGucciStore.start();
    }

}
