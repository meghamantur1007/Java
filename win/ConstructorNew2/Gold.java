class Gold{
	double weight;
    double purity;
    double pricePerGram;
	
	public Gold(double weightLocal,double purityLocal,double pricePerGramLocal){
		weight=weightLocal;
		purity=purityLocal;
		pricePerGram=pricePerGramLocal;
		System.out.println("Gold weight:"+weight);
		System.out.println("Gold purity:"+purity);
		System.out.println("Gold pricePerGram:"+pricePerGram);
	}
}