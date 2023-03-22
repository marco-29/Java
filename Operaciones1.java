import java.util.Scanner;

public class Operaciones1{
  public static void main(String args[]){
 
   Scanner morita = new Scanner(System.in);
   int num1 = 0, num2 = 0, res = 0;
   int parametro = 0;

   System.out.println("-------------------------------------------");
   System.out.println("- Buen dia, gracias por preferir CALCUNUM -");
   System.out.println("-------------------------------------------");

   System.out.println("Por favor ingrese el primer numero para la operacion: ");
   num1 = morita.nextInt();

   System.out.println("Por favor ingrese el segundo numero para la operacion: ");
   num2 = morita.nextInt();

   System.out.println("PERFECTO, !MUCHAS GRACIAS¡");
   System.out.println("Ahora por favor ingrese la operacion que desea realizar con el numero correspondiente: ");
   System.out.println("---------------------");
   System.out.println("- 1. suma           -");
   System.out.println("- 2. resta          -");
   System.out.println("- 3. multiplicacion -");
   System.out.println("- 4. division       -");
   System.out.println("---------------------");
   System.out.println("Ingrese opcion por favor: ");
   parametro = morita.nextInt();
   
   switch(parametro){
   
    case 1: res = num1 + num2;
            System.out.println("El resultado de la suma es: " + res);
            break; //freno 
   
    case 2: res = num1 - num2;
	    System.out.println("El resultado de la resta es: " + res);
	    break;

    case 3: res = num1 * num2;
	    System.out.println("El resultado de la multiplicacion es: " + res);
  	    break;

    case 4: res = num1 / num2;
  	    System.out.println("El resultado de la division es: " + res);
   	    break;
   
    default: System.out.println("Error, la opcion ingresada no existe");
  	     break;
   }
   
 }
}