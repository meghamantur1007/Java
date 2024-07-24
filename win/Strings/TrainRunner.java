class TrainRunner{
	public static void main(String[] args){
		Train.book("Bangalore","Mysore");
		Train.book("Bangalore","Chikkmangalur",1);
		Train.book("Belagaum","Udupi",1,470);
		Train.cancel(36511983);
		Train.cancel("Bangalore","Hasan");
	}
}