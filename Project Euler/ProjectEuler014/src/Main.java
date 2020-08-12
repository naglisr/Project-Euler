
public class Main {
	public static void main(String[] args){
		int largestChain = 0;
		long largestChainNum = 0;
		for(long startNum = 1; startNum < 1000000; startNum++){
			int chainLength = 0;
			long num = startNum;
			while(num != 1){
				if(num%2 == 0)
					num = num/2;
				else
					num = 3*num+1;;
				chainLength++;
				if(chainLength > largestChain){
					largestChainNum = startNum;
					largestChain = chainLength;
				}
			}

			System.out.println(startNum + ", " + chainLength + ", " + largestChain + ", " + largestChainNum);
		}	
	}	
}	
