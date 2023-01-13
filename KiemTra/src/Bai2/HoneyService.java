package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class HoneyService implements HoneyInterface {

	public HoneyService() {}
	public ArrayList<Honey> listHoney = new ArrayList<>();

	public static Scanner sc=new Scanner(System.in);
	@Override
	public void addHoney() {
		// TODO Auto-generated method stub
		Honey h=new Honey();
		int dem;
		do {
			h.input();
			dem=0;
			for(Honey tmp:listHoney) {
				if(tmp.getId()==h.getId()) {
					dem++;
					
				}
			}
		}while(dem!=0);	
		listHoney.add(h);
	}

	public void Tile() {
		
	}
	@Override
	public void showHoney() {
		// TODO Auto-generated method stub
System.out.printf("%-15d ");
	}

	@Override
	public void delHoney() {
		// TODO Auto-generated method stub

	}

	@Override
	public void EditHoney() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFavorite() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sortHoneyByName() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		HoneyService hs=new HoneyService();
		hs.addHoney();
		hs.addHoney();
	}

}
