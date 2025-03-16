class Main{
	public static void main(String[] args){
	
//ques1: Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.

		byte a=0;
		short b=0;
		int c=0;
		long d=0L;
		float e=0.0f;
		double f=0.0;
		char g='\u0000';
		boolean h=false;
		
		byte aa=4;
		short bb=122;
		int cc=24455;
		long dd=3463463L;
		float ee=1.613f;
		double ff=5.5874545;
		char gg='C';
		boolean hh=true;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		System.out.println(ee);
		System.out.println(ff);
		System.out.println(gg);
		System.out.println(hh);

//ques2: Write a program to convert an int value to double automatically and display both values.
		
		int n = 5;
		System.out.println(n);
		double j = n;
		System.out.println(j);

//ques3: Write a program to convert a double value to int using typecasting and explain the data loss.

		double n = 5.4;
		System.out.println(n);
		int j = (int)n;
		System.out.println(j);

//ques4: Write a program to calculate the average of three int numbers using typecasting to display the result in double.

		int n=6;
		int j =6;
		int f=7;
		double m = (n+j+f)/3;
		System.out.println(m);


//ques5: Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.

        int binaryLiteral = 0b1010;  // binary literal
        int octalLiteral = 012;      // octal literal
        int hexLiteral = 0x1A;       // hexadecimal literal
        float floatLiteral = 3.14f;  // floating-point literal
        double doubleLiteral = 3.14159;  // double floating-point literal
        
        System.out.println("Binary Literal: " + binaryLiteral);
        System.out.println("Octal Literal: " + octalLiteral);
        System.out.println("Hexadecimal Literal: " + hexLiteral);
        System.out.println("Floating-point Literal (float): " + floatLiteral);
        System.out.println("Floating-point Literal (double): " + doubleLiteral);
		
//ques6. Write a program to display character and string literals along with their ASCII values.

        char character = 'A';
        String stringLiteral = "Hello";
        System.out.println("Character: " + character + ", ASCII Value: " + (int)character);
        System.out.println("String: " + stringLiteral);
		System.out.println("ASCII Value of first char: " + (int)stringLiteral.charAt(0));
		
		
//ques7. Write a program that uses boolean literals to control program flow in an if-else statement.

        boolean flag = true;
        if (flag) {
            System.out.println("In if statement");
        } else {
            System.out.println("In Else Statement");
			
//ques8. Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.
        
		int num1 = 10;
		int num2 = 5;
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
		
//ques9. Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.

        int a = 10;
		int b = 5;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
		
//ques10. Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=) and display the results.

//ques11. Write a program to check if a number is positive and even using logical operators (&&, ||, !).

        int num = 6;
        if (num > 0 && num % 2 == 0) {
            System.out.println("Number is positive and even");
        } else {
            System.out.println("Number is either non-positive or not even");
        }
		
		
//ques12. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.		
		
        int x = 10;
		int y = 5;
        x += y;
        System.out.println("x += y: " + x);
        x -= y;
        System.out.println("x -= y: " + x);
        x *= y;
        System.out.println("x *= y: " + x);
        x /= y;
        System.out.println("x /= y: " + x);
        x %= y;
        System.out.println("x %= y: " + x);
	}
}
