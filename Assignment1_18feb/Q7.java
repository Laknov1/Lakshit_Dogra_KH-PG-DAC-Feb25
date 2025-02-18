//find the largest of the three numbers

class Q7{
	public static void main(String args[]){

//enter three numbers

	int a = 10;
	int b = 7;
	int c = 8;

//if block with condition if a is greater than b

	if(a>b){
		if(a>c){
			System.out.println("A is the largest number");
		}
		else{
			System.out.println("C is the largest number");
		}
	}

//else block if a is not greater than b

	else{
		if(b>c){
			System.out.println("B is the largest number");
		}
		else{
			System.out.println("C is the largest number");
		}
	}
	}
}