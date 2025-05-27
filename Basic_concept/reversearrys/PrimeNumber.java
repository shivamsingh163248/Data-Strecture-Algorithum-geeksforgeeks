package reversearrys;

public class PrimeNumber {
	
// creating the function of the prime number 
	public static void totalPrime(int a , int b) {
		
		int count = 0 ; 
		for (int i = a; i < b; i++) {
			
			if (totalPrime(i)) {
				count++ ; 
			}
		}
		System.out.println(count);
		
	}
	
	public static boolean  totalPrime(int a) {
		
		for (int i = 2; i < a/2+1; i++) {
			
			if (a%i == 0 ) {
				return false ; 
			}
		}
		return true ; 
	}
	
	

	public static void main(String[] args) {
		

	}

}
