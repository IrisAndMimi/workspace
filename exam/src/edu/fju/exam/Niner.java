package edu.fju.exam;

public class Niner {

	public static void main(String[] args) {
		int a=1;
		int b=0;
		while(b<5){
			b=b+1;
			while(a<5){
				a=a+1;
				System.out.print(a+"x"+b+"="+a*b+"	");	
			}
			System.out.println();
			a=1;
		}
	}
}
