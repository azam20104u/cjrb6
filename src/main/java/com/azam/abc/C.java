package com.azam.abc;

public class C {

	public static void c() throws InterruptedException {

		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j==0||(i==0||i==n-1)&&j<=n/2) {
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
