package Project1;

import Les2Oefening.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProductSorter {
   private LinkedList<Product> products = new LinkedList<>();
   private LinkedList<FoodProduct> foodProducts = new LinkedList<>();
   private LinkedList<HealthProduct> healthProducts = new LinkedList<>();
   private  LinkedList<ElectricProduct> electricProducts = new LinkedList<>();

    public LinkedList<Product> getProducts() {
        return products;
    }

    public LinkedList<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public LinkedList<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public LinkedList<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }
    // We willen ook een methode hebben om het aantal producten terug te geven
    public void sortProduct(Product product){

    }
    //De methode gaat een product toevoegen aan de lijst van producten, maar ook in de correcte sub list.
    //Een food product zal in de lijst van producten EN in de lijst van food producten komen.
}
