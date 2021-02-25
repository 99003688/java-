import java.util.Scanner;
class Cricket{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n=sc.nextInt();
        int arr[]= new int [n];
        System.out.println("enter the elments in array");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements you entered are");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        System.out.println("enter the score above which you want to know ");
        int s=sc.nextInt();
        System.out.println("cricketer who scored more than above score");
        for (int i=0; i <n; i++){
            if(arr[i]>s){
                System.out.println(arr[i-1]);
            }    
            
        }
        
    }
    
}
