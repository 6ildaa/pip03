import java.util.Random;
import java.util.Scanner;


class Zadanie8 {
    public static void main(String[] args) {

        System.out.println("Witamy w kantorze!");
        System.out.println("Wybierz walute:");
        System.out.println("1 - PLN");
        System.out.println("2 - JPY");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        if(x == 1){
            System.out.println("Wprowadz kwote:");
            double y = scanner.nextDouble();
            double z = y*30.28;
            System.out.println(y+" zl => "+z+" ¥");

        } else {
            if(x == 2){
                System.out.println("Wprowadz kwote:");
                double y = scanner.nextDouble();
                double z = y*0.03;
                System.out.println(y+" ¥ => "+z+" zl");
            }
        }



    }




}


