/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edtructuradedatos.estructura_de_datos;

/**
 * @author cesar
 * Matricula: 12366
 * Fecha: 18/02/2025
 * 
 * La clase NumberType proporciona un método para contar y clasificar números en un arreglo en tres categorías:
 * - Pares
 * - Impares
 * - Ceros
 * 
 * Método:
 * - evenOdd: Recibe un arreglo de números y calcula cuántos son pares, impares y ceros, luego imprime los resultados.
 * 
 * Variables:
 * - numbers: Arreglo que contiene los números que serán clasificados.
 * - even: Contador de números pares.
 * - odd: Contador de números impares.
 * - zero: Contador de ceros.
 */
public class NumberType {
    public void evenOdd() { 
        int[] numbers = {
            0, 2, 5, 8, 11, 14, 17, 20, 23, 26, 
        29, 32, 35, 38, 41, 44, 47, 50, 53, 56, 
        59, 62, 65, 68, 71, 74, 77, 80, 83, 86, 
        89, 92, 95, 98, 0, 3, 6, 9, 12, 15, 
        18, 21, 24, 27, 30, 33, 36, 39, 42, 45
        };

        int even = 0;
        int odd = 0;
        int zero = 0;

        for (int number : numbers) { 
            if (number == 0) {
                zero++;
            } else if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Total de números pares: " + even);
        System.out.println("Total de números impares: " + odd);
        System.out.println("Total de ceros: " + zero);
    }
}