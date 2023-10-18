package Les1;

public class Car extends Vehicle{
        private String brandName = "Audi";


        public String getBrandName(){
            return brandName;
        }

        public void setBrandName(String brandName){
            this.brandName = brandName;
        }
        public void honk(){
            System.out.println("subklas");
        }
        public void sound(){
            super.honk();
        }
        public Car(){
            super();
            System.out.println("Car class constructor");
        }
    }


