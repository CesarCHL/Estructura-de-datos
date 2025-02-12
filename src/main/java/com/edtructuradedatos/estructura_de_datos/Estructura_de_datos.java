/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.edtructuradedatos.estructura_de_datos;


/**
 *
 * @author cesar
 */
public class Estructura_de_datos {

    public static void main(String[] args) {
        UserData objUserData = new UserData();
        String fullName = objUserData.fullName("Cesar", "Chavira");
        System.out.println(fullName);
        
        StudentsGrades objPartialGrade = new StudentsGrades();
        
        double partialGrade = objPartialGrade.calculatePartialGrade(85, 90);
        double finalGrade = objPartialGrade.calculateFinalGrade(80, 75, 90, 85);
        String assistance = objPartialGrade.checkFailureByAbsences(64, 7);

        System.out.printf("Calificacion del parcial: %d%n", (int) partialGrade);
        System.out.printf("Calificacion final del semestre: %d%n", (int) finalGrade);
        System.out.println(assistance);
        
     
    }
}
