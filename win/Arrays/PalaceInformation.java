class PalaceInformation{
public static void main(String[] informationOfPalace){
		if(informationOfPalace.length==4){
			System.out.println("You have entered 4 informations");
			String palaceName=informationOfPalace[0];
			String location=informationOfPalace[1];
			String builtBy=informationOfPalace[2];
			String builtYear=informationOfPalace[3];
			
			System.out.println("PalaceName:"+palaceName);
			System.out.println("Location:"+location);
			System.out.println("BuiltBy:"+builtBy);
			System.out.println("BuiltYear:"+builtBy);		
		}
		else{
			System.out.println("You have not entered 4 informations");
			
		}
		
	}
}