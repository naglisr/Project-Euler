
public class Main {
	
	public static void main(String[] args){
		int date  = 1;
		int month = 0;
		int year = 1900;
		int count = 0;
		int answer = 0;
		boolean leap = false;
		while(year <= 2000 ){
			if((year%4 == 0 && year%100 != 0) || year%400 == 0) leap = true;
			else leap = false;
			if((date == 31 && (month == 0|| month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11)) || (date == 30 && (month == 3 || month == 5 || month == 8 || month == 10) || (month == 1 && date == 28 && !leap) || (month == 1 && date == 29 && leap)))
			{	
				date = 1;
				month = (month+1)%12;
			}
			else date ++;
			if(date == 1 && month == 0) year ++;
			count++;
			if(year >= 1901 && count%7 == 6 && date ==1) answer++;
		}
		System.out.println(answer);
	}
}
