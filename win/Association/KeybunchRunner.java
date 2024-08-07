class KeybunchRunner{
	public static void main(String[] args){
		Key key=new Key(20,"KeySmart");
		Keybunch keybunch=new Keybunch("Aluminum",key);
		key.display();
		keybunch.show();
		
		System.out.println("=============");
		
		Key key1=new Key(10,"Orbitkey");
		Keybunch keybunch1=new Keybunch("Leather",key);	
		key1.display();
		keybunch1.show();
	}
}