import java.util.Scanner;

public class Largest_smallest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        int a = in.nextInt();
        System.out.print("Enter Second Number: ");
        int b = in.nextInt();
        System.out.print("Enter Third Number: ");
        int c = in.nextInt();
        
        int g = Math.max(a, b);
        g = Math.max(g, c);
        
        int s = Math.min(a, b);
        s = Math.min(s, c);
        
        System.out.println("Largest Number = " + g);
        System.out.println("Smallest Number = " + s);
    }


	}
	