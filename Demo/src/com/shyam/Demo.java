package com.shyam;

public class Demo {
public static void main(String[] args) {
	int[] arr={1,2,5,6,7,8};
	
	int[] prod= new int[arr.length]; 

	for(int i=0;i<arr.length;i++){//i=1
	int mul=1;
	for(int j=0;j<arr.length;j++){//j=0
	if(i!=j){//F
	mul*=arr[i]*arr[j];//2
	}
	prod[i]=mul;
	}
	
	}
	for(int i=0;i<prod.length;i++){
		System.out.print(prod[i]+" ");
	}

}
}
