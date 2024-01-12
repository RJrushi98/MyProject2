package frameWorkStudy_Coverfox;

public class CoverfoxStudy {

	public static void main(String[] args) 
	{

	   
	        int n = 10; // Change this value to generate the series up to a different number

	        System.out.println("Fibonacci series up to " + n + ":");
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	        
	    }

	    public static int fibonacci(int num) {
	        if (num <= 1) {
	            return num;
	        } else {
	            return fibonacci(num - 1) + fibonacci(num - 2);
	        }
	    
	
		

	}

}
