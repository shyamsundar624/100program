package com.shyam.collection;

import java.util.Stack;

public class BalancedParentheses {

	public static boolean isBalanced(String expr) {
		Stack<Character> stack=new Stack<>();
		
		for(Character ch:expr.toCharArray()) {
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
			}else if((ch=='(' || ch==')') && !stack.isEmpty()) {
				stack.pop();
			}else if((ch=='{' || ch=='}') && !stack.isEmpty()) {
				stack.pop();
			}else if((ch=='[' || ch==']') && !stack.isEmpty()) {
				stack.pop();
			}else {
				return false;
			}
		}
		return stack.isEmpty();		
	}
	
	
	public static void main(String[] args) {
		String str="[({])}";
		
		System.out.println("Is Balanced "+isBalanced(str));
	}
}
