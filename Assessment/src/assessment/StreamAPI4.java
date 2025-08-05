package assessment;
import java.util.*;
import java.util.stream.*;

public class StreamAPI4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(6);
//foreach():	al.stream().filter(x->x%2==0).forEach(x->System.out.print(x+" "));
//Reduce():		int sum=al.stream().reduce(0, Integer :: sum);
//		        System.out.print(sum);
//Count():		long c=al.stream().filter(x-> x%2==0).count();
//		        System.out.print(c);
//max():		int m=al.stream().max((x,y)-> x>y ? 1:-1).get();
//		        System.out.println(m);
/*min():*/		int m=al.stream().min((x,y)-> x>y ? 1:-1).get();
		System.out.println(m);
	}

}
