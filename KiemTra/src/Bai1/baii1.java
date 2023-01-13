package Bai1;

import java.util.Scanner;

public class baii1 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = "";
		s=sc.nextLine();
		int dem1=0,dem2=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				dem1++;
			}
			else dem2++;
		}
		System.out.println(Math.abs(dem2-dem1));
	}
}
