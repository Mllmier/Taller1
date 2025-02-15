/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_1;

/**
 *
 * @author Maria liz
 */
public class CuentaBancaria {
  
    String numeroCuenta;
    String tipoCuenta;
    int saldo;
    public CuentaBancaria(){
        this.numeroCuenta="1234567890";
        this.tipoCuenta="ahorro";
        this.saldo=4578;
           
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    public CuentaBancaria(String numeroCuenta,String tipoCuenta){
      this.numeroCuenta=numeroCuenta;
      this.tipoCuenta=tipoCuenta;
       
    }

    @Override
    public String toString() {
        return "CuentaBanco: " + "\nnumeroCuenta: " + numeroCuenta + " '\ntipoCuenta: " + tipoCuenta + "\n saldo: " + saldo;
    }
    
}

    

