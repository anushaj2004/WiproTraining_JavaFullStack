package assessment;
import java.util.*;
import java.util.stream.*;
public class StreamAPI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<String>();
		al.add("admin");
		al.add("user");
		al.add("customer");
		al.add("employee");
		List<String> li=al.stream().filter(s-> s.contains("e")).collect(Collectors.toList());
	    System.out.println(li);
   }

}
