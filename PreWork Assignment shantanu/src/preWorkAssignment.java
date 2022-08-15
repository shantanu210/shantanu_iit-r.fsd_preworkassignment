import java.util.Scanner;

 

public class preWorkAssignment{

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {

      }

 

            //function to printPattern

       public void printPattern() {
    	   Scanner scanner = new Scanner(System.in);

    	     // Get the number of rows from the user
    	     System.out.println("Enter the number of rows needed to print the pattern ");

    	     int rows = scanner.nextInt();
    	     System.out.println("## Printing the pattern ##");
    	     
    	     for (int i=1; i<=rows; i++) 
    	     { 
    	         // Print star in decreasing order 
    	         for (int k=rows; k>=i; k--)
    	         {
    	             System.out.print("*");
    	         }
    	         // Print space in increasing order
    	         for (int j=1; j<i; j++)
    	         {
    	             System.out.print(" ");
    	         }
    	         
    	         System.out.println();
    	     }
    	    // scanner.close();
      }

 

          //function to check no is prime or not

       static  boolean isPrime(int num)
       {
           if(num<=1)
           {
               return false;
           }
          for(int i=2;i<num/2;i++)
          {
              if((num%i)==0)
                  return  false;
          }
          return true;
       }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;

          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

    	  preWorkAssignment obj = new preWorkAssignment();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

Scanner sc2= new Scanner(System.in);
System.out.println("Enter a number to check if it is palindrome number or not: ");
int num= sc2.nextInt();
int reversedNum = 0, remainder;

// store the number to originalNum
int originalNum = num;

// get the reverse of originalNum
// store it in variable
while (num != 0) {
  remainder = num % 10;
  reversedNum = reversedNum * 10 + remainder;
  num /= 10;
}

// check if reversedNum and originalNum are equal
if (originalNum == reversedNum) {
  System.out.println(originalNum + " is Palindrome.");
}
else {
  System.out.println(originalNum + " is not Palindrome.");
}

}

break;

 

case 2: {

 

obj.printPattern();
	

}

break;

 

case 3: {

	 Scanner sc1= new Scanner(System.in);
     System.out.println("Enter a number to check if it is truly prime number or not: ");
     int number= sc1.nextInt();
     if(isPrime(number)) {
         System.out.println(number + " is prime number");
     }
     else{
         System.out.println(number + " is a non-prime number");
     }
     
}

break;

 

case 4: {

 

//obj.printFibonacciSeries();
	Scanner sc3= new Scanner(System.in);
    System.out.println("Enter a number to print fibonacci: ");
    int count= sc3.nextInt();
	int n1=0,n2=1,n3,i;    
	System.out.print(n1+" "+n2);//printing 0 and 1    
	    
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }    

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}