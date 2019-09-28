package oopbasics;

public class Earth {

	public static void main(String[] args) {
		
		Human tom = new Human("Tom Jones", 10, 78, "Green");

		tom.speak();
		tom.work();

		System.out.println("-----------------------------");

		Human joe = new Human("Joe Tomes", 19, 99, "Blue");

		joe.speak();
		joe.eat();

	}

}
