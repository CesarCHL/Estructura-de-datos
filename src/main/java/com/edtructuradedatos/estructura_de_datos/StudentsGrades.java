/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edtructuradedatos.estructura_de_datos;

/**
 *
 * @author cesar
 * Matricula : 12366
 * Fecha: 10/02/2025
 * 
 * La clase StudentsGrades proporciona métodos para calcular calificaciones y verificar asistencia.
 * 
 * Métodos:
 * - calculatePartialGrade: Calcula la calificación parcial de un estudiante basada en el examen y las tareas.
 * - calculateFinalGrade: Calcula la calificación final considerando tres parciales y un examen final.
 * - checkFailureByAbsences: Determina si un estudiante reprueba debido a demasiadas ausencias.
 * 
 * Variables:
 * - examScore, homeworkScore: Puntuaciones utilizadas para calcular la calificación parcial.
 * - firstPartial, secondPartial, thirdPartial: Calificaciones de los tres exámenes parciales.
 * - finalExam: Puntuación del examen final.
 * - totalHours: Total de horas de clase.
 * - absences: Número de ausencias del estudiante.
 */

public class StudentsGrades {
    public int calculatePartialGrade(double examScore, double homeworkScore) {
        return (int) Math.round(examScore * 0.7 + homeworkScore * 0.3);
    }

    public int calculateFinalGrade(double firstPartial, double secondPartial, double thirdPartial, double finalExam) {
        return (int) Math.round((((firstPartial + secondPartial + thirdPartial) / 3) * 0.5) + (finalExam * 0.5));
    }

    public String checkFailureByAbsences(int totalHours, int absences) {
        if (absences <= (totalHours * 0.10)) {
            return "Alumno ha excedido el limite de ausencias, causando reprobación automatica.";
        } else {
            return "Alumno cumple con las asistencias minimas";
        }
    }
}