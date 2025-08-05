package assessment;
import java.util.*;
public class ArrayLIST1 {
public static void main(String[] args)
{
	List<String> list_string=new ArrayList<String>();
	list_string.add("red");
	list_string.add("pink");
	list_string.add("white");
	list_string.add("blue");
	System.out.println(list_string);
	list_string.add(0,"voilet");
	list_string.add(5,"purple");
	System.out.println(list_string);
}
}
