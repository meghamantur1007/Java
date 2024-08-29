package com.xworkz.inherit;

public class DBoss {
		private Gun gun;
		
		public DBoss(Gun gun) {
			super();
			this.gun = gun;
		}

		

		public void killed()
		{
			System.out.println("running killed in Dboss");
			if(gun!=null)
			{
				gun.display();
			}
			else
			{
				System.out.println("gun is null");
			}
		}

	}

