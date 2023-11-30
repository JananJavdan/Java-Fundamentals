package Project1;

public class FoodProduct extends Product{
    public FoodProduct(String name, int productID) {
        super(name, productID);
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "name='" + name + '\'' +
                ", productID=" + productID +
                '}';
    }
}
