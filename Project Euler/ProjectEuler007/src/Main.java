/*
 * 10001st prime
 */
public class Main {
	public static void main(String[] args){
		int x=0;
		for(int Count1 = 2; x<=10001; Count1++){	
			int Count2 = 2;
			boolean Prime = true;
			while(Count2*Count2 <= Count1 && Prime){	
				if(Count1%Count2 == 0){	
					Prime = false;
				}	
			Count2++;	
			}	
			if(Prime){	
				x++;	
				System.out.println(x + ","+ Count1);
			}
		}
	}
}
