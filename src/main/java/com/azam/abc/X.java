package com.azam.abc;

public class X {
	public static void x() throws InterruptedException {
		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i==j||i+j==n-1){
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
