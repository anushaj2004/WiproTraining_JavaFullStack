package assessment;

public class IncrementAndDecrement {
 public static void main(String[] args)
 {
	 int a = 7;
     System.out.println("Original: " + a);
     System.out.println("Post-Increment: " + (a++));
     System.out.println("After Post-Increment: " + a);
     System.out.println("Pre-Increment: " + (++a));
     System.out.println("Post-Decrement: " + (a--));
     System.out.println("After Post-Decrement: " + a);
     System.out.println("Pre-Decrement: " + (--a));
 }
}
