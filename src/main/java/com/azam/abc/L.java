package com.azam.abc;

public class L {
	public static void l() throws InterruptedException {
		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j==0||j==n-2&&i>n*3/4||i==n-1&&j<n-1) {
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
