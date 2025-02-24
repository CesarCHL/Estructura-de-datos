/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edtructuradedatos.estructura_de_datos;

/**
 *
 * @author cesar
 */
public class SalesWithDiscount {
    public void totalWithDiscount(){
       double salessum = 0;
       double[] sales = {100.0, 200.0, 150.0};
        for (int i = 0; i < sales.length; i++) {
            double sale = sales[i] * .9;
            System.out.println(sale);   
            salessum += sale;
        }
        System.out.println("La sumatotal de ventas con el 10% de descuento es: "+ salessum);
    };
}
