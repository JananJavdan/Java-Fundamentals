package be.intecbrussel.Les2;

public class StringBuilderExample {
    public static void main(String[] args) {

//declaratie
        StringBuilder str = new StringBuilder();
//initialisatie methode append()
        str.append("helloworld!");
        System.out.println(str);
//methode insert()
        StringBuilder aa = new StringBuilder("walter,milk");
        aa.insert(6,",edwin");
        System.out.println(aa);
//methode toString
    StringBuilder bb = new StringBuilder("hello world");
    String txt = bb.toString();
        System.out.println(txt);
//methode reverse
        StringBuilder cc = new StringBuilder("hello world!");
        System.out.println(cc.reverse());
    }


}
