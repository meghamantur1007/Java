class Kerosene {
     double price;
     int quantity;
     boolean quality;

    public Kerosene() {
       System.out.println("No parameters");
    }

    public Kerosene(double price, int quantity, boolean quality) {
        this.price = price;
        this.quantity = quantity;
        this.quality = quality;
		System.out.println(price);
		System.out.println(quality);
		System.out.println(quantity);
    }

    public Kerosene(boolean quality) {
        this.quality = quality;
		System.out.println(quality);
    }

    public Kerosene(double price) {
        this.price = price;
		System.out.println(price);
	}
}