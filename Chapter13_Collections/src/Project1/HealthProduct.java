package Project1;

public class HealthProduct extends Product{
    public HealthProduct(String name, int productID) {
        super(name, productID);
    }

    @Override
    public String toString() {
        return "HealthProduct{" +
                "name='" + name + '\'' +
                ", productID=" + productID +
                '}';
    }
}
