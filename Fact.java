import java.util.*;
public class Fact {

    public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number for factorial");
      int a=sc.nextInt();
      int m=a;
      int fact=1;
      int ind;
      int count=0;
      int arr[]=new int[20];
    
      if (a>0){
            while(a>0){
              ind=a%10;

               for(int i=1; i<=a;i++){
             fact=fact*i;
           
      }
          arr[count]=fact;
          count ++;
          a=a/10;

    }
    for (int i=count-1; i>=0;i--)
    System.out.println(arr[i]);
  }
      
      else{
        System.out.println(" the input number is very small");
    }
}
}

