package Project1;

import java.util.Random;

public class ProductFactory {
    ProductSorter productSorter;
    private String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }
    public void createProducts(int amount){//Deze methode gaat een aantal producten aanmaken
        Random random = new Random();//- Gebruik de Random klasse om te bepalen welk soort object gemaakt wordt
        for (int i = 0; i<amount; i++){
            int productType = random.nextInt(3);// (vb: 0 – food product, 1 – health product, 2 - electric product)
//Gebruik de Random klasse om te bepalen wat de naam zal zijn (het moet een naam zijn uit de correcte array.
            int  productID = random.nextInt(150);//De productID zal een random nummer zijn tussen 0 en 150
            String productName;
            if (productType == 0){
                productName = foodProducts[random.nextInt(foodProducts.length)];
            }else if (productType == 1){
                productName = healthProducts[random.nextInt(healthProducts.length)];
            }else {
                productName = electricProducts[random.nextInt(electricProducts.length)];
            }
            //creat nieuw product en stuur het naar product sorter
            Product product = new Product(productName, productID);
            productSorter.sortProduct(product);

        }

    }

}
