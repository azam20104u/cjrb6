package com.azam.cjrb6.map;

import java.util.Objects;

//User define class if you want to make as a key in map, you have to override hashCode and equals
public class Batch {
	private int id;
	private String batchName;
	public Batch(int id, String batchName) {
		this.id = id;
		this.batchName = batchName;
	}
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Batch exBatch = (Batch) obj;
		return (this.id==exBatch.id) && (this.batchName.equals(exBatch.batchName));
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	@Override
	public String toString() {
		return "Batch [id=" + id + ", batchName=" + batchName + "]";
	}
}
