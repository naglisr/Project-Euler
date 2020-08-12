/*
 * Brute force algorithm
 */
public class Main {
	public static void main(String[] args){
		for(int x = 2; x<=1000; x++){
			for(int y = 2; y<= 1000; y++){
				for(int z = 2; z<=1000; z++){
					if(x*x+y*y == z*z && x+y+z == 1000){
						System.out.println(x + ", " + y + ", " + z);
						System.out.println(x*y*z);
					}
				}
			}
		}
	}
}
