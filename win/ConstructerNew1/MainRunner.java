class MainRunner{
	public static void main(String[] args){
		Charger charger=new Charger();
		charger.brand="Samsung";
		charger.type="Type-C";
		System.out.println("Charger Brand: "+charger.brand);
		System.out.println("Charger powerRating: "+charger.powerRating);
		System.out.println("Charger Type: "+charger.type);
		System.out.println("==========");

		Claw claw=new Claw();
		claw.sharpness="Sharp";
		claw.color="White";
		System.out.println("Claw Length: "+claw.length);
		System.out.println("Claw Sharpness: "+claw.sharpness);
		System.out.println("Claw Color :" +claw.color);
		System.out.println("==========");

		Crow crow=new Crow();
		crow.age=5;
		crow.habitat="Forest";
		System.out.println("Crow Color: "+crow.color);
		System.out.println("Crow Age: "+crow.age);
		System.out.println("Crow Habitat: "+crow.habitat);
		System.out.println("==========");
		
		Clock clock=new Clock();
		clock.shape="Square";
		clock.color="Black";
		System.out.println("Clock Shape: "+clock.shape);
		System.out.println("Clock is working or not:"+clock.isWorking);
		System.out.println("Clock Color: "+clock.color);
		System.out.println("==========");
		
		Lollipop lollipop=new Lollipop();
		lollipop.flavor="Strawberry";
		lollipop.color="Pink";
		System.out.println("Lollipop Flavour: "+lollipop.flavor);
		System.out.println("Lollipop Color: "+lollipop.color);
		System.out.println("Lollipop Size: "+lollipop.size);
		System.out.println("==========");
		
		Jean jean=new Jean();
		jean.brand="Zara";
		jean.price=1500;
		System.out.println("Jean brand: "+jean.brand);
		System.out.println("Jean size: "+jean.size);
		System.out.println("Jean price: "+jean.price);
		System.out.println("==========");
		
		Keyboard keyboard=new Keyboard();
		keyboard.numberOfKeys=50;
		keyboard.isMechanical=true;
		System.out.println("Keyboard brand: "+keyboard.brand);
		System.out.println("Number Of Keys:"+keyboard.numberOfKeys);
		System.out.println("Is Keyboard Mechanical:"+keyboard.isMechanical);
		System.out.println("==========");
		
		Mountain mountain=new Mountain();
		mountain.height=8848.86;
		mountain.location="Nepal/China border";
		System.out.println("Mountain Name:"+mountain.name);
		System.out.println("Mountain Height:"+mountain.height);
		System.out.println("Mountain Location:"+mountain.location);
		System.out.println("==========");
		
		Stadium stadium=new Stadium();
		stadium.capacity=40000;
		stadium.location="Bangalore";
		System.out.println("Stadium name:"+stadium.name);
		System.out.println("Stadium Capacity:"+stadium.capacity);
		System.out.println("Stadium Location:"+stadium.location);
		System.out.println("==========");
		
		Spray spray=new Spray();
		spray.type="Paint";
		spray.color="Red";
		System.out.println("Spray Type: "+spray.type);
		System.out.println("Spray volume: "+spray.volume);
		System.out.println("Spray Color: "+spray.color);

		

	}
}