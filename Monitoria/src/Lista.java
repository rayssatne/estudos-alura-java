//Fazer e ordenar uma lista de Strings ou inteiros

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        List<String> insiders = new ArrayList<>();

        insiders.add("Rayssa");
        insiders.add("Túlio");
        insiders.add("Orlandinho s2");

        Collections.sort(insiders);
        System.out.println(insiders);


    }

}
