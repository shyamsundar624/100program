package com.shyam.collection;

import java.util.Objects;

public class Person {
String title;
String author;


@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return Objects.hash(title,author);
}


@Override
public boolean equals(Object obj) {
	if(this==obj) return true;
	if(!(obj instanceof Person)) return false;
	Person person=(Person)obj;
	
	return Objects.equals(title, person.title) && Objects.equals(author, person.author);
}


public Person(String title, String author) {
	super();
	this.title = title;
	this.author = author;
}


@Override
public String toString() {
	return "Person [title=" + title + ", author=" + author + "]";
}


}
