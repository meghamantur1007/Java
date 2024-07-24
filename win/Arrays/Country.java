class Country{
	public static void statesOfIndia(String[] states){
		for(int start=0;start<states.length;start++){
			String ref=states[start];
			System.out.println(ref);
		}
	}
	public static void pincodesOfStates(int[] pincode){
		for(int position=0;position<pincode.length;position++){
			int ref1=pincode[position];
			System.out.println(ref1);
		}
		for(int position=pincode.length-1;position>=0;position--){
			int reverse=pincode[position];
			System.out.println(reverse);
			
		}
	}
	public static void primeMinistersOfIndia(String[] primeMisnister){
		for(int start=0;start<primeMisnister.length;start++){
			String ref2=primeMisnister[start];
			System.out.println(ref2);
		}
	}
	public static void cabinateMinistersOfIndia(String[] cabinateMinisters){
		for(int position=0;position<cabinateMinisters.length;position++){
			String ref3=cabinateMinisters[position];
			System.out.println(ref3);
		}
	}
		
	public static void politicalPartiesOfIndia(String[] politicalParties){
		for(int start=0;start<politicalParties.length;start++){
			String ref4=politicalParties[start];
			System.out.println(ref4);
		}
	}
	}

