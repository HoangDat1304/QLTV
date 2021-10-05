
package com.mycompany.coreconcepts.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DAT
 */
public class Bai2 {
    public static void main(String[] args) {
        int mang[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++) {
            System.out.printf("nhap so phan tu cua mang" , (i+1));
            mang[i] = sc.nextInt();
            
        }
        System.out.println("phan tu cua mang la :" + Arrays.toString(mang));
        Arrays.sort(mang);
        System.out.println("phan tu mang khi sap xep la :" +Arrays.toString(mang));
    }
    
}
