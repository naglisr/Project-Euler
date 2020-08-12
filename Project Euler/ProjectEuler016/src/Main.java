
public class Main {
	public static void main(String[] args){
		for(int x = 1; x < 21; x++){
			int bob = (int)Math.pow(2, x);
			int sum = 0;
			while(bob > 0){
				sum += bob%10;
				bob = bob/10;
			}
			System.out.println(bob + ", " + sum);
		}
	}
}
