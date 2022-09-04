package Funciones;
 import java.util.Scanner;
public class precioIVA {
 public static double IVAincluido (double price){
   double IVA;
   IVA = price * 0.21;
   return IVA;
 }
 public static void main (String [] args)
 {
  Scanner lector = new Scanner (System.in);
  double precioSinIVA, IVA;
  System.out.println("Ingrese PRECIO SIN IVA incluido:");
     precioSinIVA = lector.nextDouble();
  IVA = IVAincluido (precioSinIVA);
 System.out.println ( "TOTAL A PAGAR (IVA incluido):" + (precioSinIVA + IVA));
 }
}
