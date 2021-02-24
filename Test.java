import java.util.*;
public class Test {

    public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
      System.out.println(" enter first number");
      int a=sc.nextInt();
      System.out.println(" enter second number");
      int b= sc.nextInt();
      System.out.println(" enter number from 1 to 4 to perform operations");
      int c= sc.nextInt();
    if(c>0 && a>0 && b>0){
      
         switch (c) {
            case 1:
              int x=a+b; 
             System.out.println("the sum of first and second is : "+  x);
             break;
            case 2:
              int d = a-b;
             System.out.println("the difference of first and second is : "+ d);
             break;
            case 3:
             int e= a*b;
             System.out.println("the product of first and second is : "+ e);
             break;
            case 4:
             int f= a/b;
             System.out.println("the quotient arrived from dividing first and second is : "+ f);
             break;
         }
        }
        else{
            System.out.println(" invalid input please enter the valid number ");

        }

}
}