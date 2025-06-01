package solveQuestion;

class add{
	int a ; 
	int b  ; 
	
	// creating the constructor 
	add(int a , int b){
	this.a = a ; 
	this.b = b ; 
	}
	
	// now creating the function for the return the sum 
	int sum() {
		return a+b ; 
	}
}

public class factorial {
	
	public static void main(String[] args) {
		add fir = new add(6, 5) ; 
		fir.a = 20 ; 
		add seco = fir ; 
		seco.a = 30 ; 
		System.out.println(fir.a);
		System.out.println(seco.a);
	}
}