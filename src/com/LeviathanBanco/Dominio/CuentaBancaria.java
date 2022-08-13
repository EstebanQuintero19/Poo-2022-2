package com.LeviathanBanco.Dominio;
//atributos. Deben ir primero.
public class CuentaBancaria {
    public Persona propietario;
    public String tipo;
    public int numero;
    public Banco clave;
    public double saldo;
    public boolean activa;

    //constructores

    public CuentaBancaria(Persona propietario, String tipo, int numero) {
        this.propietario = propietario;
        this.tipo = tipo;
        this.numero = numero;
        this.saldo = 0; //sobraría porque el valor por defecto de un double es 0.
        this.activa = true;
    }
//métodos
    public boolean consignar(double montoAConsignar) {
        if (this.activa) {//if (activa == true)
            if (montoAConsignar > 0) {
                this.saldo += montoAConsignar;
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public boolean retirar(double montoARetirar) {
        if (this.activa == true) {
            if (montoARetirar <= saldo && saldo > 0) {
                this.saldo -= montoARetirar;
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
    public String consultarSaldoActual() {
        return propietario.nombre + " Tu saldo actual es " + saldo;
    }

    public boolean transferir(CuentaBancaria destino, double monto) {
        boolean retiroBien = this.retirar(monto);

        if (retiroBien == true){
            boolean consignoBienADestino = destino.consignar(monto);
            if (consignoBienADestino) {
                return true;

            }else{
                this.saldo += monto;
                System.out.println("");
                return false;
            }
        }

        return false;
    }
}
