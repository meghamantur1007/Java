class DeliveryGuy{
	public static void deliver(String item){
		System.out.println("running deliver in DeliverGuy");
		DeliveryVehicle.deliver(item,"Bangalore");
	}
}