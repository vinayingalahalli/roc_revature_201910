package eg_if_else_switch;

public class DemoMain {

	public static void main(String[] args) {

		int x = 9;

		if (x == 8) {
			System.out.println("yes it is 8");
		} else {
			System.out.println("no it is not");
		}

		int score = 29;
		if (score >= 80) {
			System.out.println("Top score");
		} else if (score < 80 && score >= 60) {
			System.out.println("Doing Good");
		} else if (score < 60 && score >= 40) {
			System.out.println("Ahhh .. You might wanna make it bit more better");
		} else {
			System.out.println("Retry!!!!!");
		}

		int day = 3;

		switch (day) {

		case 1:
			System.out.println("Its Monday");
			break;
		case 2:
			System.out.println("Its Tuesday");
			break;
		case 3:
			System.out.println("Its Wednesday");
			break;
		default:
			System.out.println("Some other day.....");
		}

	}

}
