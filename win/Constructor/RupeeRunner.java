class RupeeRunner{
	public static void main(String[] args){
		Rupee rupee1=new Rupee();
		System.out.println("Rupee:"+rupee1.rupee);
		

		AirCondition airCondition=new AirCondition();
		System.out.println("Price:"+airCondition.price);
		
		Autorikshaw autorikshaw=new Autorikshaw();
		System.out.println("Price:"+autorikshaw.color);

		AutoDriver autoDriver=new AutoDriver();
		System.out.println("Price:"+autoDriver.name);
		
		Rapido rapido=new Rapido();
		System.out.println("OTP:"+rapido.otp);
		
		CabCompany cabCompany=new CabCompany();
		System.out.println("CabCompanyName:"+cabCompany.cabCompanyName);

		FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
		System.out.println("FoodDeliveryCompany:"+foodDeliveryCompany.FoodDeliveryCompanyName);

		Matrimony matrimony=new Matrimony();
		matrimony.matrimonyWebsite="Shaadi";
		System.out.println("Matrimony Website updated:"+matrimony.matrimonyWebsite);

		Application application=new Application();
		application.applicationName="LinkedIn";
		System.out.println("Application Name updated:"+	application.applicationName);
		
		Fruit fruit=new Fruit();
		fruit.fruitPrice=60;
		System.out.println("Fruit Price updated:"+fruit.fruitPrice);

		Juice juice=new Juice();
		juice.quantity=350;
		System.out.println("Juice Price updated:"+ juice.quantity);

        Place place=new Place();
		place.placeName="Bangalore";
		System.out.println("Place Name updated:"+place.placeName);
		
		
        AlcoholBrand alcoholBrand=new AlcoholBrand();
		alcoholBrand.alcoholBrandName="Whiskey";
		System.out.println("AlcoholBrandName updated:"+alcoholBrand.alcoholBrandName);
		
		Candy candy=new Candy();
		candy.candyPrice=30;
		System.out.println("Candy Price updated:"+candy.candyPrice);
		
		Medicine medicine=new Medicine();
		medicine.medicineName="Paracetomaol";
		System.out.println("Medicine Name updated:"+medicine.medicineName);
		
		Food food=new Food();
		food.foodItem="Bread";
		System.out.println("Food Item Name updated:"+food.foodItem);
	}
}