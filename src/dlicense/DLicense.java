/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dlicense;

import java.util.Scanner;
/**
 *
 * @author rkaune
 */
public class DLicense {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration area
        Scanner keyedInput = new Scanner(System.in);
        int age;
        final int LICENSE_AGE = 16;
        // prompt the user for their age
        System.out.print("Enter your age ");
        age = keyedInput.nextInt();
        // decision making section
        if (age==LICENSE_AGE){
            System.out.println("You are old enough to get a license!");
        }
        else {
            System.out.println("You are not old enough to get a license");
        }
    }
    
}
