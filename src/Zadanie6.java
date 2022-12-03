import java.util.Scanner;
import java.util.Random;

class Zadanie6 {
    public static void main(String[] args) {

        System.out.println("Wprowadz 2 liczby rzeczywiste");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if( a > b){
            double c = a;
            a = b;
            b = c;
        }
        Random random = new Random();
        double rangeMin = a;
        double rangeMax = b;
        double v = random.nextDouble(rangeMin + (rangeMax - rangeMin));
        double u = random.nextDouble(rangeMin + (rangeMax - rangeMin));
        double n = random.nextDouble(rangeMin + (rangeMax - rangeMin));


        //Zaokraglenie
        double x = Math.round(v*100);
        x = x/100;
        double y = Math.round(u*100);
        y = y/100;
        double z = Math.round(n*100);
        z = z/100;


        System.out.println("Wybrany przedzial: " +"["+a+", "+b+"]");
        System.out.println("Wartosci generowane losowo: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        if(x>y && x>z){
            if(y>z){
                System.out.println("Gdzie: "+x+" > "+y+" > "+z);
            } else {
                System.out.println("Gdzie: "+x+" > "+z+" > "+y);
            }
        } else {
            if(y>x && y>z){
                if(x>z){
                    System.out.println("Gdzie: "+y+" > "+x+" > "+z);
                } else {
                    System.out.println("Gdzie: "+y+" > "+z+" > "+x);
                }
            } else {
                if(z>x && z>y){
                    if(x>y){
                        System.out.println("Gdzie: "+z+" > "+x+" > "+y);
                    } else {
                        System.out.println("Gdzie: "+z+" > "+y+" > "+x);
                    }
                }
            }
        }
    }
}


