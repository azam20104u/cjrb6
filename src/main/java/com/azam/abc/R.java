package com.azam.abc;

public class R {
	public static void r() throws InterruptedException {
		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j==n/2||(i==0||i==n/2)&&(j>n/2&&j<n-1)||j==n-1&&(i<n/2&&i>0)||i==j&&i>n/2){
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
