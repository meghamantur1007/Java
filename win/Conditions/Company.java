class Company{
	public static double salary(int age,char gender){
		double salary=15000;
		double salaryIncrement=salary+2000;
		double salaryIncrement1=salary+4000;
		insurance=3000
		double salary1=salary-insurance;
		emi=2000
		double salary2=salary-emi;
		
		
		if(age>18 && age<=25){
			return salary;
		}
		if(age>25 && age<=30){
			return salaryIncrement;
		if(gender=='M'){
			return salary1;
		}
		if(gender=='F'){
			return salary2;
		}
		}
		if(age>30){
			return salaryIncrement1;
		}
		}
		return 0;
		
	}
}