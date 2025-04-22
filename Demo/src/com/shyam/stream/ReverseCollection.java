package com.shyam.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseCollection {
public static void main(String[] args) {
	List<String>list=List.of("shyam","sundar","sundar","attending","Interview");
	
	List<String> revList = IntStream.range(0, list.size()).
	mapToObj(i->list.get(list.size()-1-i)).collect(Collectors.toList());

	System.out.println(revList);
}

}
