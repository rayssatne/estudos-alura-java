import java.util.ArrayList;
import java.util.List;

public class Comparar {

    public static void main(String[] args) {

        List<String> insiders = new ArrayList<>();
        List<String> insiders2 = new ArrayList<>();
        List<String> estaContido = new ArrayList<>();

        insiders.add("Ray");
        insiders.add("Túlio");
        insiders.add("Orlando");

        insiders2.add("Pablo");
        insiders2.add("Patrick");
        insiders2.add("Tay");
        insiders2.add("Orlando");
        insiders2.add("Ray");
        insiders2.add("Túlio");

        insiders
                .forEach(insider -> {
                    if(insiders2.contains(insider)) {
                        System.out.println(insider + " está contido na lista 2 dos insiders");
                    }else {
                        System.out.println(insider + " não está contido na lista 2 dos insiders");
                    }
                });

//        for(String insider : insiders) {
//            if(insiders2.contains(insider)) {
//                System.out.println(insider + " está contido na lista 2 dos insiders");
//            }else {
//                System.out.println(insider + " não está contido na lista 2 dos insiders");
//            }
//        }
    }
}
