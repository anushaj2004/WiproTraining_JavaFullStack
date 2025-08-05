package assessment;
import java.util.*;
import java.util.stream.*;
public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<Integer>();
		al.add(3);
		al.add(5);
		al.add(-3);
//		List<Integer> li=al.stream().filter(x-> x%2==0).collect(Collectors.toList());
//		System.out.println("list:"+al);
//		System.out.println("filtered list:"+li);
//		
		List<Integer> li=al.stream().filter(x-> x<0).collect(Collectors.toList());
        System.out.println("list:"+al);
        System.out.println("filtered list:"+li);
		
		
	}

}
