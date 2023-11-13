package Opdracht1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp1 {
    public static void main(String[] args) {
        List<String> names = new  ArrayList<>();//list van string maken

        names.add("astronautics");
        names.add("Intellijey");
        names.add("Correct");
        names.add("Superclass");
        names.add("Computer");
        names.add("Ontwikkellar");
        names.add("Opdracht");
        names.add("Uppercase");
        names.add("MethodeStream");

        Opdracht1 opdracht1 = new Opdracht1();//object maken

        //List<String> toUpperCaseList = opdracht1.toUpperCase(names);//de methode aanroepen
        System.out.println("to upper case:"+opdracht1.toUpperCase(names));

       // List<String> filteredListA = opdracht1.filterA(names);
        System.out.println("filter A:"+opdracht1.filterA(names));

       // List<String> filteredListB = opdracht1.filterB(names);
        System.out.println("filter B:"+opdracht1.filterB(names));

       // List<String> filteredListC = opdracht1.filterC(names);
        System.out.println("filter C:"+opdracht1.filterC(names));

       // String filteredStringD = opdracht1.filterD(names);
        System.out.println("filter string D:"+opdracht1.filterD(names));

        List<String> filteredStringE = Collections.singletonList(opdracht1.filterE(names));
        System.out.println("filter string E:"+filteredStringE);

        List<String> filteredStringF = Collections.singletonList(opdracht1.filterF(names));
        System.out.println("filter string F:"+filteredStringF);

        //String filteredStringG = opdracht1.filterG(names);
        System.out.println("filter string G:"+opdracht1.filterG(names));

       // String filteredStringH = opdracht1.filterH(names);
        System.out.println("filter string H:"+opdracht1.filterH(names));

        //String filteredStringI = opdracht1.filterI(names);
        System.out.println("filter string I:"+opdracht1.filterI(names));
    }

}
