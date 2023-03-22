import java.util.Scanner;

public class Nombres{
  public static void main(String args[]){
 
   Scanner morita = new Scanner(System.in);
   String nombre1 = "", nombre2 = "";
   
   System.out.print("Ingrese el nombre 1: ");
   nombre1 = morita.nextLine();

   System.out.print("Ingrese el nombre 2: ");
   nombre2 = morita.nextLine();

   if(nombre1.equals(nombre2)){
   System.out.println("Los nombres son identicos");
   }else{
   System.out.println("Los nombres no son identicos");
   }
 }
}