package com.mitocode.ejercicio7.interfaces;

public class CuentaNegocio implements ICuenta {

	private double limitePrestamo;
	private String numeroCuenta;
	private String titular;
	private double saldo;
	
	
	
	
	public double getLimitePrestamo() {
		return limitePrestamo;
	}


	public void setLimitePrestamo(double limitePrestamo) {
		this.limitePrestamo = limitePrestamo;
	}


	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public CuentaNegocio(double limitePrestamo, String numeroCuenta, String titular, double saldo) {
		super();
		this.limitePrestamo = limitePrestamo;
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}


	public void prestamo(double monto) {
		if (monto <= limitePrestamo) {
			saldo = saldo - monto - 10.0;
//			Tambien es valida la siguiente forma
//			saldo -= monto - 10.0;
		}
	}
	

	@Override
	public String toString() {
		return "CuentaNegocio [limitePrestamo=" + limitePrestamo + ", NumeroCuenta=" + getNumeroCuenta()
				+ ", Titular=" + getTitular() + ", Saldo=" + getSaldo() + "]";
	}


	@Override
	public void retiro(double monto) {
		saldo-=monto +0.5;
		
	}


	@Override
	public void deposito(double monto) {
		saldo+=monto;
		
	}


	



	
}
