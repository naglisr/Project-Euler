
public class Main {
	public static void main(String[] args){
		int x=0;
		long total = 0;
		for(int Count1 = 2; Count1 < 2000000; Count1++){	
			int Count2 = 2;
			boolean Prime = true;
			while(Count2*Count2 <= Count1){	
				if(Count1%Count2 == 0){	
					Prime = false;
				}	
			Count2++;	
			}	
			if(Prime){	
				x++;	
				total += Count1;
			}
		}
		System.out.println(total);
	}
}
