
public class dateAndTime {
	private int month;
	private int day;
	private int year;
	private int hour;
	private int minute;
	private boolean isLeapYear = false;
	//array that tells how many days are in each month
	int [] intArray = new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31}; 
	
	dateAndTime(int month, int day, int year, int hour, int minute){
		
		checkLeapYear(year);
		//checks and makes sure month is between 1-12
		if(month > 0 && month <=12) {
			this.month = month;
			}
		else
			throw new IllegalArgumentException("Invalid Month");
		//checks and sees if day is an acceptable number per month given
		if(day == 29 && month == 2 && isLeapYear == true) {
			this.day = day;
			this.month = month;
		}else if(day <= intArray[month]) {
			this.day = day;
		}else
			throw new IllegalArgumentException("Invalid Day");
		
		//checks and sees if year is between 1500 and 2050
		if(year > 1500 && year < 2050) {
			this.year = year;
		}
		else
			throw new IllegalArgumentException("Invalid Year");
		//checks and makes sure hour is valid 
		if(hour <= 24 && hour >= 0 ) {
			this.hour = hour;
		}
		else 
			throw new IllegalArgumentException("Invalid Hour");
		//checks and makes sure minute is valid
		if(minute <= 59 && minute >= 0) {
			this.minute = minute;
		}
		else
			throw new IllegalArgumentException("Invalid Minute");
		
	}
	
	private boolean checkLeapYear(int year) {
		
		 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
			 return isLeapYear = true;
			 
		 }
	         
	      else {
	    	  return isLeapYear = false;
	      }
	         
	   
		   
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {

		this.minute = minute;
	}
	
	  public String toString() {
		
	      return String.format("%s: %s/%s/%s%n%s: %02d:%02d%n%s%s", 
	         "Date", getMonth(), getDay(),getYear(), 
	         "Time", getHour(),getMinute(),
	         "Leap Year: ", checkLeapYear(getYear()));
}

	public void tick() {
		//adding one to the minute if it is less than 58
		if(this.minute<=58) {
			this.minute++;
		}
		else {
			this.minute = 0;
			incrementHour();
			
		}
			
	}

	private void incrementHour() {
		//increasing hour by one if it is 23 or less
		if(this.hour <= 23) {
			this.hour++;
		}
		else {
			nextDay();
		}
			
	}

	private void nextDay() {
		//if hour is not 23 or less 
		//if it is > 23 it will increment the day and set hour to 0
		this.hour=0;
		//checks and see if it need to increment day or update to next month
		if(this.day < intArray[this.month]) {
			this.day++;
		}
		else {
			nextMonth();
		}
	}

	private void nextMonth() {
		//checks and sees if it needs to increment year
		if(this.month == 12)
		{
			nextYear();
		}
		else {
		//if not it adds one to month and sets day back to one
		this.month++;
		this.day = 1;
		}
	}

	private void nextYear() {
		this.month = 1;
		this.day = 1; 
		
		this.year++;
	}

	
}