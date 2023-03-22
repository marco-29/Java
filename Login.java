import java.util.Scanner;

public class Login{
  public static void main(String args[]){
 
   Scanner morita = new Scanner(System.in);
   String usuario1 = "", usuario2 = "", contra1 = "", contra2= "", res = "";
   
   System.out.println("PARA REGISTRARSE");
   System.out.print("Ingrese su usuario nuevo: ");
   usuario1 = morita.nextLine();
   System.out.print("Ingrese su contraseña nueva: ");
   contra1 = morita.nextLine();
   System.out.println("");

   System.out.println("******************");
   System.out.println("*REGISTRO EXITOSO*");
   System.out.println("******************");

   System.out.print("¿Desea iniciar sesion ahora? ");
   res = morita.nextLine();

   if(res.equalsIgnoreCase("SI")){
     System.out.print("Ingrese usuario: ");
     usuario2 = morita.nextLine();
     System.out.print("Ingrese contraseña: ");
     contra2 = morita.nextLine();
     
     if((usuario1.equals(usuario2)) && (contra1.equals(contra2))){
       System.out.println("Inicio de sesion correcto");
     }else{
       System.out.println("Error en inicio de sesion, usuario o contraseña incorrecta");
     }
   }else{
     System.out.println("TENGA UN EXCELENTE DIA, VUELVA PRONTO");
   }
 }
}