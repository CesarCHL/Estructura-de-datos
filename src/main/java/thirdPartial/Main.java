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
        
//        LinkedList
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("List:");
        list.display();

        System.out.println("Is 20 in the list? " + list.search(20));

        list.delete(20);

        System.out.println("After deleting 20:");
        list.display();
        
//        Double Linked List
        DoubleLinkedList lista = new DoubleLinkedList();
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);
        lista.agregarAlInicio(5);

        lista.mostrarAdelante();   
        lista.mostrarAtras();      

        lista.eliminar(20);        
        lista.mostrarAdelante();   
        
//        Circular List
        CircularList clist = new CircularList();
        clist.agregar(1);
        clist.agregar(2);
        clist.agregar(3);
        clist.agregar(4);

        clist.mostrar();
        
//        Binary Tree
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();

        System.out.println(tree.search(60));
        System.out.println(tree.search(25));
        
//        Graph
        Graph graph = new Graph();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        graph.display();
    }
}
    

