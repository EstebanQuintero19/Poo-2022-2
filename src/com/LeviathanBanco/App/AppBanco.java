package com.LeviathanBanco.App;

import com.LeviathanBanco.Dominio.CuentaBancaria;
import com.LeviathanBanco.Dominio.Persona;

public class AppBanco {
    public static void main(String[] args) {
        Persona alfredo = new Persona("Alfredo");
        Persona viviana = new Persona("viviana", 123);


        CuentaBancaria cuentaAlfredo = new CuentaBancaria(alfredo, "ahorros", 47853);
        CuentaBancaria cuentaViviana = new CuentaBancaria(viviana, "ahorros", 78790);

        cuentaAlfredo.consignar(100000);
        cuentaAlfredo.retirar(50000);
        cuentaAlfredo.transferir(cuentaViviana, 45000);

        System.out.println(cuentaAlfredo.consultarSaldoActual());
        System.out.println(cuentaViviana.consultarSaldoActual());
    }
}
