/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal34;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
         Scanner in  = new Scanner(System.in);
         System.out.println("Masukan Angka :");
        int n = in.nextInt();

        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n+1; j++) {
                if (Math.abs(i) + Math.abs(j) <= n) System.out.print("* ");
                else                                System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
