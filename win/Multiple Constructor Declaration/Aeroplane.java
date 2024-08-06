class Aeroplane{
	
	String company;
	int noOfSeats;
	double ticketPrice;
	String source;
	String destination;
	
	public Aeroplane(){
		System.out.println("No parameters");
	}
	public Aeroplane(String company,int noOfSeats,double ticketPrice,String source,String destination){
		this.company=company;
		this.noOfSeats=noOfSeats;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
		System.out.println(company);
		System.out.println(noOfSeats);
		System.out.println(ticketPrice);
		System.out.println(source);
		System.out.println(destination);
		
	}
	public Aeroplane(String company,String source,String destination){
		this.company=company;
		this.source=source;
		this.destination=destination;
		System.out.println(company);
		System.out.println(source);
		System.out.println(destination);
		
	}
	public Aeroplane(String company,double ticketPrice,String source,String destination){
		this.company=company;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
		System.out.println(company);
		System.out.println(ticketPrice);
		System.out.println(source);
		System.out.println(destination);
		
	}
	
}