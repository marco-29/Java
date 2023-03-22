import java.util.Scanner;

public class Vacaciones{
  public static void main(String args[]){
 
   Scanner morita = new Scanner(System.in);
   String nombre = "";
   int clave = 0, anos = 0;

   System.out.println("*********************************************************");
   System.out.println("* Bienvenido al sistema vacacional de Coca-Cola Company *");
   System.out.println("*********************************************************");

   System.out.println("¿Cual es el nombre del trabajador? ");
   nombre = morita.nextLine();

   System.out.println("¿Cual es la clave del trabajador " + nombre + "?");
   clave = morita.nextInt();

   if(clave == 1){
     System.out.println("*******************************************************************");
     System.out.println("* " + nombre + " pertenece al departamento de Atencion al cliente *");
     System.out.println("*******************************************************************");

     System.out.println("¿Cual es la antiguedad del trabajador " + nombre + "? ");
     anos = morita.nextInt();

     if(anos == 1){
       System.out.println("*************************************************************************");
       System.out.println("* " + nombre + " tiene derecho a 6 dias de unas maravillosas vacaciones *");
       System.out.println("*************************************************************************");
     }else if(anos >= 2 && anos <=6){
       System.out.println("**************************************************************************");
       System.out.println("* " + nombre + " tiene derecho a 14 dias de unas maravillosas vacaciones *");
       System.out.println("**************************************************************************");
     }else if(anos == 7){
       System.out.println("**************************************************************************");
       System.out.println("* " + nombre + " tiene derecho a 20 dias de unas maravillosas vacaciones *");
       System.out.println("**************************************************************************");   
     }else{
       System.out.println("*******************************************************************");
       System.out.println("* " + nombre + " aun no tiene derecho a vacaciones                *");
       System.out.println("*******************************************************************");
     }
   }else if(clave == 2){
     System.out.println("**********************************************************");
     System.out.println("* " + nombre + " Pertenece al departamento de Logistica  *");
     System.out.println("**********************************************************");     

     System.out.println("¿Cual es la antiguedad del trabajador " + nombre + "? ");
     anos = morita.nextInt();


     if(anos == 1){
       System.out.println("*******************************************************************");
       System.out.println(nombre + " tiene derecho a 7 dias de unas maravillosas vacaciones");
       System.out.println("*******************************************************************");
     }else if(anos >= 2 && anos <=6){
       System.out.println("*******************************************************************");
       System.out.println(nombre + " tiene derecho a 15 dias de unas maravillosas vacaciones");
       System.out.println("*******************************************************************");
     }else if(anos == 7){
       System.out.println("*******************************************************************");
       System.out.println(nombre + " tiene derecho a 22 dias de unas maravillosas vacaciones");
       System.out.println("*******************************************************************");   
     }else{
       System.out.println("*******************************************************************");
       System.out.println(nombre + " aun no tiene derecho a vacaciones.");
       System.out.println("*******************************************************************");
     }     
   }else if(clave == 3){
     System.out.println("*************************************");
     System.out.println("Gerencia");
     System.out.println("*************************************");     

     System.out.println("¿Cual es la antiguedad del trabajador " + nombre + "? ");
     anos = morita.nextInt();


     if(anos == 1){
       System.out.println("*******************************************************************");
       System.out.println(nombre + " tiene derecho a 10 dias de unas maravillosas vacaciones");
       System.out.println("*******************************************************************");
     }else if(anos >= 2 && anos <=6){
       System.out.println("*******************************************************************");
       System.out.println(nombre + " tiene derecho a 20 dias de unas maravillosas vacaciones");
       System.out.println("*******************************************************************");
     }else if(anos == 7){
       System.out.println("*******************************************************************");
       System.out.println(nombre + " tiene derecho a 30 dias de unas maravillosas vacaciones");
       System.out.println("*******************************************************************");   
     }else{
       System.out.println("*******************************************************************");
       System.out.println(nombre + " aun no tiene derecho a vacaciones.");
       System.out.println("*******************************************************************");
     }      
   }else 
     System.out.println("ERROR, LA CLAVE QUE INGRESO AUN NO EXITE, DISCULPE");       
 }
}