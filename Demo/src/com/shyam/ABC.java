package com.shyam;

import java.util.Objects;

public class ABC {
private int id;
private String name;
public ABC(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "ABC [id=" + id + ", name=" + name + "]";
}



@Override
public boolean equals(Object o) {
	if(this==o) return true;
	if(o==null || getClass()!=o.getClass()) return false;
	ABC abc=(ABC)o;
	return id==abc.id && Objects.equals(name, abc.name);
}

@Override
public int hashCode() {
	return Objects.hash(id,name);
}
}
