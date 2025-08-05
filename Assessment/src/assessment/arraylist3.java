package assessment;

import java.util.ArrayList;
import java.util.List;

public class arraylist3 {

	public static void main(String[] args) {
		List<String> list_string=new ArrayList<String>();
		list_string.add("red");
		list_string.add("pink");
		list_string.add("white");
		list_string.add("blue");
		System.out.println(list_string);
		list_string.set(1,"yellow");
		System.out.println(list_string);
	}

}
