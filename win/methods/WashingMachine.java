class WashingMachine{
	public static void main(String[] args){
		
	}
	public static void rinse()
	{
		System.out.println("running rinse in WashingMachine");
	}
	public static void makenoise()
	{
		System.out.println("running makenoise in WashingMachine");
		shake();
	}
	public static void shake()
	{
		System.out.println("running shake in WashingMachine");
		makenoise();
	}
}
