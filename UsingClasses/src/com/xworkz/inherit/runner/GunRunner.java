package com.xworkz.inherit.runner;

import com.xworkz.inherit.DBoss;
import com.xworkz.inherit.Godse;
import com.xworkz.inherit.Gun;
import com.xworkz.inherit.Police;
import com.xworkz.inherit.Soldier;

public class GunRunner {

	public static void main(String[] args) {
		Soldier soldier=new Soldier();
		soldier.shoot();
		System.out.println("------------------------------");


		Police police=new Police();
		police.load(new Gun("AMT","India","Pistol"));
		System.out.println("------------------------------");

		Gun gun=new Gun("Armsel","India","shotgun");
		DBoss dboss=new DBoss(gun);
		dboss.killed();
		System.out.println("------------------------------");

		Godse godse=new Godse();
		godse.fire(gun);

	}

}