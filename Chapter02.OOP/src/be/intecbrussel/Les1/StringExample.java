package be.intecbrussel.Les1;

public class StringExample {
    public static void main(String[] args) {
        String name = "janan";
        System.out.println(name.toUpperCase());

        String name2 = "JANAN";
        System.out.println(name2.toLowerCase());

        String str = "hello world";
        System.out.println(str.length());

        String str1 ="";
        System.out.println(str1.isBlank());

        String str2 = "hello world";
        System.out.println(str2.replace('e','a'));

        String str3 = "hello world!";
        System.out.println(str3.replace('l','L'));

        String str4 =" hello world ";
        System.out.println(str4.stripLeading());

        String str5 = " hello world ";
        System.out.println(str5.stripTrailing());

        String str6 = "hello world";
        System.out.println(str6.indexOf("world"));

        String str7 = "hello world";
        System.out.println(str7.contains("world"));

        String str8 = "hello world";
        System.out.println(str8.substring(6, 10));
    }

}
