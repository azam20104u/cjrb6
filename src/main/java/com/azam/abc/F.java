package com.azam.abc;

public class F {
	public static void f() throws InterruptedException {

		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j==0||i==0&&j<=n*3/4||i==n/2&&j<=n/2){
					System.out.print(" *");
					Thread.sleep(500);
				}
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
