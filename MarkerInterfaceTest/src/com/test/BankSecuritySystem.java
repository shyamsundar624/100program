package com.test;

import java.security.DomainCombiner;

public class BankSecuritySystem {
public static void grantAccess(Object obj) {
	if(obj instanceof SecureAccess) {
		System.out.println("Access Granted To "+obj.getClass().getSimpleName());
	}else {
		System.out.println("Access Denied To "+obj.getClass().getSimpleName());
	}
	
}
public static void main(String[] args) {
	Manager m=new Manager();
	SecurityOfficer so=new SecurityOfficer();
	Intern i=new Intern();
	Clerk c=new Clerk();
	
	grantAccess(m);
	grantAccess(so);
	grantAccess(i);
	grantAccess(c);
}
}
