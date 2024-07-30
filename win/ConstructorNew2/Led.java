class Led{
	String color;
    int brightness;
    double price;
	
	public Led(String colorLocal,int brightnessLocal,double priceLocal){
		color=colorLocal;
		brightness=brightnessLocal;
		price=priceLocal;
		System.out.println("Led color:"+color);
		System.out.println("Led brightness:"+brightness);
		System.out.println("Led price:"+price);
	}
}