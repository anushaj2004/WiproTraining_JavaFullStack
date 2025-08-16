package assessment;
import java.util.Scanner;

class Add		
{
	int Add(final int a,final int b)
	{
	return (a+b);
	}
	int sub(int a ,int b)
	{
		return (a-b);
	}
}
public class Arithmetic {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter first number");
			int a=sc.nextInt();
			System.out.println("enter second number");
			int b=sc.nextInt();
			Add ac= new Add();
			int res=ac.Add(a,b);
			int sum=ac.sub(a,b);
			System.out.println("sum=" + res);
			System.out.println("sum="+sum);
		}
	
	}

}
