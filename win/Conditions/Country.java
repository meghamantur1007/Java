class Country{
	public static String countryCode(int code){
		System.out.println("running country in countryCode");
		if(code==91){
			return "India";
		}
		if(code==1){
			return "US";
		}
		if(code==44){
			return "UK";
		}
		if(code==52){
			return "Mexico";
		}
		if(code==86){
			return "China";
		}
	return "Not Found";
	}
	public static double price(String item){
		System.out.println("running item in countryCode");
		if(item=="Milk"){
			return 15;
		}
		if(item=="White Bread"){
			return 20;
		} 
		if(item=="Rice"){
			return 50;
		}
		if(item=="Egg"){
			return 30;
		}
		if(item=="Pizza"){
			return 200;
		}
	return 0;
	}
	public static String producerName(String movieName){
		if(movieName=="Raajakumara"){
			return "Vijay Kiragandur";
		}
		if(movieName=="Mufti"){
			return "Jayanna Bhogendra";
		}
		if(movieName=="KGF:Chapter 2"){
			return "Vijay Kiragandur";
		}
		if(movieName=="Tagaru"){
			return "K.P.Srikanth";
		}
		if(movieName=="Roberrt"){
			return "Umapathy Srinivas Gowda";
		}
	return "Not Found";
	}
	
}