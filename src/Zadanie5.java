import java.util.Scanner;

class Zadanie5 {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    String method = scanner.next();
    scanner.close();

    int ADD = methodADD(x, y);
    int SUB = methodSUB(x, y);
    int DIV = methodDIV(x, y);
    int MUL = methodMUL(x, y);



    while(method.equals("ADD")) {
        System.out.println("Wynik " + absoluteValue(ADD));
        break;
    }

        while(method.equals("MUL")) {
            System.out.println("Wynik: "+ absoluteValue(MUL));
            break;
        }
        while(method.equals("DIV")) {
            System.out.println("Wynik: " + absoluteValue(DIV));
            break;
        }
        while(method.equals("SUB")) {
            System.out.println("Wynik: " + absoluteValue(SUB));
            break;
        }
        while(method.equals("MOD")) {
            System.out.println("Brak takiej operacji");
            break;
        }


    }

    public static int absoluteValue(int x){
    int c = 0;
        if (x >= 0){
            c = x;
    } else {
            c = -x;
    }
    return c;
    }



    public static int methodADD(int a, int b){
        int c = a + b;
        return c;
    }

    public static int methodSUB(int a, int b){
        int c = a - b;
        return c;
    }

    public static int methodDIV(int a, int b){
        int c = a / b;
        return c;
    }

    public static int methodMUL(int a, int b){
        int c = a * b;
        return c;
    }



    }



