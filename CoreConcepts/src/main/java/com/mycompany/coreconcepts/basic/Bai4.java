
package com.mycompany.coreconcepts.basic;

import java.util.Scanner;

/**
 *
 * @author DAT
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap a :");
        int a = sc.nextInt();
        System.out.println("moi nhap b :");
        int b = sc.nextInt();
        
        for(int i= a ; i<=a ; i++){
            for(int j = a+1 ; j<=b ; j++){
                if(UCLN(i,j) == 1){
                    System.out.printf( i+ " " +j);
                    
                }
            }
        }
                }
    private static int UCLN(int a , int b){
        while(a != b){
            if(a>b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }
}
