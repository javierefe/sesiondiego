package com.mitocode.ejercicio6.enums;

public class CuentaAhorros extends Cuenta {

	private double tasaInteres;

	public CuentaAhorros() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CuentaAhorros(String numeroCuenta, String titular, double saldo, double tasaInteres) {
		super(numeroCuenta, titular, saldo);
		// TODO Auto-generated constructor stub
		this.tasaInteres = tasaInteres;
	}

	public double getTasaInteres() {
		return tasaInteres;
	}
	
	public void actualizarSaldo()	{
		saldo += saldo * tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	@Override
	public void retiro(double monto) {
		// TODO Auto-generated method stub
//		saldo -= monto;
		saldo = saldo - monto;
	}
	
	

}
