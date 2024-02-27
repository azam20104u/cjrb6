package com.azam.abc;

public class N {
	public static void n() throws InterruptedException {
		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j==0||j==n-1||i==j){
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
