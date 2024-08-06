class MaskRunner{
	public static void main(String[] args){
		Mask mask=new Mask();
		Mask mask1=new Mask(50.0);
		Mask mask2=new Mask('M');
		Mask mask3=new Mask("Fabric");
		Mask mask4=new Mask(50,'S',"Fabric");
		Mask mask5=new Mask(50,'S');
	}
}