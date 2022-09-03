package practice;

public class PracticeSettersAndGetters {

	public static void main(String[] args) {
	//	Student s = new Student();
		//s.age = 10;
		//System.out.println(s.age);
		
		Student stud = new Student();
		stud.setAge(26);
		System.out.println(stud.getAge());

	}

}
class Student{
	private int age;        //instance variable
	private String name;
	private char gender;
	
	public static int sharedVariable;  //shared variable
	//Setters and Getters
	
	public void setAge (int age) //local variable
	{
		if (age<0 || age>=140) {
			age=0;
		}
		this.age = age;
		
		//if we use this. it will refer to instance variable
		
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
}