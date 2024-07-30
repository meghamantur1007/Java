class Board{
	String material;
    String size;
    double price;
	
	public Board(String materialLocal,String sizeLocal,double priceLocal){
		material=materialLocal;
		size=sizeLocal;
		price=priceLocal;
		System.out.println("Board material:"+material);
		System.out.println("Board size:"+size);
		System.out.println("Board price:"+price);
	}
}