import java.util.*;
public class Fact {

    public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number for factorial");
      int a=sc.nextInt();
      int m=a;
      int fact=1;
      if (a>0){
      for(int i=1; i<=a;i++){
             
               fact=fact*i;
           System.out.println(fact);
      }
    }
      
      else{
        System.out.println(" the input number is very small");
    }
}
}

