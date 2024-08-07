class ClipRunner{
	public static void main(String[] args){
		Clip clip=new Clip("White","Scunci");
		Megha megha=new Megha("meghamantur@gmail.com",clip);
		clip.display();
		megha.show();
		System.out.println("=============");

		Clip clip1=new Clip("Pink","Clutcher");
		Megha megha1=new Megha("meghamantur22@gmail.com",clip);
		clip1.display();
		megha1.show();
	}
}