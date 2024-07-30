class SimCard{
	String carrier;
    String type;
    double price;
	
	public SimCard(String carrierLocal,String typeLocal,double priceLocal){
		carrier=carrierLocal;
		type=typeLocal;
		price=priceLocal;
		System.out.println("SimCard carrier:"+carrier);
		System.out.println("SimCard type:"+type);
		System.out.println("SimCard price:"+price);

	}
}