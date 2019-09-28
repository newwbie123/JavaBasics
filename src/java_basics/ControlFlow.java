package java_basics;

public class ControlFlow {

	public static void main(String[] args) {

		//a little bit of if/else examples
		
		boolean hungry = true;
		if (hungry) {
			System.out.println("i'm starving");
		} else {
			System.out.println("i'm not hungry");
		}

		int hungerRating = 5;
		if (!(hungerRating < 6)) {
			System.out.println("not hungry");
		} else {
			System.out.println("i'm starving");
		}

		int favoriteTemp = 75;
		int currentTemp = 60;
		String opinion;

		if (currentTemp < favoriteTemp - 30) {
			opinion = "it's pretty cold";

		} else if (currentTemp < favoriteTemp - 20) {
			opinion = "it's kinda cold";
		} else if (currentTemp > favoriteTemp + 10) {
			opinion = "it's hot there";
		} else {
			opinion = "it's a beautiful temperature";
		}
		System.out.println(opinion);
		
		//Switch statement example

		int month = 4;
		String monthString;

		switch (month) {
		case 1:
			monthString = "january";
			break;
		case 2:
			monthString = "february";
			break;
		case 3:
			monthString = "march";
			break;
		case 4:
			monthString = "april";
			break;
		default:
			monthString = "unknown month";
			break;
		}
		System.out.println(monthString);

	}

}
