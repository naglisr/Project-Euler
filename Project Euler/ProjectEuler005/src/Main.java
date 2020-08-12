/*
 * smallest multiple
 */
public class Main {

	public static void main(String[] args){
		boolean isDivisible;
		for(int num = 87297210; num <= 232792560; num++){

			isDivisible = true;
			for(int x = 2; x <=20 && isDivisible; x++)
				if(num%x != 0)
					isDivisible = false;
			
			if(isDivisible)
				System.out.println(num);
			
		}
	}

}
