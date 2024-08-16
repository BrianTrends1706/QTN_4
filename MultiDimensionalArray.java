/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qtn_4;



/**
 *
 * @author HP
 */
 public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] my2DArray = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("Multi-dimensional array elements are:");
        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}