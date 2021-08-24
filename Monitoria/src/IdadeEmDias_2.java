import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class IdadeEmDias_2 {
    public static void main(String[] args) {

      //  Scanner scan = new Scanner(System.in);

        int[] data = new int[3];
        for (int i = 0; i < 5; i++) {
            System.out.print("Insira a data : Y/M/D");
       //     data[i] = scan.nextInt();
        }

        LocalDate localDateInit = LocalDate.of(1998,6,6);
        LocalDate localDateBefore = LocalDate.now();

        System.out.println(localDateInit.isAfter(localDateBefore));
        System.out.println(localDateInit.isBefore(localDateBefore));
        System.out.println(localDateInit.isEqual(localDateBefore));

        Period periodo = Period.between(localDateInit, localDateBefore);
        System.out.println(periodo.getYears() + " Anos " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias");
        System.out.println("Apenas meses: " + periodo.toTotalMonths());

    }
}

