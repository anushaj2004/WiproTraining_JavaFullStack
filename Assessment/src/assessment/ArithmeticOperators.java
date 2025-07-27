package assessment;
import java.util.Scanner;
public class ArithmeticOperators {
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter first number:");
	  int a=sc.nextInt();
	  System.out.println("enter Second number:");
	  int b=sc.nextInt();
	  System.out.println("a+b ="+(a+b));
	  System.out.println("a-b ="+(a-b));
	  System.out.println("a*b ="+(a*b));
	  System.out.println("a/b ="+(a/b));
	  System.out.println("a%b ="+(a%b));
  }
}
