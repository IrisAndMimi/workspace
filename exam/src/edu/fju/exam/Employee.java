package edu.fju.exam;

public class Employee {
	int money;
	String nam;
	public Employee(String nam,int money){
		this.money = money;
		this.nam = nam;
		System.out.println(nam+" "+money);
	}
	public void ptInfo(String nam,int money){
		this.money = money;
		this.nam = nam;
		System.out.println(nam+" "+money);
	}
	
	
}
