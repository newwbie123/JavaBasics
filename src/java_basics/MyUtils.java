package java_basics;

public class MyUtils {
	
	public static int printSomeInt(int argument) {
		System.out.println("Passed number is: " + argument);
		return argument;
	}
	
	public static void sum2Numbers(int firstArg, int secondArg) {
		System.out.println("sum of these 2 numbers is: " + (firstArg + secondArg));
	}
	
	public static int add10(int someArgument) {
		int result = someArgument + 10;
		return result;
	}

}
