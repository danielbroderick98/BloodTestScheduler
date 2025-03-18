/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author dbrod
 */
public class BloodTestSchedulerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //*****Start testing the Priority Queue and Queue*****
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>();
        Queue<Person> allPatientsQueue = new Queue<>();

        //Creating a test patient
        Person patient1 = new Person("Alice", "Medium", "Dr. Smith", 40, true);

        //Test Adding to  the priority queue
        System.out.println("Testing Adding to Priority Queue...");
        priorityQueue.enqueue(patient1);
        System.out.println("Priority Queue Size: " + priorityQueue.size());

        //Test adding to the queue
        System.out.println("\nTesting Adding to All Patients Queue...");
        allPatientsQueue.enqueue(patient1);
        System.out.println("All Patients Queue Size: " + allPatientsQueue.size());

        //Test removing from priority queue
        System.out.println("\nTesting Removing from Priority Queue...");
        priorityQueue.dequeue();
        System.out.println("Priority Queue Size: " + priorityQueue.size());

        //Test removing from queue
        System.out.println("\nTesting Removing from All Patients Queue...");
        allPatientsQueue.dequeue();
        System.out.println("All Patients Queue Size: " + allPatientsQueue.size());
        //*****End testing the Priority Queue and Queue*****
        
        //Running the GUI to Display
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodTestGui().setVisible(true);
            }
        });
 
    }
    
}
