package Oefening1;

public class Leopard extends Animal {
    private String food;

    public Leopard() {
    }

    public Leopard(String food) {
        this.food = food;
    }

    public Leopard(String food, String naam, String geluid) {
        super(naam, geluid);
        this.food = food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;

    }
}
