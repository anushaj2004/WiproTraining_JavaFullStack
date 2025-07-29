package assessment;
import java.util.Scanner;
public class ConditionStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		if (a>0)
		{
			System.out.println("number is positive");
		}
		else if(a<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is zero");
		}
		sc.close();

	}

}
