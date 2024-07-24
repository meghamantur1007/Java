class BuyRunner{
	public static void main(String[] args){
		Buy.product("Clock",200);
		Buy.product("Clock",-100);
		Buy.product("Shoes",30,"Thirty",400);
		Buy.product("Shoes",-20,"Minustwenty",400);
		Buy.bookMovieTicket("QuitePlace","PVR",3,-500);
		Buy.bookMovieTicket("QuitePlace","PVR",3,500);
		Buy.buyEgg(-5,7);
		Buy.buyEgg(3,8);
		Buy.buyShampoo(10,20,"Pantene","04/07/2024");
		Buy.buyShampoo(-4,20,"Pantene","04/07/2024");
		Buy.buyCake('1',"Red velvet","Yellow Butter",-500.00, 1);
		Buy.buyCake('1',"Red velvet","Yellow Butter",600.50, 1);
		Buy.buyLaptop("HP",67890,45950,-4500,14.0,"Windows 11",512,8);
		Buy.buyLaptop("Dell",12345,60000,5000,15.6,"Windows 10",1000,16);
		Buy.buySmartWatch("Apple", 3999.00,2,'S',4);
		Buy.buySmartWatch("Samsung", 5000.00,3,'C',-2);
	}
}