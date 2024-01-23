/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package furniture_sale_ordering_management_system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Workstation
 */
public class ProductStatusUpdater implements Runnable {
    private String saleID;

    public ProductStatusUpdater(String saleID) {
        this.saleID = saleID;
    }

    @Override
    public void run() {
        // Simulate the progression of product status
        simulateProductStatusProgression(saleID);
    }

    private void simulateProductStatusProgression(String saleID) {
        // Simulate each status (Assembly, Testing, Quality Check, Closed Sale) with a delay
        simulateStatus(saleID, "Assembly,", 3000);
        simulateStatus(saleID, "Testing,", 3000);
        simulateStatus(saleID, "Quality Check,", 3000);
        simulateStatus(saleID, "Closed Sale,", 3000);
    }

    private void simulateStatus(String saleID, String status, int delay) {
        // Simulate the delay
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Update the status of the sale to the simulated status
        updateStatusForSale(saleID, status);
    }

private void updateStatusForSale(String saleID, String newStatus) {
    // Read the existing data from the Sales_Quotation.txt file
    List<String> lines = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader("Data/Sales_Quotation.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
        // Handle file reading error
    }

    // Update the status for the sale in the lines list
    boolean foundSale = false;
    for (int i = 0; i < lines.size(); i++) {
        if (lines.get(i).startsWith("ID: " + saleID)) {
            foundSale = true;
            // Update the status line
            int statusIndex = i + 11; // Assuming status is 11 lines after ID
            lines.set(statusIndex, "Status: " + newStatus);
            break;
        }
    }

    // Save the updated data back to the Sales_Quotation.txt file
    if (foundSale) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data/Sales_Quotation.txt"))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle file writing error
        }
    } else {
        System.err.println("Error: Sale ID not found in the file.");
    }
}
}

