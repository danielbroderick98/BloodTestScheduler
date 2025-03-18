/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author dbrod
 */
public class PriorityQueue<T extends Comparable<T>> implements PriorityQueueInterface<T>  {
    //The front of the queue node
    private Node<T> head;

    //A node class to show each element in the queue
    private static class Node<T> {
        //The person data stored in the node
        T data;
        //The pointer to the next node
        Node<T> next;

        //Constructor to create a new node with the data
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    //enqueue method adds an element to the queue
    @Override
    public void enqueue(T element) {
        //Creating a new node for the person
        Node<T> newNode = new Node<>(element);

        //If the queue is empty or person has higher priority than first person
        if (head == null || head.data.compareTo(element) > 0) {
            //New node points to old head
            newNode.next = head;
            //Updating the new node
            head = newNode;
        } else {
            //Going through the queue to find the correct position
            Node<T> current = head;
            while (current.next != null && current.next.data.compareTo(element) <= 0) {
                //Moving to the next node if priority is not greater
                current = current.next;
            }
            //Inserting person in the correct position
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    //Dequeue removes person from the highest priority element
    @Override
    public T dequeue() {
        if (head == null) {
            //If the queue is empty returning null
            return null;
        }
        //Getting data of the person at the front
        T data = head.data;
        
        //Moving the head to the next person in the queue
        head = head.next;
        
        //Returning the person who was deueued
        return data;
    }

    //printQueue prints the state of the queue
    @Override
    public String printQueue() {
        //Using string builder to show result
        StringBuilder sb = new StringBuilder();
        
        //Starting from the head of the queue
        Node<T> current = head;
        
        //Going through the queue and adding persons data to string builder
        while (current != null) {
            sb.append(current.data).append("\n");
            current = current.next;
        }
        //Returns the string builder
        return sb.toString();
    }
    
    //Size gets the size of the queue
    @Override
    public int size() {
        int size = 0;
        Node<T> current = head;

        //Going through the queue and counting the number of nodes
        while (current != null) {
            size++;
            current = current.next;
        }
        //Returning the size of the queue
        return size;
    }

    // Method to check if the queue is empty
    @Override
    public boolean isEmpty() {
        return head == null;  // The queue is empty if the head is null
    }
}
