package com.azam.abc;

public class M {
	public static void m() throws InterruptedException {
		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j==0||j==n-1||(i==j||i+j==n-1)&&i<=n/2) {
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
