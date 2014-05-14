package com.lab3.piority_queue;

import java.util.Arrays;


public class ClassTest {

	public static void main(String[] args) {
		Car[] CarArrays = new Car[] {
				new Car("TOYOTA","รถเก๋ง",530000),
				new Car("ISUZU","กระบะ",800000)};
				Arrays.sort(CarArrays);
				System.out.println(Arrays.toString(CarArrays));

	}
}
