
package stack.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;


public class StackQueue {

    public static void main(String[] args) {
        //Instanciating both stack and queue
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue= new ArrayDeque<>(); //Or linkedList<>();
        
        //adding elements to a stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        //adding elements to a queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        
        System.out.println("This is the front element: "+queue.peek());//Visualizing first element added, in this case 1
        System.out.println("This is the top element: "+stack.peek());//Visualazing last element added, in this case 4
        
        //FIFO: First In, First out, in a queue this method will get rid of our first element, in this case 1
        queue.poll();
        //LIFO: Last In, Last out, in a stack this method will get rid of our last element, in this case 4
        stack.pop();
        
        System.out.println("-----STACK AND QUEUE UPDATED-----");
        System.out.println("This is the front element: "+queue.peek());//Visualizing first element added, in this case 2
        System.out.println("This is the top element: "+stack.peek());//Visualazing last element added, in this case 3
    }
    
}
