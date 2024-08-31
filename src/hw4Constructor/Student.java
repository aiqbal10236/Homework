package hw4Constructor;

public class Student {
	// name, id, gender, grade (as float), isProgrammer(as boolean)

	public String name;
	public int id;
	public char gender;
	public float grade;
	public boolean isProgrammer;

	public Student() {
		System.out.println("This is all about Student");
	}

	public Student(String name, int id, char gender, float grade, boolean isProgrammer) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.grade = grade;
		this.isProgrammer = isProgrammer;

		System.out.println("STUDENT NAME:" + name + "STUDENT ID:" + id + "STUDENT GENDER:" + gender + "STUDENT GRADE:"
				+ grade + "STUDENT INPROGRAMMER:" + isProgrammer);
	}

	

	}


