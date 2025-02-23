class S2Q4{
	public static void main(String args[]){
	int p = 490;
	String c = "No";
	if(c=="Yes"){
		if(p>=1000){
			System.out.println(p-(p*25/100));
		}
		else if(p>=500){
			System.out.println(p-(p*15/100));
		}
		else{
			System.out.println(p-(p*10/100));
		}
	}
	else{
		if(p>=1000){
			System.out.println(p-(p*20/100));
		}
		else if(p>=500){
			System.out.println(p-(p*10/100));
		}
		else{
			System.out.println(p-(p*5/100));
		}
	}

	}
}