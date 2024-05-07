package switchcaseproject;

public class Main2 {

	public static void main(String[] args) {
		Month mon = Month.JUNE;
		showdayCount(mon);
		
	}

	static void showdayCount(Month m) {

		int noOfDays = 
				
		switch (m) {

		case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
		case FEBRUARY -> 28;
		case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;

		};

		System.out.println(noOfDays);

	}

}
