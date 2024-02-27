package com.azam.abc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.next();
		char [] cr=name.toCharArray();
		for (int i = 0; i < cr.length; i++) {
			switch (cr[i]) {
			case 'A':
				A.a();
				System.out.println();
				break;
			case 'B':
				B.b();
				System.out.println();
				break;
			case 'C':
				C.c();
				System.out.println();
				break;
			case 'D':
				D.d();
				System.out.println();
				break;
			case 'E':
				E.e();
				System.out.println();
				break;
			case 'F':
				F.f();
				System.out.println();
				break;
			case 'G':
				G.g();
				System.out.println();
				break;
			case 'H':
				H.h();
				System.out.println();
				break;
			case 'I':
				I.i();
				System.out.println();
				break;
			case 'J':
				J.j();
				System.out.println();
				break;
			case 'K':
				K.k();
				System.out.println();
				break;
			case 'L':
				L.l();
				System.out.println();
				break;
			case 'M':
				M.m();
				System.out.println();
				break;
			case 'N':
				N.n();
				System.out.println();
				break;
			case 'O':
				O.o();
				System.out.println();
				break;
			case 'P':
				P.p();
				System.out.println();
				break;
			case 'Q':
				Q.q();
				System.out.println();
				break;
			case 'R':
				R.r();
				System.out.println();
				break;
			case 'S':
				S.s();
				System.out.println();
				break;
			case 'T':
				T.t();
				System.out.println();
				break;
			case 'U':
				U.u();
				System.out.println();
				break;
			case 'V':
				V.v();
				System.out.println();
				break;
			case 'W':
				W.w();
				System.out.println();
				break;
			case 'X':
				X.x();
				System.out.println();
				break;
			case 'Y':
				Y.y();
				System.out.println();
				break;
			case 'Z':
				Z.z();
				System.out.println();
				break;
			default:
				break;
			}
		}
	}
}
