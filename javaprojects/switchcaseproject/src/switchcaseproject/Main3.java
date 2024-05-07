package switchcaseproject;

public class Main3 {

	public static void main(String[] args) {
		Month mon = Month.MAY;
		checkMonth(mon);

	}

	static void checkMonth(Month m) {

		int maxTemp =

			switch (m) {

				case NOVEMBER, DECEMBER, JANUARY, FEBRUARY -> {
					System.out.println("Very Cold");
					yield 28;
				}
				case MARCH, APRIL -> {
					System.out.println("Not very cold or hot");
					yield 32;
				}

				case MAY, JUNE, JULY -> {
					System.out.println("Very hot");
					yield 47;
				}

				case AUGUST, SEPTEMBER, OCTOBER -> {
					System.out.println("It rains");
					yield 34;
				}
			};

		System.out.println(maxTemp);

	}
}