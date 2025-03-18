/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author dbrod
 */
public class Queue<T> implements QueueInterface<T> {
    //Pointing to front of the queue
    private Node<T> front;
    //Pointing to the rear of the queue
    private Node<T> rear;
    //Storing the size of the queue
    private int size;

    //Node class to represent each element in the queue
    private static class Node<T> {
        //Data of the element
        T data;
        //Reference to the node in the queue
        Node<T> next;

        //Constructor to initialize the node with data
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    //Contructor to initialize empty queue
    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    //Adds element to the rear of the queue
    @Override
    public void enqueue(T element) {
        //Create a new node to hold element
        Node<T> newNode = new Node<>(element);
        
        //If the queue is empty, both front and rear will point to the new node
        if (rear == null) {
            front = rear = newNode;
        } else {
            //If the queue is not empty, add the new node at the rear
            rear.next = newNode;
            rear = newNode;
        }
        //Increasing the size of the queue
        size++;
    }

    //Removes and returns the front element of the queue
    @Override
    public T dequeue() {
        //If the queue is empty it will throw an exception
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        
        //Retrieves data from the front node
        T data = front.data;
        
        //Moves the pointer to the next node
        front = front.next;
        
        //If the front becomes null, set rear to null
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //Returns a string of the queue
    @Override
    public String printQueue() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = front;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }
}
