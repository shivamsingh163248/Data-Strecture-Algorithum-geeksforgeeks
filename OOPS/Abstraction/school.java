package Abstraction;

public class school {
	
       // creating the varaible 
	  private int roll_number ; 
	  private String name ; 
	  
	  // creating the constructor 
	  public  school(String name , int Roll_num) {
		// TODO Auto-generated constructor stub
		  this.name = name ; 
		  this.roll_number = Roll_num ; 
	}
	  
	  public int roll() {
		  return this.roll_number ; 
	  }
}
