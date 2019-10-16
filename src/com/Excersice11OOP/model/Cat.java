package com.Excersice11OOP.model;
//abstract 
//implements Catable

public class Cat {
	private int id;
	private String name;
	private int age;
	
	//constructor SIN parametrizar
	public Cat()
	{
		
	}
	
	//constructor PARAMETRIZADO
	public Cat(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
////////////////////////////////////	
	//Getters an setters
	//tienen que ser publicos
	
	//Getter del parametro id (hacer que sea leible)
	public int getId()
	{
		return id;
	}
	
	//Setter del parametro id (hacer que sea escribible)
	public void setId(int id)
	{
		this.id=id;
	}
	
/////////////////////////////////////////////	
	//Getter del parametro Name (hacer que sea leible)
	public String getName()
	{
		return name;
	}
	
	//Setter del parametro name (hacer que sea escribible)
	public void setName(String name)
	{
		this.name=name;
	}
////////////////////////////////////////////////	
	//Getter del parametro age (hacer que sea leible)
	public int getAge()
	{
		return age;
	}
	//Setter del parametro age (hacer que sea escribible)	
	public void setAge(int age)
	{
		this.age=age;
	}
	
//////////////////////////////////////////////////	
	//ToString method
	public String ToString()
	{
		return "Id "+id+" Name: "+name+" Age: "+age ;
	}

}
