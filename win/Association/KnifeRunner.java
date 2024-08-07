class KnifeRunner{
	public static void main(String[] args){
		Knife knife=new Knife(20,3);
		Nayana nayana=new Nayana(8782784544L,knife);
		knife.details();
		nayana.show();
		
		System.out.println("=============");
		
		Knife knife1=new Knife(10,4);
		Nayana nayana1=new Nayana(9876233456L,knife);
		knife1.details();
		nayana1.show();
	}
}