/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author dbrod
 */
//Using Comparable<T> to compare elements
public interface PriorityQueueInterface<T extends Comparable<T>> {
    //Adding an element to the queue with its priority determined by compareTo
    void enqueue(T element);
    
    //Returning the number of elements in the queue
    int size();
    
    //Checking if the queue is empty
    boolean isEmpty();
    
    //Removing and returning the highest-priority element
    T dequeue();
    
    //Printing the current state of the queue (could use toString as an alternative)
    String printQueue();
}
