import java.util.Scanner;
import java.util.Random;

class Zadanie2 {
    public static void main(String[] args){


        System.out.println("Podaj liczbe w przedziale < 1 ; 6 >");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    scanner.close();

    Random random = new Random();
    int y = random.nextInt(5) +1;

    if ( x == y ){
        System.out.println("YOU DIED");
    } else {
        System.out.println("Lucky One!");
    }




    }
}
