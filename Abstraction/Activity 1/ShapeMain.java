import java.util.Scanner;
public class ShapeMain {

	public static void main(String[] args) {
		int value = 0;
		Scanner sc= new Scanner(System.in);
		
        System.out.println(" enter the shape you want to evaluate ");
        String shape= sc.next();
        if(shape.equalsIgnoreCase("circle") ){
        	
        	System.out.println(" Enter the radius ");
        	int rad= sc.nextInt();
        	Circle area= new Circle();
        	area.calculateArea(rad);
        	
        	
       System.out.println("Area of circle is: "+ area.calculateArea(rad) );
        	
        	
        	
        	
        	
        }
        if(shape=="Square") {
        	Square area=new Square();
        	area.calculateArea(value);
        }
        
        sc.close();
	}

}
