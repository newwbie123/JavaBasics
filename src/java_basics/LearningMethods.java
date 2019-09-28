package java_basics;

public class LearningMethods {

	public static void main(String[] args) {

		printSomeStuff("Hello my name is Ivan"); //printSomeStuff prints method-defined sentence "some words" and "Hello my name is Ivan"-which is argument
		
		System.out.println(MyUtils.printSomeInt(98));
		
		MyUtils.sum2Numbers(25, 20);
		
		int myVar = MyUtils.add10(99) + 1000;
		
		System.out.println(myVar);

	}

	public static void printSomeStuff(String argument) {
		System.out.println("some words... " + argument);
	}

}
