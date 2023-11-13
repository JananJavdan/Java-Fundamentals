package Project3;

public class WhyPhone extends SmartPhone{
    //attributes
    private final String COLOR;
    private final double PRICE;
    private final String BRAND;
//constraction
    public WhyPhone(double PRICE, String BRAND, String COLOR, double PRICE1, String BRAND1) {
        super(PRICE, BRAND);
        this.COLOR = COLOR;
        this.PRICE = PRICE1;
        this.BRAND = BRAND1;
    }
//getter
    public String getCOLOR() {
        return COLOR;
    }
}

