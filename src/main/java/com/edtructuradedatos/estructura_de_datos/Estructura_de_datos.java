/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.edtructuradedatos.estructura_de_datos;
import java.util.Scanner;

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

        System.out.printf("Calificacion del parcial: %.2f%n", partialGrade);
        System.out.printf("Calificacion final del semestre: %.2f%n", finalGrade);
        System.out.println(assistance);
        
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Ingresa el radio del circulo: ");
        double radius = objScanner.nextDouble();
        
      
        Circle objArea = new Circle();
        double area = objArea.calculateArea(radius);
        System.out.printf("El área del círculo es: %.2f%n", area);
        
        System.out.println("Ingresa la calificacion de tu examen: ");
        double examen = objScanner.nextDouble();
        System.out.println("Ingresa tu promedio de tareas: ");
        double tareas = objScanner.nextDouble();
        
        GradeCalculationPartial objPartial = new GradeCalculationPartial();
        double partial = objPartial.examenParcial(examen, tareas);
        System.out.println("Calificacion final: "+ partial);
        objScanner.close();
        
        SalesWithDiscount objDiscount = new SalesWithDiscount();
        objDiscount.totalWithDiscount();
        
        NumberType objNumberType = new NumberType();
        objNumberType.evenOdd();
    }
}
