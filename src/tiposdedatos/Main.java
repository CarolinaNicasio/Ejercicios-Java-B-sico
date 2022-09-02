package tiposdedatos;

public class Main {
    public static void main(String[] args) {
        // enteros
        byte number1 = 10;
        short number2 = 20;
        int number3 = 40;
        long number4 = 2345678;
         System.out.println( "Enteros=" + " " +"byte:" + number1 +" "+ "short:" + number2 +" " +  "int:"+ number3 +" " + "long:" + number4 );
        // punto flotante
        float decimal1 = 3.3f;
        double decimal2 = 20.3d;
        System.out.println( "Punto flotante=" + " " + "float:" + decimal1 + " " + "double:" + decimal2);

        //caracter
        char caracter1 = 'C';
        System.out.println( "Caracter=" + " " + "char:" + caracter1);

        // booleanos
        boolean falso = false;
        boolean verdadero = true;
           System.out.println( "Booleanos=" + " "+ falso + ", " +verdadero);
        // cadenas de texto
        String ciudad = "Mendoza";
        String pais = "Argentina";
        System.out.println( "Cadenas de texto=" + " " + "String:" + ciudad + ", " + pais);
        // tipos envoltorios
         Integer inter1 = null;
         long lon1 = 5L;
         System.out.println( "Tipos envoltorios=" + " " + "Interger:"+ inter1 + ","+"Long:" + lon1);
    }
}