class BackwardRunner{
	public static void main(String[] args){
		String[] state={"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", 
		"Chhattisgarh","Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand",
		"Karnataka","Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", 
		"Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu",
		"Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal", "Ladakh"};
		System.out.println(state.length);
		Backward.statesOfIndia(state);

		System.out.println("===============================");
		
		int[] pincodes={500001, 791111, 781001, 800001, 492001,
            403001, 380001, 122001, 171001, 834001};
		Backward.pincodesOfStates(pincodes);
		System.out.println("===============================");
		
		
		String[] primeMinisters={"Jawaharlal Nehru","Gulzarilal Nanda","Lal Bahadur Shastri","Indira Gandhi","Morarji Desai",
								"Charan Singh","Rajiv Gandhi","Vishwanath Pratap Singh","Chandra Shekhar","P. V. Narasimha Rao",
								"Atal Bihari Vajpayee","H. D. Deve Gowda","I. K. Gujral","Manmohan Singh","Narendra Modi"};
		Backward.primeMinistersOfIndia(primeMinisters);	
		System.out.println("===============================");
		
		
		
		String[] cabinateMinistersList={"Jawaharlal Nehru", "Lal Bahadur Shastri", "Indira Gandhi", "Rajiv Gandhi", 
		"P. V. Narasimha Rao", "Atal Bihari Vajpayee", "Manmohan Singh", "Narendra Modi", "Amit Shah", "Nirmala Sitharaman",
		"Rajnath Singh", "S. Jaishankar", "Arjun Munda", "Dharmendra Pradhan", "Mansukh Mandaviya", "Piyush Goyal", "Narendra Singh Tomar", 
		"Nitin Gadkari", "Giriraj Singh", "Jyotiraditya Scindia", "Raj Kumar Singh", "Anurag Thakur", "Smriti Irani", "Pralhad Joshi",
		"Kiren Rijiju", "Hardeep Singh Puri", "Jitendra Singh", "Sanjay Kumar Jaiswal", "Babul Supriyo", "Ravi Shankar Prasad"};
		Backward.cabinateMinistersOfIndia(cabinateMinistersList);
		System.out.println("===============================");
		
	
		
		String[] politicalPartiesList={"Bharatiya Janata Party (BJP)", "Indian National Congress (INC)", 
		"Communist Party of India (Marxist) (CPI(M))", "Aam Aadmi Party (AAP)", "Nationalist Congress Party (NCP)"};
		Backward.politicalPartiesOfIndia(politicalPartiesList);

		
	}
}
