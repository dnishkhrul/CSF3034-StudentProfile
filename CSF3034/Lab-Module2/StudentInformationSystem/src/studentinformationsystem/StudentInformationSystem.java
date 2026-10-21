/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author USER
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        int mark1 = 60;
        int mark2 = 35;
        int total = mark1 +mark2;
        
        System.out.println("Name: Danish");
        System.out.println("ID : S87233");
        System.out.println("Mark K1:" +mark1);
        System.out.println("Mark K2:" +mark2);
        System.out.println("Total mark:" +total);
        
        if(total>=80){
            System.out.println("Excellent");
    } else if (total>=50){
        System.out.println("Good");
    } else 
        System.out.println("Need more improvement");
    
    }
    
}
