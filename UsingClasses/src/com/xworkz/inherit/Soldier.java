package com.xworkz.inherit;

public class Soldier {
	public void shoot()
	{
		System.out.println("running shoot in soldier");
		Gun gun=new Gun("Assault","India","Rifle");
		gun.fire();
		gun.display();
	}

}
