import java.util.Scanner;

public class SumaTe{
  public static void main(String args[]){
   
   Scanner morita = new Scanner(System.in); //variable morita para guardar datos de teclado.
   String nombre = "";
   int num1 = 0, num2 = 0, res= 0;

   System.out.println("¿Cual es tu nombre? ");//pide nombre al usuario
   nombre = morita.nextLine();
   
   System.out.println("Dame el primer numero:");//pide primer numero.
   num1 = morita.nextInt();

   System.out.println("Dame el segundo numero:");//pide sgundo numero.
   num2= morita.nextInt();

   res = num1 + num2;//realiza suma

   System.out.println("Hola " + nombre + " el resultado de su suma es: " + res);//imprime nombre de usuario y resultado de la suma.
 }
}