class CountryRunner{
	public static void main(String[] args){
		String country=Country.countryCode(91);
		System.out.println("country:"+country);
		country=Country.countryCode(1);
		System.out.println("country:"+country);
		country=Country.countryCode(44);
		System.out.println("country:"+country);
		country=Country.countryCode(52);
		System.out.println("country:"+country);
		country=Country.countryCode(86);
		System.out.println("country:"+country);
		country=Country.countryCode(7);
		System.out.println("country:"+country);
		System.out.println("==================");
		double price=Country.price("Milk");
		System.out.println("price:"+price);
		price=Country.price("White Bread");
		System.out.println("price:"+price);
		price=Country.price("Rice");
		System.out.println("price:"+price);
		price=Country.price("Egg");
		System.out.println("price:"+price);
		price=Country.price("Pizza");
		System.out.println("price:"+price);
		price=Country.price("Cheese");
		System.out.println("price:"+price);
		System.out.println("==================");
		String producerName=Country.producerName("Raajakumara");
		System.out.println("producerName:"+producerName);
		producerName=Country.producerName("Mufti");
		System.out.println("producerName:"+producerName);
		producerName=Country.producerName("KGF:Chapter 2");
		System.out.println("producerName:"+producerName);
		producerName=Country.producerName("Tagaru");
		System.out.println("producerName:"+producerName);
		producerName=Country.producerName("Roberrt");
		System.out.println("producerName:"+producerName);
		producerName=Country.producerName("Mussanje Maatu");
		System.out.println("producerName:"+producerName);
	}
}