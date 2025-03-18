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
        
        //Running the GUI to Display
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodTestGui().setVisible(true);
            }
        });
 
    }
    
}
