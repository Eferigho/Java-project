import java.util.Scanner;
public class EMathematicCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     Factoriall facto = new Factoriall();
    
     System.out.println("Enter any number to calculate for e ");
     int e = input.nextInt();
     
     double n ;
    
     while(e > 0) {
    	 int x = e;
    	 while(x > 0) {
       	  
       	  facto.setFactorial(x); 
            x--;
        }
    	System.out.println("The factorial is : "+facto.getFactorial());
         n = facto.getFactorial();
         n = 1/n;
         System.out.println("The expression value is : "+n);
         facto.setFact();
    	e--;
     }
         
	}

}
