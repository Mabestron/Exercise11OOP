package com.Excersice11OOP.app;
import com.Excersice11OOP.model.Cat;
import com.Excersice11OOP.model.Angora;
//import com.Excersice11OOP.model.Persa;

public class Catapp 
{

	public static void main(String[] args) 
	{
		Cat michi= new Cat();
		
		//se asignan los valores mendiante los getters y setters creados
		michi.setId(1);
		michi.setName("Michi");
		michi.setAge(3);
		
		//mostrar de manera individual los parametros
		//System.out.println("El id del michi es:"+michi.getId());
		//System.out.println("El nombre del gato es:"+michi.getName());
		//System.out.println("El id del michi es:"+michi.getAge());
		
		//Mostrar los valores con el metodo ToString creado en la app CAT
		System.out.println(michi.ToString());
		
		
		//se asigan los valores a Angora que son heredados de GATO
		Angora tom = new Angora(2,"Tom",4,3);
		System.out.println(tom.ToString());
		
	}

}
