public class Operaciones{
  public static void main(String args[]){
   
   int num1 = 4;
   int num2 = 4;
   int resu = 0;

   resu = num1 + num2 / 2;
   System.out.println("El resultado correcto es: " + resu);

   resu = (num1 + num2) / 2;
   System.out.println("El resultado incorrecto es: " + resu);
 }
}