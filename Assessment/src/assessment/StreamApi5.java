package assessment;
import java.util.*;
import java.util.stream.*;
public class StreamApi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//LIMIT():	Stream.iterate(1, n->n+1).filter(n->n%2!=0).limit(10).forEach(System.out::println);	
	List<String> li=new ArrayList<String>();
	li.add("wipro");
	li.add("technologies");
	li.add("chennai");
	li.stream().map(String :: toUpperCase).forEach(System.out::println);
	}

}
