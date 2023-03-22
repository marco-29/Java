public class Calculadora{
  public static void main(String args[]){
    
    int Operacion = 3; //variable que guradara la opcion del usuario para realizar operacion 
    int num1 = 8;     //variable que guardara el primer numero
    int num2 = 4;    //variable que guardara el segundo numero
    int res = 0;    //variable donde se guardara el resultado de la operacion a elgir 
    
    if(Operacion == 1){ 
      res = num1 + num2; //operacion 1(Suma)
      System.out.println("El resultado de la suma es: " + res);
    }else if(Operacion == 2){
      res = num1 - num2; //operacion 2(Resta)
      System.out.println("El resultado de la resta es: " + res);
    }else if(Operacion == 3){
      res = num1 * num2; //operacion 3(Multiplicacion)
      System.out.println("El resultado de la multiplicacion es: " + res);
    }else if(Operacion == 4){
      res = num1 / num2; //operacion 4(Division)
      System.out.println("El resultado de la division es: " + res);
    }else{
      System.out.println("La operacion que eligio no existe en nuestro menu, disculpe"); //imprime mensaje de error ya que no exiten mas operaciones
    }
  }
}