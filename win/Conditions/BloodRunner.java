class BloodRunner{
	public static void main(String[] args){
		String group=Blood.group();
		System.out.println("group:"+group);
		String personName=Blood.personName();
		System.out.println("personName:"+personName);
		double cost=Blood.cost();
		System.out.println("cost:"+cost);
		String hospitalTested=Blood.hospitalTested();
		System.out.println("hospitalTested:"+hospitalTested);
		boolean sicknessOrNot=Blood.sicknessOrNot();
		System.out.println("sicknessOrNot:"+sicknessOrNot);
		boolean donateOrNot=Blood.donateOrNot();
		System.out.println("donateOrNot:"+donateOrNot);
		
	
	}
	
}