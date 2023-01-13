package Bai2;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String gender;
	private String phone;

	public Person() {
	}

	public Person(String name, int age, String gender, String phone) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public static Scanner sc=new Scanner(System.in);
	public void input() {
		System.out.println("Ten: ");
		setName(sc.nextLine());
		System.out.println("Tuoi: ");
		setAge(sc.nextInt());
		sc.nextLine();
		System.out.println("Gioi tinh: ");
		setGender(sc.nextLine());
		System.out.println("Dien thoai: ");
		setPhone(sc.nextLine());
	}
}
