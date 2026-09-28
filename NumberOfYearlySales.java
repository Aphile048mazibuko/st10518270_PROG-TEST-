/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberofyearlysales;

/**
 *
 * @author mnqob
 */
public class NumberOfYearlySales {
    
    public static void main(String[] args) {

        // One-dimensional array for city names
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };

        // Two-dimensional array for sales
        // Columns: PS5, XBOX, SWITCH
        int[][] sales = {
            {1000, 2000, 3000},  // Cape Town
            {2000, 3000, 4000},  // Port Elizabeth
            {1500, 1100, 1200}   // Pretoria
        };

        // Display report heading
        System.out.println("==============================================");
        System.out.println("       NUMBER 1 ELECTRONICS CONSOLE REPORT");
        System.out.println("==============================================");
        System.out.printf("%-18s %-10s %-10s %-10s %-12s%n",
                "CITY", "PS5", "XBOX", "SWITCH", "TOTAL SALES");
        System.out.println("--------------------------------------------------------------");

        // Variables for highest sales
        int highestSales = 0;
        String highestCity = "";

        // Calculate and display totals
        for (int i = 0; i < cities.length; i++) {

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }

            System.out.printf("%-18s %-10d %-10d %-10d %-12d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2],
                    total);

            // Check for city with highest total sales
            if (total > highestSales) {
                highestSales = total;
                highestCity = cities[i];
            }
        }

        System.out.println("--------------------------------------------------------------");

        // Display city with the most sales
        System.out.println("City with the most gaming console sales: "
                + highestCity);
        System.out.println("Total sales: " + highestSales);

        System.out.println("==============================================");
    }
}

