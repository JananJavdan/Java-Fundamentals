package Les2Example.OefeningLes2;

public class MainList {
    public static void main(String[] args) {
        List integerList = new List();

        integerList.addNumber(5);
        integerList.addNumber(10);
        integerList.addNumber(15);

        integerList.printList();
        integerList.printSum();
        integerList.printAverage();
    }
}
