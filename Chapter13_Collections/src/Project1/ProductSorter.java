package Project1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductSorter {
   private List<Product> products;
   private List<FoodProduct> foodProducts;
   private List<HealthProduct> healthProducts;
   private  List<ElectricProduct> electricProducts;

   public ProductSorter(){
       products = new ArrayList<>();
       foodProducts = new ArrayList<>();
       healthProducts = new ArrayList<>();
       electricProducts = new ArrayList<>();
   }

    public List<Product> getProducts() {
        return products;
    }

    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public List<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }

    // We willen ook een methode hebben om het aantal producten terug te geven
    public boolean sortProduct(Product product){
       products.add(product);

       if (product instanceof FoodProduct){
           foodProducts.add((FoodProduct)product);
           foodProducts.sort(Comparator.comparing(Product::getProductID));
       } else if (product instanceof  HealthProduct) {
           healthProducts.add((HealthProduct) product);
           healthProducts.sort(Comparator.comparing(Product::getProductID));
       } else if (product instanceof ElectricProduct) {
           electricProducts.add((ElectricProduct) product);
           electricProducts.sort(Comparator.comparing(Product::getProductID));
       }
       return true;

    }
    //De methode gaat een product toevoegen aan de lijst van producten, maar ook in de correcte sub list.
    //Een food product zal in de lijst van producten EN in de lijst van food producten komen.
}
