class Minister{
	public static void serve(){
		System.out.println("Giving Services");
		Assistant.help();
	}
}
class Assistant{
	public static void help(){
		System.out.println("Assistant will help");
		Driver.drive();
	}
}
class Driver{
	public static void drive(){
		System.out.println("Driver is driving");
		Vehicle.transport();
	}
}
class Vehicle{
	public static void transport(){
		System.out.println("Vehicles are used to transport");
		MusicSystem.play();
	}
}
class MusicSystem{
	public static void play(){
		System.out.println("MusicSystem will plays the music");
		Application.run();
	}
}
class Application{
	public static void run(){
		System.out.println("Application is running");
		Internet.stream();
	}
}
class Internet{
	public static void stream(){
		System.out.println("Show is available in the internet");
		Server.connect();
	}
}
class Server{
	public static void connect(){
		System.out.println("Connecting Servers");
		Location.display();
	}
}
class Location{
	public static void display(){
		System.out.println("Best location to build house");
		Building.openGate();
	}
}
class Building{
	public static void openGate(){
		System.out.println("Building with openGate");
		Metal.strength();
	}
}
class Metal{
	public static void strength(){
		System.out.println("Metal has strength");
		Factory.make();
	}
}
class Factory{
	public static void make(){
		System.out.println("Cake Factory");
		Machine.design();
	}
}
class Machine{
	public static void design(){
		System.out.println("Machine design");
		Engineer.nothing();
		}
}
class Engineer{
	public static void nothing(){
		System.out.println("Nothing");
	}
}