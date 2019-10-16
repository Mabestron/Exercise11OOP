package com.Excersice11OOP.model;

public class Angora extends Cat{
	
	//propiedades UNICAS de Angora
	private double mouthLong;
	
	
	//Clase (constructor NO Parametrizado)
	public Angora()
	{
		
	}
	
	//Clase (constructor Parametrizado)
	public Angora (int id,String name,int age, double mouthLong)
	{
		super(id,name,age);
		this.mouthLong=mouthLong;
	}
	
	//Getters and Setters
	public double getMouthLong()
	{
		return mouthLong;
	}
	
	public void setMouthLong(double mouthLong)
	{
		this.mouthLong=mouthLong;
	}
	
	//ToString metodo especifico para la clase de Angora
	
	@Override
	public String ToString()
	{
		return "Id "+getId()+" Name: "+getName()+" Age: "+getAge()+" Cara: "+getMouthLong();
	}
	
}
