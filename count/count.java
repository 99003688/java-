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
if (arr[i]<0){
    System.out.println(" invalid input");}
}
System.out.println(" the number you entered are: ");
for(int i =0; i<n;i++){
    System.out.println(arr[i]);
}
System.out.println("Enter the element you want to know the count");
int num=sc.nextInt();  

for (int i=0;i<n;i++){
       if(arr[i]==num && arr[i]>0)
       count++;
  
}
if(count==0 ){
    System.out.println(" The number is not present in the array you have entered.");
}
else{
System.out.println("the count of the number " +num +" is : " + count);
}
    }
}