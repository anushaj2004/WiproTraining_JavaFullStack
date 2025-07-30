package assessment;

public class AddLastTwoDigits {
	int addLastDigits(int input1, int input2)
	{
		input1=Math.abs(input2%100);
		input2=Math.abs(input2)%100;
		return ((input1)+(input2));
	}


	public static void main(String[] args) {
		AddLastTwoDigits ad=new AddLastTwoDigits();
			int res=ad.addLastDigits(-123,123);
		System.out.println(res);
		

	}

}
