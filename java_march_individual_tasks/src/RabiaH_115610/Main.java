package RabiaH_115610;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Scanner class object to get input from console
		Scanner sc=new Scanner(System.in);
		// creating array of integers
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		int[] num = new int[n];
		System.out.println("Enter array elements: ");
		// read array elements from console
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		sc.close();
		// call getSumOfPower() method of UserMainCode class
		int sum=UserMainCode.getSumOfPower(num);
		System.out.println("Sum of power of array elements: "+sum);
	}
}



class UserMainCode{
	// method to calculate sum of power of array elements
	static int getSumOfPower(int[] num) {
		// to store sum
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+(int)Math.pow(num[i], i);
		}
		// return sum value
		return sum;
	}
}
