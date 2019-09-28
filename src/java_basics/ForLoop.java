package java_basics;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "dsokjjkckjfdjfb";
		
		
		for(int i = 0; i < name.length(); i++) {
			System.out.println("charachter at index " + i + ": " + name.charAt(i));
		}
		for(int i = name.length() - 1; i >= 0; i--) {
			System.out.println("character at index " + name.length() + " backwards: " + name.charAt(i));
		}
		
		System.out.println("Even number sequence as it follows: ");
		for(int i = 0; i <= 100; i = i + 2) {
			System.out.println("Even number +2: " + i);
		}
	}

}
