class MedicineRunner{
	public static void main(String[] args){
	double price=Medicine.price("Paracetamol");
	System.out.println("price:"+price);
	price=Medicine.price("Cetirizine");
	System.out.println("price:"+price);
	price=Medicine.price("Metformin");
	System.out.println("price:"+price);
	price=Medicine.price("Amlodipine ");
	System.out.println("price:"+price);
	System.out.println("==================");
	String medicine=Medicine.medicine("Headache");
	System.out.println("medicine:"+medicine);
	medicine=Medicine.medicine("Muscle Pain");
	System.out.println("medicine:"+medicine);
	medicine=Medicine.medicine("Bacterial Infection");
	System.out.println("medicine:"+medicine);
	medicine=Medicine.medicine("Allergies");
	System.out.println("medicine:"+medicine);
	System.out.println("==================");
	String availability=Medicine.availability("Dr.Smith");
	System.out.println("availability:"+availability);
	availability=Medicine.availability("Dr.John");
	System.out.println("availability:"+availability);
	availability=Medicine.availability("Dr.Taylor");
	System.out.println("availability:"+availability);
	availability=Medicine.availability("Dr.Brown");
	System.out.println("availability:"+availability);
	
	
	
}
}