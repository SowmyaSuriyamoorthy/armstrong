import java.util.Scanner;

public class armstrong {
	private static int result;
	private static Scanner s;
	private static int r;

	public static void main(String[] args) {
		int number = 0,originalNumber,remainder ;
		result = 0;
		int n = 0;
        System.out.println("Enter an integer: ");
	    s = new Scanner(System.in);
	    r = s.nextInt();
	   
	     originalNumber = number;
	    
	    while (originalNumber != 0)
	    {
	        originalNumber /= 10;
	        ++n;
	    }

	    originalNumber = number;

	    while (originalNumber != 0)
	    {
	        remainder = originalNumber%10;
	        result += pow(remainder, n);
	        originalNumber /= 10;
	    }
	    if(result == number)
	        System.out.print("armstrong number");
	    else
	        System.out.print("not armstrong number");

	}

	private static int pow(int remainder, int n)
         {
 		return 0;
	}
	}
