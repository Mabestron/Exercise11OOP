package com.Excersice11OOP.app;
import com.Excersice11OOP.model.Perro; //se importa las propiedades de la clase del archivo Perro.java
public class Perroapp {

	public static void main(String[] args) {
		
		//Way 1 create object
/////////////////////////////////////////////////////////////////////////////	
		//mandar a llamar constructor NO parametrizado
		
		Perro pluto; //reservo espacio de memoria
		pluto = new Perro(); //se instancia la clase
		
		//valores que tiene el constructor SIN parametros, es deir cero
		System.out.println("Pluto's age: "+pluto.age);
		System.out.println("Pluto's height: "+pluto.height);
		System.out.println("Pluto's ID: "+pluto.idperrito+"\n");
		
		//Way 2 create object
		// no se usará en este programa
		//Perro tribilin = new Perro();
		
		//se le asignan valores a los creados en la clase
		pluto.age =15;
		pluto.height=50;
		pluto.idperrito=10;
		
		System.out.println("Pluto's age: "+pluto.age);
		System.out.println("Pluto's height: "+pluto.height);
		System.out.println("Pluto's ID: "+pluto.idperrito+"\n");
		
		
		
/////////////////////////////////////////////////////////////////////////
		//mandar a llamar constructor parametrizado
		
		Perro firulais = new Perro(1,"Firulais","Labrador",5,60.0);
		System.out.println("Firulais's age: "+firulais.age);
		System.out.println("Firulais's height: "+firulais.height);
		System.out.println("Firulais's ID: "+firulais.idperrito);
	}

}
