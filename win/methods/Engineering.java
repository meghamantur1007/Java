class Engineering{
	public static void research(){
		System.out.println("Doing Research");
	}
	public static void development(){
		System.out.println("Development'");
		research();
	}
	public static void Design(){
		System.out.println("Design");
		development();
	}
	public static void teaching(){
		System.out.println("Teaching");
	}
	public static void construction(){
		System.out.println("Doing construction");
	}
}