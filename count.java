import java.util.Scanner;
class Count{
    public static void main(String args[]){
         
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
 
int n=sc.nextInt();  
int count=0;
int[] arr = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
   
arr[i]=sc.nextInt();  
}
System.out.println(" the number you entered are: ");
for(int i =0; i<n;i++){
    System.out.println(arr[i]);
}
System.out.println("Enter the element you want to know the count");
int num=sc.nextInt();  
for (int i=0;i<n;i++){
       if(arr[i]==num)
       count++;
  
}
System.out.println("the count of the number is:" +num +" " + count);
    }
}