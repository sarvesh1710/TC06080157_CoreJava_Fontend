package com.acc;

import java.util.ArrayList;

public class TestAnnotations {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list  = new ArrayList();
		list.add("Mahin");
		list.add("Sarvesh");
		list.add("Vijay");
		list.add("Omkar");
		list.add("Ritesh");
		System.out.println(list);
	}

}
