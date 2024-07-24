class GreetingRunner{
	public static void main(String[] args){
		int number=Greeting.number("Organization");
		System.out.println("number:"+number);
		String name=Greeting.name(2);
		System.out.println("name:"+name);
		Greeting.checkEven(false);
		
	}
}