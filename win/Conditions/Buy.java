class Buy{
	public static void product(String brand,double price ){
		System.out.println("=====================");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		if(price>0 && price<=200){
			System.out.println("Valid");
		}
		else{
			System.out.println("Invalid");
		}
	}
	public static void product(String name,int quantity,String productquantity,double price){
		System.out.println("=====================");
		System.out.println("name:"+name);
		System.out.println("quantity"+quantity);
		System.out.println("productquantity:"+productquantity);
		if(quantity>0 && quantity<=40){
			System.out.println("Valid");
		}
		else{
			System.out.println("invalid");
		}
	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price){
		System.out.println("=====================");
		System.out.println("name:"+name);
		System.out.println("theaterName:"+theaterName);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		if(price>0 && price<=500){
			System.out.println("Valid");
		}
		else{
			System.out.println("invalid");
		}
	}
	public static void buyEgg(int total,double pricePerEgg){
		System.out.println("=====================");
		System.out.println("total:"+total);
		System.out.println("pricePerEgg:"+pricePerEgg);
		if(total>0 && total<=9){
			System.out.println("valid");
		}
		else{
			System.out.println("Invalid");
		}
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate){
		System.out.println("=====================");
		System.out.println("quantityInMl:"+quantityInMl);
		System.out.println("price:"+price);
		System.out.println("brand:"+brand);
		System.out.println("manfDate:"+manfDate);
		if(quantityInMl>0 && quantityInMl<=10 ){
			System.out.println("valid");
		}
		else{
			System.out.println("Invalid");
		}
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity){
		System.out.println("=====================");
		System.out.println("Size:"+size);
		System.out.println("type:"+type);
		System.out.println("flavour:"+flavour);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		if(cost>0 && cost<=600){
			System.out.println("Valid");
		}
		else{
			System.out.println("Invalid");
		}
	}
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize){
		System.out.println("=====================");
		System.out.println("brand:"+brand);
		System.out.println("serialNo:"+serialNo);
		System.out.println("Price:"+price);
		System.out.println("batteryCapacity:"+batteryCapacity);
		System.out.println("screenSize:"+screenSize);
		System.out.println("OS:"+os);
		System.out.println("harddiskSize:"+harddiskSize);
		System.out.println("ramSize:"+ramSize);
		if(batteryCapacity>0 && batteryCapacity<=5000){
			System.out.println("valid");
		}
		else{
			System.out.println("Invalid");
		}
	
	}
	public static void buySmartWatch(String brand,double price,int color,char type,int mode){
		System.out.println("=====================");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("mode:"+mode);
		if(mode>0 && mode<=4){
			System.out.println("valid");
		}
		else{
			System.out.println("Invalid");
		}
	
	}
}	
		
		
		
		
		
		
		
		
		
		
		
