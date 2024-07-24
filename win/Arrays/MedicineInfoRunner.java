class MedicineInfoRunner{
	public static void main(String[] args){
		if(args.length==4){
			String name=args[0];
			String manufactureDate=args[1];
			String price =args[2];
			String quantity=args[3];
			
		double priceConverted=Double.parseDouble(price);
		int quantityConverted=Integer.parseInt(quantity);
		MedicineInfo.medicine(name,manufactureDate,priceConverted,quantityConverted);
		}
	}
}
