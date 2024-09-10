package com.example.methods.runner;

import com.example.methods.Gun;

public class GunRunner {

	public static void main(String[] args) {
		Gun gun = new Gun(1000, "India", "Pistol");
		Gun gun1 = new Gun(1000, "India", "Pistol");

		gun.setMaterial("steel");
		gun.setReal(false);
		gun.setType("toy");

		gun1.setMaterial("steel");
		gun1.setReal(true);
		gun1.setType("real");

		System.out.println(gun.toString());
		System.out.println(gun1.toString());

		boolean same = gun.equals(gun1);
		System.out.println("are the gun instances same :" + same);
	}

}
