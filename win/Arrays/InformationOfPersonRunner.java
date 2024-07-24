class InformationOfPersonRunner{
	public static void main(String[] personInformation){
		if(personInformation.length==4){
			System.out.println("You have entered 4 informations");
			String name=personInformation[0];
			String age=personInformation[1];
			String email=personInformation[2];
			String password=personInformation[3];
			
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Email:"+email);
			System.out.println("Password:"+password);		
		}
		else{
			System.out.println("You have not entered 4 informations");
			
		}
		
	}
	
	
}