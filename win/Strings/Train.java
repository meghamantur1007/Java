class Train{
	public static void book(String source,String destination){
		System.out.println("running book in class train with String source and String destination parameters");
		System.out.println("Source:"+source);
		System.out.println("destination:"+destination);
	}
	
	public static void book(String source,String destination,int quantity){
		System.out.println("running book in class train with String source and String destination and int quantity parameters");
		System.out.println("Source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
	}
	
	public static void book(String source,String destination,int quantity,double price){
		System.out.println("running book in class train with String source and String destination,int quantity and double price parameters");
		System.out.println("Source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);	
	}
	public static void cancel(int ticketno){
		System.out.println("running cancel method in class train with int ticketno");
		System.out.println("ticketno:"+ticketno);
	}
	public static void cancel(String source,String destination){
		System.out.println("running cancel method in class train with String source and String destination parameters");
		System.out.println("Source:"+source);
		System.out.println("destination:"+destination);
	}
		
}