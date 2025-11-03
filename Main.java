package com.codegnan.oopexamples;
public class Main {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Jyothi");
		p.setAge(22);
		p.setHeight(5.3);
		p.getName();
		p.getAge();
		p.getHeight();
		//operational methods
		p.introduce();
		p.celebrateBirthday();
		p.isAdult();
		p.introduce();
		System.out.println(Person.getSpeciesName());
		System.out.println(p.getIdentification());
		
	}

}
