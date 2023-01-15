package Question12;

import java.util.Scanner;

public class Sum_of_oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, i, evenSum = 0, oddSum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		i = 1;
		
		while(i <= number)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
			else
			{
				oddSum = oddSum + i;
			}
			i++;
		}
		System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
		System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);

	}

}
