package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {

		String a = new String(" abcd");		// 앞에 한 칸 띄움
		String b = new String(" ,efg ");	// 뒤에 한 칸 띄움

		System.out.println(a.concat(b));
		System.out.println(a + b);

		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a.trim());

	}

}
