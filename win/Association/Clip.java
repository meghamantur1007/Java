class Clip{
	String color;
	String type; //Scunci
	
	Clip(String color,String type){
		this.color=color;
		this.type=type;
	}
	public void display(){
		System.out.println("Color: "+color);
		System.out.println("Type: "+type);

	}
}