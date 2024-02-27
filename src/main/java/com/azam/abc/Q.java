package com.azam.abc;

public class Q {
	public static void q() throws InterruptedException {
		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if((i==0||i==n*3/4)&&(j<n*3/4&&j>0)||(j==0||j==n*3/4)&&(i<n*3/4&&i>0)||i==j&&j>=n/2){
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
