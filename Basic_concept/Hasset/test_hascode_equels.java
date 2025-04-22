package Hasset;

public class test_hascode_equels {

	public static void main(String[] args) {
	
		
		student sh = new student(5, "shivam singh", "cse") ; 
		student sh1 = new student(5, "shivam singh", "cse") ; 
		
		// test the ahscode 
		System.out.println(sh.toString());
		System.out.println(sh.hashCode());
		System.out.println(sh1.hashCode());
		System.out.println(sh1.equals(sh));
		System.out.println(sh.hashCode() == sh1.hashCode());
	}

}
