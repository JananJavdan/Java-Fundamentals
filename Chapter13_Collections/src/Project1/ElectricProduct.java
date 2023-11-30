package Project1;

public class ElectricProduct extends Product{
    public ElectricProduct(String name, int productID) {
        super(name, productID);
    }

    @Override
    public String toString() {
        return "ElectricProduct{" +
                "name='" + name + '\'' +
                ", productID=" + productID +
                '}';
    }
}
