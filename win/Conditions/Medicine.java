class Medicine{
	public static double price(String medicineName){
		if(medicineName=="Paracetamol"){
			return 5;
		}
		if(medicineName=="Cetirizine"){
			return 8;
		}
		if(medicineName=="Metformin "){
			return 10;
		}
		return 0;
	}
	public static String medicine(String symptom){
		if(symptom=="Headache"){
			return "Paracetamol";
		}
		if(symptom=="Muscle Pain"){
			return "Ibuprofen";
		}
		if(symptom=="Bacterial Infection"){
			return "Amoxicillin ";
		}
	return "Not found";
	}
	public static String availability(String doctorName){
		if(doctorName=="Dr.Smith"){
			return "Monday 9am-12pm";
		}
		if(doctorName=="Dr.John"){
			return "Tuesday 12pm-2pm";
		}
		if(doctorName=="Dr.Taylor"){
			return "Thursday 3pm-5pm";
		}
	return "not found";
	
	}	
}