public class EstRepe{
  public static void main(String args[]){
 
   int i = 0;

   System.out.println("Esta es una serio con for: ");
   for(i = 1; i <= 10; i++){
     if(i < 10){
       System.out.print(i + ", ");
     }else{
       System.out.print(i);
     }
   }
   i = 1;
   System.out.println("");
   
   System.out.println("Esta serie es con while: ");
   while(i <= 10){
     if(i < 10){
       System.out.print(i + ", ");
     }else{
       System.out.print(i);
     }
     i++;
   }
   i = 1;
   System.out.println("");
   
   System.out.println("Esta es una serie con do while: ");
   do{
     if(i < 10){
       System.out.print(i + ", ");
     }else{
       System.out.print(i);
     }
     i++;
   }while(i <= 10);
 }
}