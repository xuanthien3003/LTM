package bai4;

import java.util.Scanner;

public class bt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Hệ số a:");
		int a=scanner.nextInt();
		System.out.print("Hệ số b:");
		int b=scanner.nextInt();
		System.out.print("Hệ số c:");
		int c=scanner.nextInt();
		double Delta=Math.pow(b,2)-4*a/c;
		System.out.print("Căn delta:");
		System.out.print(Math.sqrt(Delta));
	}

}