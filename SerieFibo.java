public class SerieFibo{
  public static void main(String args[]){
 
   int x = 1;
   int z = 1;
   int y = 0;
   int i = 1;
   System.out.println("Esta serie es con un for: ");
   System.out.print("0, 1, 1, ");

   for(i = 1; i <= 7; i++){
     y = x + z;
     z = x;
     x = y;
     System.out.print(y + ", ");
   }

   System.out.println("");
   x = 1;
   z = 1;
   y = 0;
   i = 1;
   
   System.out.println("Esta serie es con un While: ");
   System.out.print("0, 1, 1, ");

   while(i <= 7){
     y = x + z;
     z = x;
     x = y;
     System.out.print(y + ", ");
     i++;
   }
   
   System.out.println("");
   x = 1;
   z = 1;
   y = 0;
   i = 1;

   System.out.println("Esta serie es con un Do-While: ");
   System.out.print("0, 1, 1, ");
   
   do{
     y = x + z;
     z = x;
     x = y;
     System.out.print(y + ", ");
     i++;
   }while(i <= 7);
 }
}