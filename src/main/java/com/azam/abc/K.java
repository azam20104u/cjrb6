package com.azam.abc;

public class K {
	public static void k() throws InterruptedException {
		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j==n/2||i+j==n-1&&i<n/2||i==j&&i>n/2) {
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
