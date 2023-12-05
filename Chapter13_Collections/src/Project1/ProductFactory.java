package Project1;

import java.util.Random;

public class ProductFactory {
    private ProductSorter productSorter;
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
            String productName;
            int productID = random.nextInt(151);//De productID zal een random nummer zijn tussen 0 en 150
            switch (productType){
                case 0://genereert een willekeurig getal tussen 0 (inclusief) en de lengte van de array foodProducts
                    productName = foodProducts[random.nextInt(foodProducts.length)];
                    productSorter.sortProduct(new FoodProduct(productName, productID));
                    break;
                case 1:
                    productName = healthProducts[random.nextInt(healthProducts.length)];
                    productSorter.sortProduct(new HealthProduct(productName, productID));
                    break;
                case 2:
                    productName = electricProducts[random.nextInt(electricProducts.length)];
                    productSorter.sortProduct(new ElectricProduct(productName, productID));
                    break;
                default:
                    productName = "";//de waarde van productName ingesteld op een lege string
                    break;

            }

        }

    }
    // De default : als geen van de specifieke case-waarden overeenkomt
    // met de waarde van productType, wordt de code binnen de default-clausule uitgevoerd.

}
