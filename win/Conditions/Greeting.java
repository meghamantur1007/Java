class Greeting{
	public static int number(String name){
		if(name=="X-Workz"){
			return 12;
		}
		else if(name=="Institution"){
			return 15;
		}
		return 20;
	}
	public static String name(int number){
		if(number==2){
			return "X-Workz";
		}
		else{
			return "Organization";
		}
	}
	public static void checkEven(boolean condition){
		if(condition==true){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
			
		}
		return;
	}
}