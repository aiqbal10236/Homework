package hw3JavaVariablesDeclared;

import javax.security.auth.login.CredentialException;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe asifiqbal= new AboutMe();
	
	 //Class instantiated Class and constructor initialized.	}
        asifiqbal.myName="Asif Iqbal";
        asifiqbal.myAge=36;
        asifiqbal.myCourseFee=3500;
        asifiqbal.myIncome=10000;
        asifiqbal.myFutureSavings=10000000000l;
        asifiqbal.myHeight=5.4f;
        asifiqbal.myGrade=4.99;
        asifiqbal.myGender='M';
        asifiqbal.fullTimeStudent=true;
        asifiqbal.aboutMe(); 
        
        AboutMe alex=new AboutMe();
        alex.myName="Alex Brown";
        alex.myAge=26;
        alex.myCourseFee=3000;
        alex.myIncome=75000
        alex.myFutureSavings=200000000000l;
        alex.myHeight=5.11f;
        alex.myGrade=4.75;
        alex.fulltimeStudent=false;
        alex.aboutMe();
        
        
	
	}    
        
        
        
        
        
        
        
        
        
}
