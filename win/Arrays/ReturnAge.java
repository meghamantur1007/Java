class ReturnAge{
	public static int ageReturn(String name){
	String[] names={"Megha","Sandhya","Bhavya"};
	int[] age={22,23,21};
	 
	for(int i=0;i<=names.length;i++){
	    if(names[i]==name){
			for(int j=0;j<age.length;j++){
			if(i==j){
				return age[j];
			}
		}
	}
			
		}
		
		return 0;
	}
	
}
