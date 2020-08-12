
public class p019 {	
	public static void main(String[] args){
		int weekDay = 0;
		int month = 1;
		int date = 1;
		boolean leap = false;
		for(int year = 1900; year <=2000; year++ ){
			while(month <=12 && date <=31){
				if(month == 4 || month == 6 || month == 9 || month ==11){
					for(date = 1; date <= 30; date ++){
						date++;
						weekDay = 6%(weekDay++);
						System.out.println(date + "/" + month + "/" + year);
					}	
					
				if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month ==10 || month == 12){
					for(date = 1; date <= 31; date ++){
						date++;
						weekDay = 6%(weekDay++);
						System.out.println(date + "/" + month + "/" + year);
					}	
				}
				if(month == 2){
					if(leap)
						for(date = 1; date <= 29; date ++){
						date++;
						weekDay = 6%(weekDay++);
						System.out.println(date + "/" + month + "/" + year);
						}
					else
						for(date = 1; date <= 28; date ++){
							date++;
							weekDay = 6%(weekDay++);
							System.out.println(date + "/" + month + "/" + year);
							}
				}
				}
			}
		}
	}
}
