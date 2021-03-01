import java.util.*;
public class Activity1{
    Scanner scan=new Scanner(System.in);
    int runs, balls;
    float runRate;
    public void input(){
        try{
            System.out.println("Enter Runs Scored: ");
            runs=scan.nextInt();
            System.out.println("Enter overs Delivered: ");
            balls=scan.nextInt();
        }
        catch(NumberFormatException e){
            System.out.println("Error Code: "+e);
            System.exit(0);
        }
    }

    public void compute(){
        runRate=runs/balls;
        System.out.println("Score is "+runs+" runs in "+balls+" balls with the Run Rate of "+runRate+" runs per over.");
    }

    public static void main(String[] args){
        Activity1 obj=new Activity1();
        obj.input();
        obj.compute();
    }
}

