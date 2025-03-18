/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author dbrod
 */
public interface QueueInterface<T> {
    //Adding an element to the queue
    void enqueue(T element);

    //Removing and returning the front element of the queue
    T dequeue();

    //Returning the size of the queue
    int size();

    //Checking if the queue is empty
    boolean isEmpty();

    //Returning a string representation of the queue
    String printQueue();
}
