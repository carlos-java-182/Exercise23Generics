package com.Exercise23generics.model;

public class Multi 
{
	public static <T> String MuestraTipoDato(T objeto)
	{
		return "Tipo de dato es:"+objeto.getClass()+
				"\n Nombre del parámetro"+objeto.getClass().getName()+
				"\n Valor del elemento:"+objeto;
	}

}