class ForestInformation{
public static void main(String[] forestInformation){
		if(forestInformation.length==4){
			System.out.println("You have entered 4 informations");
			String forestName=forestInformation[0];
			String area=forestInformation[1];
			String establishedYear=forestInformation[2];
			String state=forestInformation[3];
			
			System.out.println("ForestName:"+forestName);
			System.out.println("Area:"+area);
			System.out.println("Established Year:"+establishedYear);
			System.out.println("State:"+state);		
		}
		else{
			System.out.println("You have not entered 4 informations");
			
		}
		
	}
}