package com.mitocode.ejercicio8.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese numerador: ");
		int numerador = sc.nextInt();
		
		System.out.println("Ingrese denominador: ");
		int denominador = sc.nextInt();
//		
//		try {
//			int denominador = sc.nextInt();
//			int resultado = numerador / denominador;
//			System.out.println("Resultado: " + resultado);
//		} catch (ArithmeticException e) {
//			System.out.println("cero es un denominador invalido");
//		}catch( InputMismatchException e) {
//			System.out.println("error denominador incorrecto");
//		}finally {
//			System.out.println("se ejecuta siempre");
//		}
//		
		int resultado = dividir (numerador, denominador);
		System.out.println("resultado: "+ resultado);
		sc.close();

	}
		public static int dividir (int numerador, int denominador) {
			try {
				return numerador/denominador;
			} catch (Exception e) {
				System.out.println("cero es un denominador invalido");
				return -1;
			}finally {
				System.out.println("finnaly siempre");
			}
			
		}
	public static int dividir2(int numerador, int denominador ) throws ArithmeticException{
		return numerador/denominador;
	}
}
