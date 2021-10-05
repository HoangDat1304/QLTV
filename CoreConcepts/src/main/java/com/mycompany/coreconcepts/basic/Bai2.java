/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coreconcepts.basic;

import java.util.Scanner;


public class Bai2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                dem++;
                System.out.println("uoc la :" + n);
            }
        }
    
     }
     
    }
    
    

