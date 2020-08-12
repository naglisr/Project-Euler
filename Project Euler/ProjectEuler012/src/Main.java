
public class Main {
	public static void main(String[] args){
		int Tringle = 0;
		boolean run = true;
		for(int x = 1; run; x++){

			int noOfFactors = 0;
			Tringle = x*(x+1)/2;
			for(int y = 1; y*y < Tringle; y++){
				if(Tringle%y == 0)
					noOfFactors += 2;
				if(Tringle == y*y)
					noOfFactors++;
				if(noOfFactors > 500)
					run = false;
			}
			System.out.println(Tringle + ", " + noOfFactors );
		}
	}
}
