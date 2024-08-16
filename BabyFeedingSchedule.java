/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qtn_4;



/**
 *
 * @author HP
 */
public class BabyFeedingSchedule {
    public static void main(String[] args) {
        double porridgeCups = 2 * 4; 
        double milkCups = 2 * 2;
        double porridgeTime = porridgeCups * 45; 
        double milkTime = milkCups * 30; 
        double totalTime = porridgeTime + milkTime;
        System.out.println("The baby will take " + totalTime + " minutes to finish both the porridge and milk.");
    }
}
