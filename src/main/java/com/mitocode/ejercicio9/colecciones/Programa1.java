package com.mitocode.ejercicio9.colecciones;

public class Programa1 {
public static void main(String[] args) {
	Integer[] lista = new Integer[10];
	lista[0] = 5; // automaticamente el tipo primitivo lo convierte a integer Unboxing
	int valor = lista[0]; // toma el valor Integer y lo convierte a in Boxing
	System.out.println(valor == lista[0]);
}
}
