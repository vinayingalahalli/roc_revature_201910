package eg_old_style;

public class MainAgain {

	public static void main(String[] args) {

		Sort s1 = new Sort() {

			@Override
			public void sortAnything() {
				System.out.println("Sort something here");
			}
		};

		s1.sortAnything();

		Sort s2 = new Sort() {

			@Override
			public void sortAnything() {
				System.out.println("Sort something again here");
			}
		};

		s2.sortAnything();

	}

}
