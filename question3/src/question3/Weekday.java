package question3;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("input number");
		int day = in.nextInt();
		
		System.out.println(getDayName(day));
	}
		
		
		public static String getDayName(int day) {
			String dayName = "";
			switch(day) {
			    case 1: dayName = "Sunday"; break;
	            case 2: dayName = "Monday"; break;
	            case 3: dayName = "Tuesday"; break;
	            case 4: dayName = "Wednesday"; break;
	            case 5: dayName = "Thursday"; break;
	            case 6: dayName = "Friday"; break;
	            case 7: dayName = "Saturday"; break;
	            default:dayName = "Invalid day range";
	        }

	        return dayName;
	    }
		
		
		

	}

	
