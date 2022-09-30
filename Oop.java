package com.bl.workshop;

class Student{
	String name;
	int age;
	
	public void studentInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}

Student(){
	System.out.println("Constructor is called");
}
}

public class Oop {
	public static void main(String[] args) {
		Student st = new Student();
		st.name = "Azhar";
		st.age = 26;
	}

	@Override
	public String toString() {
		return "Oop [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
