import java.util.Scanner;public class Panecito{  public static void main(String args[]){     Scanner morita = new Scanner(System.in);   String res = "";    System.out.println("BIENVENIDO A PANECITO");      System.out.print("¿Desea ver el menu? ");   res = morita.nextLine();      if(res.equalsIgnoreCase("SI")){     System.out.println("******************************************");     System.out.println("*BIENVENIDO AL MENU DE PANECITO*");     System.out.println("******************************************");   }else{     System.out.println("VUELVA PRONTO");   } }}