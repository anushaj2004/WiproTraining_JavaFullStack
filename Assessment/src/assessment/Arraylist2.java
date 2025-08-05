package assessment;
import java.util.*;
public class Arraylist2 {

	public static void main(String[] args) {
		List<String> list_string=new ArrayList<String>();
		list_string.add("red");
		list_string.add("pink");
		list_string.add("white");
		list_string.add("blue");
		System.out.println(list_string);
		String element=list_string.get(0);
		System.out.println("first element:"+element);
		element=list_string.get(2);
		System.out.println("second element:"+element);
	}

}
