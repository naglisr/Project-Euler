/*
 * largest palindrome product
 */
public class Main {
		
	static boolean checkIfPalindrome(int number, int i){
		if(i > (String.valueOf(number).length()-1)/2){
			return true;
		}
		else{
			if(String.valueOf(number).charAt(i) ==  String.valueOf(number).charAt(String.valueOf(number).length()-1-i))
				return checkIfPalindrome(number, i+1);
			else
				return false;
		}
	}
	public static void main(String[] args){
		for(int num1 = 100; num1 <=999; num1++){
			for(int num2 = 100; num2 <=999; num2++){
				if(checkIfPalindrome(num1* num2,0))
					System.out.println(num1*num2);
			}
		}
		System.out.println(checkIfPalindrome(9008,0));
	}
}
