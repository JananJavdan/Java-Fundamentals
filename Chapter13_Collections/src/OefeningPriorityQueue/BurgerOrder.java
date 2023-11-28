package OefeningPriorityQueue;

public class BurgerOrder implements Comparable<BurgerOrder>{
    String naam;
    int number;

    public BurgerOrder(String naam, int number) {
        this.naam = naam;
        this.number = number;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number+ " " +naam;
    }
//belangrijk
    @Override
    public int compareTo(BurgerOrder o) {
        return this.getNumber() - o.getNumber();
    }
}
