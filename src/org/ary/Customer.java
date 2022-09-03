package org.ary;

public class Customer {
	public static void main(String[] args) {
		int a[]= new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		int length = a.length;
		System.out.println(length);
		System.out.println(a[2]);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i : a) {
			System.out.println(i);
			
		}
			
			
		}
		
	}


