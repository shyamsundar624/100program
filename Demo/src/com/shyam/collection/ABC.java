package com.shyam.collection;

import java.util.Objects;

public class ABC {
	int id;
	String name;

	

	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}


	@Override
	public boolean equals(Object obj) {
		if(this==obj)return true;
		if(obj==null || getClass()!=obj.getClass()) return false;
		ABC abc=(ABC)obj;
		return id==abc.id && Objects.equals(name, abc.name);
	}


	public ABC(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "ABC [id=" + id + ", name=" + name + "]";
	}

	
}
