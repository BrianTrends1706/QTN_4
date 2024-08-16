/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qtn_4;


/**
 *
 * @author HP
 */
public class TelecomBilling {
  public static void main(String[] args) {
    int initialLoad = 10000;
    int billingCharge = (int) (initialLoad * 0.10);
    int callDurationInSeconds = 5 * 60;
    int callCost = callDurationInSeconds * 200;
    int totalCost = billingCharge + callCost;
    int remainingBalance = initialLoad - totalCost;

    System.out.println("Remaining balance: UGX " + remainingBalance);
  }
}
