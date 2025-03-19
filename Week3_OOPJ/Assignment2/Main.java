class Main{
	public static void main(String[] args){
		
//Q1:  Write a program to swap two numbers without using a third variable and without using arithmetic operators like  +  or  -.
/*	
		int a = 7;
		int b = 8;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a+" "+b);
*/

//Q2:  Write a program to check whether a given number is even or odd using only bitwise operators. 
/*
		int num = 7;
		if((num & 1)==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
*/

//Q3:  Implement a program that calculates the sum of digits of an integer using modulus ( % ) and division ( / ) operators. 
/*
        int number = 12345;
        int sum = 0;
        while (number != 0) {
            int digit = number%10;
            sum += digit;
            number = number/10;
        }
        System.out.println(sum);
*/

//Q4:  Write a program to find whether a given number is divisible by 3 without using the modulus ( % ) or division ( / ) operators. 
/*
        int number = 12345;
        int sum = 0;
        while (number != 0) {
            sum += number - (number / 10) * 10;
            number = number - (number / 10) * 10;
        }

        if (sum == 3 || sum == 6 || sum == 9 || sum == 12 || sum == 15 || sum == 18 || sum == 21 || sum == 24 || sum == 27 || sum == 30) {
            System.out.println("The number is divisible by 3.");
        } 
		else {
            System.out.println("The number is not divisible by 3.");
        }
*/

//Q5:  Write a Java program to swap two numbers using the += and -= operators only.
/*
        int a = 5;
        int b = 10;
        a += b;
        b = a - b;

        System.out.println("a = " + a + ", b = " + b);
*/

//Q6:  Write a program to find the largest of three numbers using only the ternary operator ( ? : ).
/*
        int a = 10, b = 20, c = 15;

        int l= (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(l);
*/
 
//Q7:  Implement a Java program that checks whether a given year is a leap year or not using logical ( && , || ) operators. 
/*
		int year = 2024;
		
        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } 
		else {
            System.out.println(year + " is not a leap year.");
        }
*/

//Q8:  Write a program that takes three boolean inputs and prints true if at least two of them are true 
/*
        boolean i1 = true;
        boolean i2 = false;
        boolean i3 = true;

        boolean result = (input1 && input2) || (input1 && input3) || (input2 && input3);

        System.out.println(result);
*/

//Q9:  Implement a Java program that checks if a number is within a specific range (20 to 50) without using if-else.
/*
        int number = 35;
        boolean isInRange = (number >= 20) && (number <= 50);

        System.out.println(isInRange);
*/

//Q10:  Write a program to determine if a character is a vowel or a consonant using the ternary operator. 
/*
        char ch = 'a';

        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Vowel" : "Consonant";

        System.out.println(ch + " is a " + result);
*/

//Q11:  Write a program to check if a given number is a  power of 2  using bitwise operators.
/*
        int num = 16;

        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is not a power of 2.");
        }
*/	

//Q12:  Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
/*
        int num = 5;

        int result = num << 3;

        System.out.println(result);
*/

//Q13:  Implement a Java program to find the  absolute value  of an integer using bitwise operators. 
/*
        int num = -42;
        int mask = num >> 31;
        
        int abs = (num + mask) ^ mask;
        
        System.out.println(abs);        
*/

//Q14:  Write a program to count the  number of 1s (set bits)  in a binary representation of a number using bitwise operations.
/* 
        int num = 29;
        
        int count = 0; 

        while (num > 0) {
            num = num & (num - 1);
            count++;
        }
        System.out.println(count);
*/	

//Q15:  Implement a program to swap  odd and even bits  of a number using bitwise operators. 
/* 
        int num = 27;
        
        int EVEN_MASK = 0x55555555;
        int ODD_MASK = 0xAAAAAAAA;

        int swapped = ((num & ODD_MASK) >> 1) | ((num & EVEN_MASK) << 1);
 
        System.out.println("Original number: " + num);
        System.out.println(swapped);
*/

//Q16:  Write a program that determines whether a given number is  positive, negative, or zero  using only the  ternary operator  . 
/* 
        int num = -10;

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println(result);
*/

//Q17:  Implement a Java program that finds the  minimum of four numbers  using nested ternary operators. 
/* 
        int num1 = 10, num2 = 20, num3 = 5, num4 = 15;

        int min = (num1 < num2) 
                  ? ((num1 < num3) 
                      ? ((num1 < num4) ? num1 : num4) 
                      : ((num3 < num4) ? num3 : num4)) 
                  : ((num2 < num3) 
                      ? ((num2 < num4) ? num2 : num4) 
                      : ((num3 < num4) ? num3 : num4)));

        System.out.println(min);
*/

//Q18:  Given a student’s percentage, print  “Pass”  if the percentage is 40 or above; otherwise, print  “Fail”  , using only the ternary operator. 
/*
        int percentage = 45;

        String result = (percentage >= 40) ? "Pass" : "Fail";

        System.out.println(result);
 */

//Q19:  Write a Java program that checks whether a character is  uppercase, lowercase, or not a letter  using only the ternary operator. 
/* 
        char ch = 'A';

        String result = (Character.isUpperCase(ch)) ? "Uppercase"
                    : (Character.isLowerCase(ch)) ? "Lowercase"
                    : "Not a letter";

        System.out.println(result);
*/

//Q20:  Implement a Java program that  returns the absolute value  of a given number using the ternary operator (without using  Math.abs()  ). 
/* 
        int num = -10;

        int absoluteValue = (num >= 0) ? num : -num;
        
        System.out.println("The absolute value of " + num + " is: " + absoluteValue);
*/
        }
}