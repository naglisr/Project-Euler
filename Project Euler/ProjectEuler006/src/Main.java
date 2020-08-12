/*
 * sum square difference
 */
public class Main {

	
	static int thingyDifference(int x){
		
		 int difference = (int)Math.pow((x*(x+1)/2), 2)-x*(x+1)*(2*x+1)/6;
		 return difference;
	}
	public static void main(String[] args){
		System.out.println(thingyDifference(100));
	}
}
