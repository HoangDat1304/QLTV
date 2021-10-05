
package com.mycompany.coreconcepts.array;

import java.util.Scanner;

/**
 *
 * @author DAT
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 1;
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("moi nhap so thu"+i+"");
            a[i] = sc.nextInt();
        }
            
        
        
        for (int i = 0; i < n/2; i++) {
            if(a[i] != a[n-i-1]){
                dem = 0;
                break;
            
        }  
    }
        if(dem==1){
            System.out.println("mảng a k là mảng đối xứng");
        }else{
            System.out.println("mảng a là mảng đối xứng");
        }
    }
}
