package thirdPartial;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cesar
 */
public class Main {
    public static void main(String[] args) {
//        Stack
        Stack stack = new Stack(5);  

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Elemento en la cima: " + stack.peek());  
        System.out.println("Elemento eliminado: " + stack.pop());    
        System.out.println("Elemento en la cima ahora: " + stack.peek());
        
//        Queue
        Queue queue = new Queue(5);  
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Elemento al frente: " + queue.peek());  
        System.out.println("Elemento eliminado: " + queue.dequeue());  
        System.out.println("Nuevo frente: " + queue.peek());  
    }
}
