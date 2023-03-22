public class Promedio{
  public static void main(String args[]){

   int Mate = 5;
   int Bio = 5;
   int Quimi = 5;
   float Prom = 0;

   Prom = (Mate + Bio + Quimi)/3;

   if(Prom >= 6){
     System.out.println("El alumno aprobo con una calificacion de: " + Prom);
   }else{
     System.out.println("El alumno no aprobo con una calificacion de: " + Prom);
   }
 }
}