package practice;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.next();
		//with string builder
		String rev=new StringBuilder(s).reverse().toString();
		//w/o StringBuilder
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
		if(s.equals(reverse)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
sc.close();
	}

}
