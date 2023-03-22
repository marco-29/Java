public class While{
  public static void main(String args[]){
 
   int i = 1;

   while(i < 10){
     if(i == 9){
     System.out.print(i);
     i+=2;
     }else{
       System.out.print(i + ", ");
       i+=2;
     }
  }
 }
}