package hw4Constructor;

public class StudentTest {

	public static void main(String[] args) {
// default constructor initialized
		Student student=new Student();

//Parameterized  Constructor Initialized
		System.out.println("This is all about Student");
	
//The second outcome -- > Student Name: <Your Name> , ID: <Your Id>, Gender: <Your Gender> , 
//Grade: <Your Grade> and Java Programmer? Ans: true.
		Student asif=new Student("asif", 10236, 'M', 3.8800f,  true);
		

	}

}
