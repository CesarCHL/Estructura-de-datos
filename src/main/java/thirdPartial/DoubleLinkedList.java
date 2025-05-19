/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdPartial;

/**
 *
 * @author cesar
 */
class Nodo {
    int data;
    Nodo prev;
    Nodo next;

    // Constructor del nodo
    public Nodo(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoubleLinkedList {
    private Nodo head;
    private Nodo tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void agregarAlFinal(int data) {
        Nodo nuevoNodo = new Nodo(data);

        if (head == null) {
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            nuevoNodo.prev = tail;
            tail = nuevoNodo;
        }
    }

    public void agregarAlInicio(int data) {
        Nodo nuevoNodo = new Nodo(data);

        if (head == null) {
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            nuevoNodo.next = head;
            head.prev = nuevoNodo;
            head = nuevoNodo;
        }
    }

    public void eliminar(int data) {
        Nodo actual = head;

        while (actual != null) {
            if (actual.data == data) {
                if (actual.prev != null) {
                    actual.prev.next = actual.next;
                } else {
                    head = actual.next;
                }

                if (actual.next != null) {
                    actual.next.prev = actual.prev;
                } else {
                    tail = actual.prev;
                }

                System.out.println("Nodo con valor " + data + " eliminado.");
                return;
            }
            actual = actual.next;
        }
        System.out.println("Nodo con valor " + data + " no encontrado.");
    }

    public void mostrarAdelante() {
        System.out.print("Lista (inicio → fin): ");
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.data + " ");
            actual = actual.next;
        }
        System.out.println();
    }

    public void mostrarAtras() {
        System.out.print("Lista (fin → inicio): ");
        Nodo actual = tail;
        while (actual != null) {
            System.out.print(actual.data + " ");
            actual = actual.prev;
        }
        System.out.println();
    }
}