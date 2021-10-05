/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coreconcepts.basic;

import java.util.Scanner;



public class Bai1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2==0){
            sumSoChan(n);
        }else{
            sumSoLe(n);
        }
        
        
    }
     public static void sumSoLe(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
         System.out.println("sum"+ sum);
     
     }

    public static void sumSoChan(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;

        }
        System.out.println("sum"+ sum);
        
    }

    //bai1b
    public static void sumSTN(int n) {
        float sum = 0;
        for (int i = 1; i < n / 2; i++) {
            sum += 1 / i;

        }
        System.out.println("sum"+ sum);
       
    }
        
    }
    
 
    

