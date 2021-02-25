import java.util.*;
import java.lang.*;
class Concat{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
       // char[] ch= str.toCharArray();
        System.out.print("Enter another string: ");
        String str1= sc.nextLine();
       // char[] ch1= str1.toCharArray();
        System.out.println("after concatinating the strings:" + str.toUpperCase().charAt(0)+str.substring(1,str.length())+" "+ str1.toUpperCase());

    }
}