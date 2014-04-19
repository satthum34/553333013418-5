package com.lab1.football;

import java.util.Arrays;

public class TestFootball {

	public static void main(String[] args) {
		LeonalMesi lm = new LeonalMesi();
		System.out.println("name : "+lm.getName());
		System.out.println("position : "+lm.getPosition());
		System.out.println("friend : "+Arrays.toString(lm.getFriend()));
		new LeonalMesi(1);		
	}

}
