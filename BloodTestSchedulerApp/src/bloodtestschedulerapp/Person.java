/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author dbrod
 */
public class Person implements Comparable<Person>{
    //Creating variables for the patients
    String name;
    String priority;
    String gpDetails;
    int age;
    boolean fromWard;
    
    //Overloaded constructor
    public Person(String name, String priority, String gpDetails, int age, boolean fromWard) {
        this.name = name;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.age = age;
        this.fromWard = fromWard;
    }
    
    //Getters
    public String getName(){ 
        return name; 
    }
    public String getPriority(){ 
        return priority; 
    }
    public String getGpDetails(){ 
        return gpDetails; 
    }
    public int getAge(){ 
        return age; 
    }
    public boolean getFromWard(){ 
        return fromWard; 
    }
    
    //Setters
    public void setName(String name){ 
        this.name = name; 
    }
    public void setPriority(String priority){ 
        this.priority = priority; 
    }
    public void setGpDetails(String gpDetails){ 
        this.gpDetails = gpDetails; 
    }
    public void setAge(int age){ 
        this.age = age; 
    }
    public void setFromWard(boolean fromWard){ 
        this.fromWard = fromWard; 
    }
    
    //Overriding the compareTo method to compare patients
    //Check priority by 1. Urgent, Medium, Low then 2. Hospital ward (Yes/No) then 3. Age
    @Override
    public int compareTo(Person other) {
        //Converting priority to numerical values (higher number = higher priority)
        int thisPriorityValue = getPriorityValue(this.priority);
        int otherPriorityValue = getPriorityValue(other.priority);

        //Comparing by priority first
        if (thisPriorityValue != otherPriorityValue) {
            return Integer.compare(otherPriorityValue, thisPriorityValue); // Higher priority first
        }

        //Comparing by hospital ward status (true > false)
        if (this.fromWard != other.fromWard) {
            return Boolean.compare(other.fromWard, this.fromWard); // true comes first
        }

        //Comparing by age (older first)
        return Integer.compare(other.age, this.age);
    }
    
    //Method to convert priority to numerical values
    private int getPriorityValue(String priority) {
        return switch (priority.toLowerCase()) {
            case "urgent" -> 3;
            case "medium" -> 2;
            case "low" -> 1;
            default -> 0;
            
        };
    }
   
    //Overriding the toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Priority: " + priority + ", Age: " + age + ", From Ward: " + fromWard;
    }
    
}
