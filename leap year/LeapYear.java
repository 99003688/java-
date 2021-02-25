import java.util.Scanner;
 class LeapYear{
    public static void main(String args[]){
                 

                 Scanner sc= new Scanner(System.in);
                 System.out.println("enter the year");
                 int a= sc.nextInt();
                
                 if(a>0){
                    if(a%400==0  || a%4==0  || a%100!=0){
                       int c=1;
                       System.out.println(c +" the entered year is leap year");
                    }
                    else{
                      System.out.println("The entered year is not a leap year");      
                    }
                 } 
                 else {
                    int b=-1;
                    System.out.println(b + " please enter a valid input ");

                  }
   }
}              
               
                    