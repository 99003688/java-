import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) 
    {
        System.out.println("Employee Details");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name");
        String a = sc.nextLine();
        

        System.out.println("Enter the address");
        String b = sc.nextLine();
        
        System.out.println("Enter the mobile");
        String c = sc.nextLine();

        Employee e=new Employee();
        e.setName(a);
        e.setAddress(b);
        e.setNumber(c);
        System.out.println("Name :"+e.getName());
        System.out.println("Address :"+e.getAddress());
        System.out.println("Mobile :"+e.getNumber());   

    }
}