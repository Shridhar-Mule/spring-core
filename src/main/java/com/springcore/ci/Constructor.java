package com.springcore.ci;

public class Constructor {
	
	private String name;
	private String personId;
	
	
	public Constructor(String name , String personId) 
	{
		this.name=name;
		this.personId=personId;
		
		
	}


	@Override
	public String toString() {
		return this.name+ " :" +this.personId;
	}
	
	

}
