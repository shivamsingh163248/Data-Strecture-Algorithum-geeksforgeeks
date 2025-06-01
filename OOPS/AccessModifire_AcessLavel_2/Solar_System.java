package AccessModifire_AcessLavel_2;

public class Solar_System {
	
	// creating the inner class 
	  protected class glexy{
		
		// creating the 
		String plantName ; 
		String name ; 
		
		// creating  the constructor 
		protected  glexy(String palnatName , String name) {
			this.name = name ; 
			this.plantName = plantName ; 
		}
		
		// creating the method of the printing 
		protected void printGlexy(){
			System.out.println(this.name+" "+this.plantName);
		}
	}

}
