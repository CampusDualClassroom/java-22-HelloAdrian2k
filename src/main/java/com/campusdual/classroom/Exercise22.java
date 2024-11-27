package com.campusdual.classroom;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        ArrayList<String> lista = new ArrayList<>();
        addInitialElementsToList(lista);
        return lista;
    }

    public static void printElementsAndIndex(List<String> customList) {
        System.out.println("\n" + customList.getClass().getSimpleName() + ": ");
        for (String e : customList) {
            int index = customList.indexOf(e);
            System.out.print(index != customList.size() - 1 ? index + " -> " + e + "\n" : index + " -> " + e);
        }
    }

    public static void addInitialElementsToList(List<String> l) {
        l.add("GKFFD");
        l.add("TNANA");
        l.add("MPMSL");
        l.add("PSWME");
        l.add("LZMLF");
        l.add("JYEBV");
        l.add("YELNT");
        l.add("JSNKR");
        l.add("JFESF");
        l.add("TMJLL");
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> lista = createArrayList(); //tambien valdría : ArrayList<String> lista = (ArrayList<String>) createArrayList();

        addElementToList(lista, "FIN");

        printElementsAndIndex(lista);
    }


}
