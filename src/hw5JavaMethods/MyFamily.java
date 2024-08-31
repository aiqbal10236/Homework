package hw5JavaMethods;

public class MyFamily {
//initialize some int type variables -- child1Age, child2Age, child3Age, child4Age
	public int child1Age=40;
	public int child2Age=30;
	public int child3Age=20;
	public int child4Age=10;
	//a return type method 
	//The outcome should be: "The sum of my childrens age is: " + <sum>
	public int myFamily() {
		int sum = child1Age+child2Age+child3Age+ child4Age;
		System.out.println("The sum of my childrens age is:" + sum);
		return sum;
		
	} 
	//Create a main method after the method, Instantiate the class and call the method by the object.
	public static void main(String[] args) {
	MyFamily family=new MyFamily();
	family.myFamily();
		
	
	
		
	}	
}
