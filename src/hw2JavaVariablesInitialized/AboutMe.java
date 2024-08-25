package hw2JavaVariablesInitialized;



public class AboutMe {

	//Variable declared 
public String asifIqbal;
	
//Now initialize String, int, float, char, and boolean.
	
                public String myName="Asif Iqbal";
                public int myYearlySalary=1500000000;
                public float myHeight=5.4f;
                public char myGender='M';
                public boolean myUSACitizen=false;
                
     //Declared Constructor        
     public AboutMe () {
    	 System.out.println("----------This is all about myself----------");
     }
	
	
	public void aboutMe() {
		
	System.out.println("NAME"+myName+"SALARY"+myYearlySalary+
			"HEIGHT"+myHeight+"GENDER"+myGender+"CITIZEN"+myUSACitizen);	
			
	}
	
	public static void main(String[] args) {
	AboutMe asif= new AboutMe();
	asif.aboutMe();
 
	}

}
