import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		BigInteger num = BigInteger.valueOf(1);
		int total = 0;
		for(int i = 1; i <=100; i++){
			BigInteger num2 = BigInteger.valueOf(i);
			num = num.multiply(num2);
		}
		String bob = String.valueOf(num);
		System.out.println(bob);
		for(int j = 0; j < bob.length(); j++){
			char digitc = bob.charAt(j);
			String digits = Character.toString(digitc);
			int digiti = Integer.parseInt(digits);
			total += digiti;
		}
		System.out.println(total);
	}
}
