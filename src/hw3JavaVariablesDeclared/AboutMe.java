package hw3JavaVariablesDeclared;



public class AboutMe {

	//Variable declared 
public String asifIqbal;
	
//Now initialize String, int, float, char, and boolean. Declare byte, short, long, and double type variables
	
                public String myName;
                public int myYearlySalary;
                public float myHeight;
                public char myGender;
                public boolean myUSACitizen;
                public byte myAge;
                public short myRent;
                public long mySaving;
                public double myRating;
                           
     //Declared Constructor        
     public AboutMe () {
    	 System.out.println("----------This is all about myself----------");
     }
	
	
	public void aboutMe() {
		
	System.out.println("\nNAME"+myName+"\nSALARY"+myYearlySalary+"\nHEIGHT"+myHeight+             
			"\nGENDER"+myGender+"\nCITIZEN"+myUSACitizen+"\nAGE"+myAge+          
			"\nRENT"+myRent+"\nSAVING"+mySaving+"\nRATING"+myRating);
	
}
	
}
