package com.azam.cjrb6.queue;

public class Candidate implements Comparable<Candidate> {
	private String name;
	private int yoe;
	
	@Override
	public int compareTo(Candidate o) {
		return this.yoe-o.yoe;
	}
	public Candidate(String name, int yoe) {
		this.name = name;
		this.yoe = yoe;
	}

	public String getName() {
		return name;
	}

	public int getYoe() {
		return yoe;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", yoe=" + yoe + "]";
	}

}
