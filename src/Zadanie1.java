class Zadanie1 {
    public static void main(String[] args){

        boolean czyPada = false;
        boolean czySwieciSlonce = false;

        if(czyPada == true) {
            if(czySwieciSlonce == true){
                System.out.println("Tecza");
            }
            else{
                System.out.println("Plucha");
            }
        } else {
            if (czySwieciSlonce == true){
                System.out.println("Slonecznie");
            } else {
                System.out.println("Pochmurno");
            }
        }


    }
}
