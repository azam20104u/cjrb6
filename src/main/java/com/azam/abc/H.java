package com.azam.abc;

public class H {
	public static void h() throws InterruptedException {
	int n=5;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (j==0||j==n-1||i==n/2) {
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
