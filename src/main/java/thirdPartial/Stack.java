/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdPartial;

/**
 *
 * @author cesar
 */
public class Stack {
    private int[] items;
    private int top;
    private int maxSize;

    public Stack(int size) {
        maxSize = size;
        items = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack overflow");
            return;
        }
        items[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return items[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
