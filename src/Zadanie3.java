import java.util.Scanner;

class Zadanie3 {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj login");
        String login = scanner.nextLine();


        if (login.equals("admin")){
            System.out.println("Podaj haslo");
            String haslo = scanner.nextLine();
            if (haslo.equals("123")){
                System.out.println("Zalogowano pomyslnie");
            } else {
                System.out.println("Bledne haslo");
            }
        }else {
            System.out.println("Bledny login");
        }


    }










}
