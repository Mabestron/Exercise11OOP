package com.Excersice11OOP.model;

public class Perro 
{
	public int idperrito;
	private String name;
	protected String breed;// raza
	public int age;
	public double height;
	
	//Constructor 
	public Perro (int idperrito, String name, String breed, int age, double height)
	{
		//se igualan las variables locales del constructor con las globales de la clase
		this.idperrito=idperrito;
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.height=height;
	}
	
	//Constructor vacio
	public Perro() 
	{
		
	}
	
	//constructor solo para dos parametros
	public Perro(int idperrito, String name) 
	{
		this.idperrito=idperrito;
		this.name =name;
	}
	
	
}
