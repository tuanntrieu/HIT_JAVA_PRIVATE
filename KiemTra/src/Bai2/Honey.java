package Bai2;

import java.util.Scanner;

public class Honey extends Person {
	private int id;
	private int status;

	private Favorite [] favorite;
	public Honey(String name, int age, String gender, String phone, int id, int status, Favorite[] favorite) {
		super(name, age, gender, phone);
		this.id = id;
		this.status = status;
		this.favorite = favorite;
	}

	public Honey() {
	}

	public int getId() {
		return id;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status2) {
		this.status = status2;
	}

	public Favorite[] getFavorite() {
		return favorite;
	}

	public void setFavorite(Favorite[] favorite) {
		this.favorite = favorite;
	}

	public static Scanner sc=new Scanner(System.in);
	public void input() {
		System.out.println("Ma nguoi yeu: ");
		setId(sc.nextInt());
		sc.nextLine();
		super.input();
		int status=(int)(Math.random()*2);
		setStatus(status);
		
		
	}
}
