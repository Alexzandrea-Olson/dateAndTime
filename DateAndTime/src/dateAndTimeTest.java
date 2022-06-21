

public class dateAndTimeTest {
	public static void main(String[] args) {
		dateAndTime dt1 = new dateAndTime(1, 31,1996,24,59);//Jan 31 1996: Time 24:59
		dateAndTime dt2 = new dateAndTime(12,31,1997,24,59);//December 31 1996: Time 24: 59
		dateAndTime dt3 = new dateAndTime(2,29,2020,23,10);
	//dateAndTime dt4 = new dateAndTime(2,29,2019,23,10);
		
		
		System.out.println("Before Tick increasing by 1 minute");
		System.out.println(dt1);
		dt1.tick();
		System.out.println();
		System.out.println("After Tick is implemented: updating month, day and new time");
		System.out.println(dt1);
		System.out.println();
		
		
		System.out.println("Before Tick increasing by 1 minute");
		System.out.println(dt2);
		dt2.tick();
		System.out.println();
		System.out.println("After Tick is implemented: updating month, day, year, and time");
		System.out.println(dt2);
		System.out.println();
		
		
		System.out.println("Before Tick");
		System.out.println(dt3);
		dt3.tick();
		System.out.println();
		System.out.println("After Tick is implemented: updating time");
		System.out.println(dt3);
		System.out.println();
		
		//returns invalid year for leap year with object dt4
		/*dt4.tick();
		System.out.println();
		System.out.println("After Tick is implemented");
		System.out.println(dt4);*/
	}

	
}
