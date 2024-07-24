class JuiceInformationRunner{
	public static void main(String[] args){
		if(args.length==5){
		String name=args[0];
		String brand=args[1];
		String flavour=args[2];
		String price=args[3];
		String quantity=args[4];
			
		double priceConverted=Double.parseDouble(price);
		int quantityConverted=Integer.parseInt(quantity);
		JuiceInformation.juice(name,brand,flavour,priceConverted,quantityConverted);
		}
	}
}