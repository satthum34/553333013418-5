package com.lab1.football;

public class LeonalMesi {
	private String name = "";
	private String position = "";
	private String friend[];
	public LeonalMesi() {
		name = "Leonal Mesi";
		position = "ST";
		friend = new String[] {"Puyol","Pique","Xavi"};
	}
	public LeonalMesi(int a){
		System.out.println("Leonal Mesi Overloading 1");
	}
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	public String[] getFriend() {
		return friend;
	}

}
