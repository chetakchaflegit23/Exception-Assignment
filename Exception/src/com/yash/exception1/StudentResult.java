package com.yash.exception1;

public class StudentResult
{
	int mathe;
	int geography;
	int physics;
	public int getMathe() {
		return mathe;
	}
	public void setMathe(int mathe) {
		this.mathe = mathe;
	}
	public int getGeography() {
		return geography;
	}
	public void setGeography(int geography) {
		this.geography = geography;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	
	public void result() throws ResultException
	{
		int total= (mathe+geography+physics)*100;
		int avg=total/300;
		System.out.println(avg);	
		
		if(mathe<0 || geography<0 || physics<0)
		{
			throw new ResultException("Marks cant be Negative");
		}
		
		else if(avg<40 )
		{
			throw new ResultException("your result is fail");
		
		}
		else {System.out.println("Passsssss bete");}
		
	}
	
	
	
	
}
