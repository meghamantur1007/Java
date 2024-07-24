class DeliveryVehicle{
	public static void deliver(String item,String location){
		System.out.println("running deliver in DeliveryVehicle");
		Company.deliver(item,location);
	}
}