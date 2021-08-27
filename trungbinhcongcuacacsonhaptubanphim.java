package lethanh;

import java.util.Scanner;

public class trungbinhcongcuacacsonhaptubanphim {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("trung binh cong cac so tu 1 den ... ");
		int n = scn.nextInt();
		int sum=0;
		for (int i=0;i<=n;i++) {
		     sum +=i;   
		}	 System.out.println(sum/n);
	}
}
