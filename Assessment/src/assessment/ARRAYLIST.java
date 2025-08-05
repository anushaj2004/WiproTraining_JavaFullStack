package assessment;
import java.util.*;
public class ARRAYLIST {
	public static void main(String[] args) {
	List<String> list_string=new ArrayList<String>();
	list_string.add("red");
	list_string.add("pink");
	list_string.add("white");
	list_string.add("blue");
	System.out.println(list_string);
	for(String element:list_string)
		System.out.println(element);

}

}